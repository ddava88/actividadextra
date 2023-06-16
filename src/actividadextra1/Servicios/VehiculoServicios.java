/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadextra1.Servicios;

import actividadextra1.Entidad.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author XSF
 */
public class VehiculoServicios {

    public Vehiculo moverse() {
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Vehiculo();
        Vehiculo v3 = new Vehiculo();
        
        Scanner leer = new Scanner(System.in);
        double auto = 3;
        double moto = 2;
        double bici = 1;
        double metro=0;
        double segundos;
        
       
        System.out.println("Ingrese la marca del Vehiculo");
        v1.setMarca(leer.nextLine());
        System.out.println("Ingrese el año del Vehiculo");
        v1.setAmo(leer.nextInt());
        System.out.println("Ingrese el tipo del Vehiculo");
        //leer.next();
        v1.setTipo(leer.next());
        System.out.println("Ingrese la modelo del Vehiculo");
        // leer.next();
        v1.setModelo(leer.next());
        System.out.println("Ingrese el tiempo que avanzo el vehiculo en segundos");
        segundos = leer.nextInt();

        switch (v1.getTipo()) {
            case "Automovil":
                metro = auto * segundos;
           
                System.out.println("El vehiculo avanzo " + metro + " Metros");
              
                break;
            case "Motocicleta":
                metro = moto * segundos;
                System.out.println("El vehiculo avanzo " + metro + " metros");
               
                break;
            case "Bicicleta":
                metro = bici * segundos;
                System.out.println("El vehiculo avanzo " + metro + " metros");
              
                break;

            default:
                System.out.println("Vehiculo no valido");
                break;
        }
        
        v1.setMetros(metro);

        return v1;
    }

    public void frenar(Vehiculo v1) {
        double metrosFinales=0;
       
        
        switch (v1.getTipo()) {
            case "Automovil":
                metrosFinales = v1.getMetros()+2;
                System.out.println("El automovil se detuvo a los "+ metrosFinales);
                
                break;

            case "Motocicleta":
                metrosFinales = v1.getMetros()+2;
                System.out.println("El Motocicleta se detuvo a los "+ metrosFinales);
                
                break;
                
            case "Bicicleta":
                metrosFinales = v1.getMetros();
                System.out.println("El Bicicleta se detuvo a los "+ metrosFinales);
                
                break;
                
            default:
                
                break;
                

        }


    }
    
    public void mostrar(){
        
        System.out.println(" ");
    
        
    
    
    }
   
}
