package model;

public abstract class LineaTelefonica{
   
    private int minutosDeLlamadaLocal;

    public static final int VALORLLAMADALOCAL = 35;


    public abstract int costTotal();

    public LineaTelefonica(int min){
        
        this.minutosDeLlamadaLocal = min;
    }
    


    /**
     * @return the minutosDeLlamda
     */
    public int getMinutosDeLlamadaLocal() {
        return minutosDeLlamadaLocal;
    }
}