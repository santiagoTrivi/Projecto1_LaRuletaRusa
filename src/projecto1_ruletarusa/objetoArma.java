/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecto1_ruletarusa;

/**
 *
 * @author Carvajal-Triviño
 */

class NodoTambor{
    boolean bulletposition;
    NodoTambor next;
    
    public NodoTambor(boolean bullet){
        this.bulletposition = bullet;
        this.next = null;
    }
}
public class objetoArma {
    NodoTambor head;
    
    public objetoArma(){
        this.head = null;
    }
    
    public void add(boolean bullet){
        NodoTambor newnodo = new NodoTambor(bullet);
        if (head == null){
            
        }
    }
}

