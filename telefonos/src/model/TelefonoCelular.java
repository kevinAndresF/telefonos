package model;

public class TelefonoCelular extends LineaTelefonica{

    public static final int VALORLLAMADATCELULAR = 10;
    private int minutosDeLlamadaCelular;

    public TelefonoCelular(int min1, int min2){
        super(min1);
        this.minutosDeLlamadaCelular = min2;
    }



    public int costTotal(int min1, int min2, int aNadieLeInteresaEstO2){

        int valorTotal = (nim1 * LineaTelefonica.VALORLLAMADALOCAL) + (min2 * LineaTelefonica.VALORLLAMADATCELULAR);

        return valorTotal;
    }

    /**
     * @return the minutosDeLlamadaCelular
     */
    public int getMinutosDeLlamadaCelular() {
        return minutosDeLlamadaCelular;
    }



}