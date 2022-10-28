/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecto1_ruletarusa;

/**
 *
 * @author Carvajal-Triviño
 */
public class ListaJugadores {
    Nodo head;
    int counter;
        
    public ListaJugadores(){
        head = null;
        counter = 0;
    }
        
    public void add(String item0, String item1, String item2, String item3){
        Nodo newNode = new Nodo(item0, item1, item2, item3);
        if (head == null){ 
                head = newNode; 
        }else{
            Nodo aux = head;
            while (aux.next != null){
                aux = aux.next;
            }
            aux.next = newNode;
        }
        counter += 1;
            
    }
        
    public void show(){
        Nodo aux = head;
        while(aux != null){
            for (int i = 0; i < 10; i++) {
                System.out.print("-");
            }
            System.out.println("");
            System.out.println("Jugador N: "+ aux.numJugador);
            System.out.println("Nombre: "+ aux.nombre + " "+ aux.apellido);
            System.out.println("edad: "+ aux.edad);
            System.out.println("Partidas jugadas: " + aux.numPartidas);
            for (int i = 0; i < 10; i++) {
                System.out.print("-");
            }
            aux = aux.next;
        }
        
    }
    
    public void detele(String item1){
        Nodo aux = head;
        Nodo prev = null;
        while(!aux.nombre.equals(item1)){
            prev = aux;
            aux = aux.next;
        }
        prev.next = aux.next;
        counter -= 1;
    }
    
    public void lenght(){
        System.out.println(counter);
    }
    
    public void insert(int position, String item0, String item1, String item2, String item3){
        Nodo newNode = new Nodo(item0, item1, item2, item3);
        int counterPosition = 0;
        Nodo aux = head;
        Nodo prev = null;
        while (counterPosition < position ){
            counterPosition += 1;
            prev = aux;
            aux = aux.next;
        }
        prev.next = newNode;
        newNode.next = aux;
    }
    
}
