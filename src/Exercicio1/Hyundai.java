package Exercicio1;

public class Hyundai extends ICarros {
    public Hyundai(int ano, double valor, String cor, int portas) {
        super ("Hyundai", 2010, 60.000, "azul", 4);
        this.velocidade = 0;
    }
    @Override
    public void partidaMotor() {
        velocidade = 5;
    }
    public void Frear() {
        velocidade -= 2;
    }
    public void Acelerar() {
        velocidade += 15;
    }
}