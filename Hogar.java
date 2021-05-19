/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;


/**
*
* @author juanmartinezadell
*/
public class Hogar 
{

   
   public static void main(String[] args) 
   {	
	   /**Se crea el objeto cas1 al que se le pasan todos los atributos*/
     	
       Vivienda casa1 = new Vivienda(120000, 3, 120, true, "vendida", "Jose");
       
       /**Se imprime todos los atributos de casa1 mediante get*/
       System.out.println("Precio: " + casa1.getPrecio());
       System.out.println("Número de habitaciones: "+ casa1.getNumHabitaciones());
       System.out.println("Superficie en m2: " + casa1.getSuperficie());
       System.out.println("¿Dispone de parking?: " + casa1.isParking());
       System.out.println("Estado: "+ casa1.getEstado());
       System.out.println("Propietario: "+ casa1.getPropietario());
       
       /**Se imprime el precio actual de la vivienda pasandole el descuento que se le aplica como parametro*/
       System.out.println("El precio actual de la vivienda es " + casa1.actualizarPrecio(10000));
       
   }
   
}
