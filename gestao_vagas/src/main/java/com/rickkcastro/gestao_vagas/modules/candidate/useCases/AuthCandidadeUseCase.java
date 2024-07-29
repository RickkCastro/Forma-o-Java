package com.rickkcastro.gestao_vagas.modules.candidate.useCases;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.rickkcastro.gestao_vagas.modules.candidate.CandidateRepository;
import com.rickkcastro.gestao_vagas.modules.candidate.dto.AuthCandidateReponseDTO;
import com.rickkcastro.gestao_vagas.modules.candidate.dto.AuthCandidateRequestDTO;

@Service
public class AuthCandidadeUseCase {

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Value("${security.token.secret.candidate}")
    private String secretKey;

    public AuthCandidateReponseDTO execte(AuthCandidateRequestDTO authCandidateRequestDTO)
            throws AuthenticationException {

        var candidate = this.candidateRepository.findByUsername(authCandidateRequestDTO.username())
                .orElseThrow(() -> {
                    throw new UsernameNotFoundException("Username/password incorrect");
                });

        // Verificar a senha
        var passwordMatches = this.passwordEncoder.matches(authCandidateRequestDTO.password(), candidate.getPassword());

        if (!passwordMatches) {
            throw new AuthenticationException();
        }

        Algorithm algorithm = Algorithm.HMAC256(secretKey);
        var expiresIn = Instant.now().plus(Duration.ofMinutes(10));

        var token = JWT.create()
                .withIssuer("Rickkcasto")
                .withSubject(candidate.getId().toString())
                .withExpiresAt(expiresIn)
                .withClaim("roles", Arrays.asList("candidate"))
                .sign(algorithm);

        var authCandidateReponseDTO = AuthCandidateReponseDTO.builder()
                .access_token(token)
                .expires_in(expiresIn.toEpochMilli())
                .build();

        return authCandidateReponseDTO;
    }
}
