package Exercicio1;
public class Fiat extends ICarros {
    public Fiat(int ano, double valor,String cor, int portas) {
        super ("Fiat", 2006, 27.000, "prata", 4);
        this.velocidade = 0;
    }
    @Override
    public void partidaMotor() {
        velocidade = 3;
    }
    public void Frear() {
        velocidade -= 6;
    }
    public void Acelerar() {
        velocidade += 12;
    }
}
