package veiculo;

public class Carro implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("VRUMMMMMMMM");
    }

    @Override
    public void frear() {
        System.out.println("IHHHHHHHHHH");
    }

}
