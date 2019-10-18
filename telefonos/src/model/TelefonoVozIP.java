package model;

public class TelefonoVozIP extends LineaTelefonica{

    public static final int VALORLLAMADATCELULAR = 7;
    public static final int VALORLLAMADATLARGADISTANCIA = 80;
    private int minutosDeLlamadaCelular;
    private int minutosDeLlamadaLargaDistancia;

    public TelefonoVozIP(int min1, int min2, int min3){
        super(min1);
        this.minutosDeLlamadaCelular = min2;
        this.minutosDeLlamadaLargaDistancia = min3;
    }

    public int costTotal(int min1, int min2, int min3){

        int valorTotal = (min1 * LineaTelefonica.VALORLLAMADALOCAL) + (min2 * LineaTelefonica.VALORLLAMADATCELULAR) + (min3 * LineaTelefonica.VALORLLAMADATLARGADISTANCIA);

        return valorTotal;
    }

    /**
     * @return the minutosDeLlamadaCelular
     */
    public int getMinutosDeLlamadaCelular() {
        return minutosDeLlamadaCelular;
    }

    /**
     * @return the minutosDeLlamadaLargaDistancia
     */
    public int getMinutosDeLlamadaLargaDistancia() {
        return minutosDeLlamadaLargaDistancia;
    }
  
}