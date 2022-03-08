/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author Alejandro
 */
public class PersonaServicio {
    
    public Persona crearPersona(){
        
        Persona p;
        String nombre= "Pepe";
        int dia=10;
        int mes=11;
        int anio=1998;
        Date fecNac;
        Scanner teclado = new Scanner (System.in).useDelimiter("\n");
        
        
//        System.out.print("Ingrese Nombre");
//        nombre=teclado.nextLine();
//        System.out.print("Ingrese Dia:");
//        dia=teclado.nextInt();
//        System.out.print("Ingrese Mes:");
//        mes=teclado.nextInt();
//        System.out.print("Ingrese Anio:");
//          anio=teclado.nextInt();     
        
        fecNac= new Date (anio - 1900, mes -1 , dia);
        p = new Persona(nombre, fecNac);
        
        return p;
    }
    
    public int calcularEdad(Persona p){
        Date fecAct= new Date();
        Date fecNac= p.getFecNac();
        
        return fecAct.getYear() - fecNac.getYear();
    }
    
    public boolean menorQue(Persona p, int edad){
        int edadP = calcularEdad(p);
        
        return edadP < edad;
    }
    
    public void mostrarPersona(Persona p){
        System.out.println(p);
    }
}
