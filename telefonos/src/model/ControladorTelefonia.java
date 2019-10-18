package model;

import java.util.ArrayList;

public class ControladorTelefonia{

    private ArrayList<LineaTelefonica> linea1;
    TelefonoBasico telefonoBasico = new TelefonoBasico();
    TelefonoCelular telefonoCelular = new TelefonoCelular();
    TelefonoVozIP telefonoVozIP = new TelefonoVozIP();
    



    public void createBasic(int min){
        LineaTelefonica linea0 = new TelefonoBasico(min);
        linea1.add(linea0);
        
    }

    public void createCelular(int min, int min2){
        LineaTelefonica linea0 = new TelefonoCelular(min, min2);
        linea1.add(linea0);

    }

    public void createVozIP(int min, int min2, int min3){
        LineaTelefonica linea0 = new TelefonoVozIP(min, min2, min3);
        linea1.add(linea0);
    }




    public String calcularInformationTotal()
    {

        String info = "";
        int min = 0;
        int min2 = 0;
        int min3 = 0;
        int veces = 0;
        int o ;
        for(int i =0; i<linea1.size();i++){
            if (linea1.get(i) instanceof TelefonoBasico){
                min += linea1.get(i).getMinutosDeLlamadaLocal();
                veces++;
            }
        }
        info = "Línea telefónica básica con "+ veces +"llamadas realizadas que corresponden a "+min+" minutos a llamadas locales y el valor es : "+telefonoBasico.costLamada(min, 0, 0)+"/n";

        for(int i =0; i<linea1.size();i++){
            if (linea1.get(i) instanceof TelefonoCelular){
                min += linea1.get(i).getMinutosDeLlamadaLocal();
                TelefonoCelular helper1 = (TelefonoCelular) linea1.get(i);
                min2 += helper1.getMinutosDeLlamadaCelular();
                veces++;
            }
        }
        info = info+"Línea telefónica celular con "+ veces +"llamadas realizadas que corresponden a "+min+" minutos a llamadas locales y "+min2+" minutos a celulares. y el valor es : "+telefonoCelular.costTotal(min, min2, 0)+"/n";

        for(int i =0; i<linea1.size();i++){
            if (linea1.get(i) instanceof TelefonoVozIP){
                min += linea1.get(i).getMinutosDeLlamadaLocal();
                TelefonoVozIP helper2 = (TelefonoVozIP) linea1.get(i);
                min2 += helper2.getMinutosDeLlamadaCelular();
                min3 += helper2.getMinutosDeLlamadaLargaDistancia();
                veces++;
            }
        }
        info = info+"Línea telefónica celular con "+ veces +"llamadas realizadas que corresponden a "+min+" minutos a llamadas locales, "+min3+" minutos a larga distancia y "+min2+" minutos a celulares. y el valor es : "+telefonoCelular.costTotal(min, min2, min3)+"/n";


        return info;
    }
    






}