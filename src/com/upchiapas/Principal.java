package com.upchiapas;
import java.util.Scanner;
import com.upchiapas.models.Biblioteca;

public class Principal {
    private static Biblioteca bibliotecab = new Biblioteca();
    public static void main(String[] args) {
        bibliotecab.registrarLibro();
        int opc;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("----Biblioteca UPChiapas ----");
            System.out.println("1. Buscar libro");
            System.out.println("2. Consulta general");
            System.out.println("3. Salir");
            opc = teclado.nextInt();
            switch (opc){
                case 1:
                    bibliotecab.ordenarLibro();
                    bibliotecab.buscarLibro();
                    break;
                case 2:
                    bibliotecab.ordenarMayoraMenor();
                    bibliotecab.consultaGeneral();
                    break;
                default:
                    System.out.println("Nos vemos, Vuelve pronto a la Biblioteca UPChiapas");
                    break;
            }
        } while(opc != 3);


    }

}
