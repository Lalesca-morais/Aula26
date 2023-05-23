package Exercicio1;
public class Renault extends ICarros {
    public Renault( int ano, double valor,String cor, int portas) {
        super ("Renault", 2019, 80.000, "vermelho", 4);
        this.velocidade = 0;
    }
    @Override
    public void partidaMotor() {
        velocidade = 0;
    }
    @Override
    public void Frear() {
            velocidade -= 5;
    }
    @Override
    public void Acelerar() {
            velocidade += 10;
    }
}