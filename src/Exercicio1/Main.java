package Exercicio1;

public class Main {
    public static void main(String[] args) {
        ICarros Renault = new Renault(2019, 80.000,"vermelho", 4);
        ICarros Fiat = new Fiat(2006, 27.000, "prata", 4);
        ICarros Hyundai = new Hyundai(2010, 60.000, "azul", 4);

        System.out.println("CARRO RENAULT");
        System.out.println("Iniciando o motor...minha velocidade está em: " + Renault.velocidade);
        Renault.Acelerar();
        System.out.println("Acelerando...minha velocidade está em: " + Renault.velocidade);
        Renault.Frear();
        System.out.println("Freando... minha velocidade está em: "+ Renault.velocidade);
        System.out.println("-------------------------------------------------------------");

        System.out.println("CARRO FIAT");
        System.out.println("Iniciando o motor...minha velocidade está em: " + Fiat.velocidade);
        Fiat.Acelerar();
        System.out.println("Acelerando...minha velocidade está em: " + Fiat.velocidade);
        Fiat.Frear();
        System.out.println("Freando... minha velocidade está em: "+ Fiat.velocidade);
        System.out.println("-------------------------------------------------------------");

        System.out.println("CARRO HYNDAI");
        System.out.println("Iniciando o motor...minha velocidade está em: " + Hyundai.velocidade);
        Hyundai.Acelerar();
        System.out.println("Acelerando...minha velocidade está em: " + Hyundai.velocidade);
        Hyundai.Frear();
        System.out.println("Freando... minha velocidade está em: "+ Hyundai.velocidade);
    }
}