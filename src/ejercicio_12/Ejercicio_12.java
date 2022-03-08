/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_12;

import Entidades.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author Alejandro
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaServicio ps = new PersonaServicio();
        Persona p1=  ps.crearPersona();
        
        System.out.println(p1);
        
        System.out.println("Edad: "+ ps.calcularEdad(p1));
        
        System.out.println("La persona es menor de 26 años: " + ps.menorQue(p1, 26));
        
        ps.mostrarPersona(p1);
    }
    
}
