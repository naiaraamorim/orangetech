package edu.orange.metodos;

public class user {
    public static void main(String[] args) {
        metodoT smarTv = new metodoT();

        System.out.println("A TV está ligada? " + smarTv.ligada);
        System.out.println("Canal atual: " + smarTv.canal);
        System.out.println("Volume atual: " + smarTv.volume + "\n");

        smarTv.ligar();
        System.out.println("A TV está ligada? " + smarTv.ligada + "\n");

        smarTv.desligar();
        System.out.println("A TV está ligada? " + smarTv.ligada + "\n");

        smarTv.diminuirVolume();
        smarTv.diminuirVolume();

        smarTv.mudarCanal(13);
        System.out.println("Canal atual: " + smarTv.canal);
    }
}
