/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author PC-GSM15
 */
public class Principal {
    
    
    public static int indiceMenorTiempo(Atleta atletas[]){
        float tiempo;
        int indice = 0;
        
        tiempo = atletas[0].getTiempo();
        for(int i=1; i<atletas.length;i++){
            if(atletas[i].getTiempo() < tiempo){
                tiempo = atletas[i].getTiempo();
                indice = i;
            }
        }
        return indice;
    }
    
    
    
     public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        String nombre; 
        int numeroAtleta;
        float tiempo;
        int numeroAtletas, indiceMenorTiempo;
        
        System.out.print("Digite número de Atletas: ");
        numeroAtletas = entrada.nextInt();
        System.out.println("Digite tiempo en formato decimal, ejemplo: ");
        System.out.println("1 hora con 50 min -----> 1.50");
        
        //CREAMOS OBJETOS PARA ATLETA
        Atleta atletas[] = new Atleta[numeroAtletas];
        
         try {
           for(int i=0; i<atletas.length; i++){
            entrada.nextLine();
            System.out.println("\nDigite los datos del "+(i+1)+" Atleta: ");
            System.out.print("Introduzca Nombre: ");
            nombre = entrada.nextLine();
            System.out.print("Introduzca Numero del Atleta: ");
            numeroAtleta = entrada.nextInt();
            System.out.print("Introduzca el tiempo en el que finalizó: ");
            tiempo = entrada.nextFloat();
            
            //cada que el bucle termine, almacena los datos en un nuevo objeto 
            //con sus atributos
            atletas[i] = new Atleta(nombre, numeroAtleta, tiempo); 
        }
        } 
        catch (Exception e) {
            System.out.println("Error, verifique datos de entrada!");
            entrada.reset();
        }
        indiceMenorTiempo = indiceMenorTiempo(atletas);
        System.out.println("\nEl Atleta ganador es:");
        System.out.print(atletas[indiceMenorTiempo].MostrarDatos());
    }
}
