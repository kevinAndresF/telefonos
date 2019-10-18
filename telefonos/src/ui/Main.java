package ui;
import model.LineaTelefonica;
import model.TelefonoBasico;
import model.TelefonoCelular;
import model.TelefonoVozIP;
import java.util.Scanner;

public class Main{

    public void objectTest(){
        ControladorTelefonia objeto1 = new ControladorTelefonia();
        objeto1.createBasic(30);
        objeto1.createCelular(50, 120);
        objeto1.createVozIP(2, 37, 20);
    }

    public static void main(String [] args){

        Scanner reader  = new Scanner (System.in);

        int min;
        int min2;
        int min3;
        int electionCreate;
        int electionPasar;
        ControladorTelefonia objeto1 = new ControladorTelefonia();
        objectTest();

        do {


            System.out.printLine("Porfavor indique con un numero la opcion que desea realizar./n1.Crear llamada de telefono basico./n2.Crear llamada de telefono celular./n3.Crear llamada de telefono VozIP.");
            electionCreate = reader.nextInt();

            if(electionCreate == 1){
                
                System.out.printLine("porfavor ingrese los minutos que se llamo localmente: /n");
                min = reader.nextInt();
                objeto1.createBasic(min);               

            }
            if(electionCreate == 2){

                
                System.out.printLine("porfavor ingrese los minutos que se llamo localmente: /n");
                min = reader.nextInt();              

                System.out.printLine("porfavor ingrese los minutos que se llamo a el celular: /n");
                min2 = reader.nextInt();

                objeto1.createCelular(min, min2);
            }
            if(electionCreate == 1){
                
                System.out.printLine("porfavor ingrese los minutos que se llamo localmente: /n");
                min = reader.nextInt();

                System.out.printLine("porfavor ingrese los minutos que se llamo a el celular: /n");
                min2 = reader.nextInt();
                
                System.out.printLine("porfavor ingrese los minutos que se llamo a larga distancia: /n");
                min3 = reader.nextInt();

                objeto1.createVozIP(min, min2, min3);

            }






            System.out.printLine("Si desea seguir creando llamadas telefonicas porfavor elija./n0.Seguir creando llamadas./nOtro numero diferente del 0 para dejar de seguir creando llamadas");
            electionPasar = reader.nextInt();
        }while(electionPasar!=0);

        System.out.printLine("¿Desea que se muestre toda la informacion de la empresa?./n1.Si./n2.No");

        if(electionPasar == 1){

            System.out.printLine(objeto1.calcularInformationTotal()); 

        }

        System.out.printLine("gracias por usar esta aplicacion hecha por Kevin Andrés Fernández Noguera");


        
    }



}