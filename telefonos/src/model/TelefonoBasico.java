package model;

public class TelefonoBasico extends LineaTelefonica{

    public TelefonoBasico(int min){
        super(min);
    }

    public int costTotal(int min, int aNadieLeInteresaEstO, int aNadieLeInteresaEstO2){
        int valorLlamada = min * LineaTelefonica.VALORLLAMADALOCAL; 
        return valorLlamada;
    }
    

}