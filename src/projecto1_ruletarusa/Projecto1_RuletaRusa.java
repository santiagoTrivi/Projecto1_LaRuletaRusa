/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projecto1_ruletarusa;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Carvajal-Triviño
 */
public class Projecto1_RuletaRusa {
    ListaJugadores jugador = new ListaJugadores();
    
    public Projecto1_RuletaRusa (){}
    
    public void registro() throws IOException{
        
        Scanner file = new Scanner(new File("jugadores.csv"));
            while(file.hasNextLine()){
                String [] datos;
                datos = file.nextLine().split(";");
                jugador.add(datos[0], datos[1], datos[2], datos[3]);
                
            }
     
        jugador.show();
    }
    
    public void ronda(){
    
    }
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
        Projecto1_RuletaRusa juego = new Projecto1_RuletaRusa ();
        juego.registro();
       
    }
    
}
