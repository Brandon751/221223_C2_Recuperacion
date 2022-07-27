package com.upchiapas.models;
import java.util.Scanner;

public class Biblioteca {

    public Libro listaLibro [] = new Libro [5];
    public Libro aux;

    public void registrarLibro(){
        listaLibro [0] = new Libro(12345, "Libro1", "Epañol");
        listaLibro [1] = new Libro(54321, "Libro2", "Ciencias");
        listaLibro [2] = new Libro(15243, "Libro3", "Software");
        listaLibro [3] = new Libro(12435, "Libro4", "Mecatronica");
        listaLibro [4] = new Libro(52431, "Libro5", "Historia");
    }

    public void ordenarLibro(){
        for(int i=0; i < listaLibro.length; i++){
            for (int j=i+1; j < listaLibro.length; j++){
                if (listaLibro[i].getId() > listaLibro[j].getId()){
                    aux = listaLibro[i];
                    listaLibro[i] = listaLibro[j];
                    listaLibro[j] = aux;
                }
            }
        }
    }

    public void visualizarLibro(String categoria){
        boolean bandera = false;

        System.out.println("--------------------------------------------");
        for (int i=0; i<listaLibro.length; i++){
            if(categoria.equals(listaLibro[i].getCategoria())){
                bandera=true;
                System.out.println("Lbro encontrado");
                System.out.println("Nombre: " + listaLibro[i].getNombre());
                System.out.println("Id: " + listaLibro[i].getId());
                System.out.println("------------------------------------------------------");
            }
        }
        if (!bandera){
            System.out.println("No tenemos esa Categotia");
            System.out.println("La Categoria no se encuentra o Escribir correctamente la categoria");
            System.out.println("-------------------------------------------------------------------");
        }
    }

    public void buscarLibro(){
        String categoria;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la categoria: ");
        categoria = entrada.next();
        visualizarLibro(categoria);
    }

    public void ordenarMayoraMenor(){
        for(int i=0; i < listaLibro.length; i++){
            for (int j=i+1; j < listaLibro.length; j++){
                if (listaLibro[i].getId() < listaLibro[j].getId()){
                    aux = listaLibro[i];
                    listaLibro[i] = listaLibro[j];
                    listaLibro[j] = aux;
                }
            }
        }
    }

    public void consultaGeneral(){
        System.out.println("Libros ordenados de mayor a menor");
        for (int i=0; i< listaLibro.length; i++){
            System.out.println("Nombre: " + listaLibro[i].getNombre());
            System.out.println("Id: " + listaLibro[i].getId());
        }
    }

}
