/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecto1_ruletarusa;

/**
 *
 * @author Carvajal-Triviño
 */
public class Nodo {
    String numJugador;
    String nombre;
    String apellido;
    String edad;
    int numPartidas = 0;
    boolean vivo = true;
    Nodo next = null;
        
    public Nodo(String numJ, String nombre, String apellido, String edad){
        this.numJugador = numJ;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }
}
