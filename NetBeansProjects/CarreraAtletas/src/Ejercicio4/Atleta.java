/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author PC-GSM15
 */
public class Atleta {
    private String nombre;
    private int numeroAtleta;
    private float tiempo;

    public Atleta(String nombre, int numeroAtleta, float tiempo) {
        this.nombre = nombre;
        this.numeroAtleta = numeroAtleta;
        this.tiempo = tiempo;
    }
    
    

    public float getTiempo() {
        return tiempo;
    }
    
    public String MostrarDatos(){
        return "Nombre: " +nombre+ "\nNumero de Atleta: "+numeroAtleta+"\nTiempo: "+tiempo+"\n"; 
    }
}

