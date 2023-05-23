package Exercicio1;
public abstract class ICarros {
    protected String marca;
    protected int ano;
    protected double valor;
    protected String cor;
    protected int portas;
    protected int velocidade;
    public ICarros(String marca, int ano, double valor, String cor, int portas) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.cor = cor;
        this.portas = portas;
    }
    public void partidaMotor() {

    }
    public void Acelerar() {

    }
    public void Frear(){

    }
    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }

    public String getCor() {
        return cor;
    }

    public int getPortas() {
        return portas;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}


