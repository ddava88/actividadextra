/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadextra1;

import actividadextra1.Entidad.Vehiculo;
import actividadextra1.Servicios.VehiculoServicios;

/**
 *
 * @author XSF
 */
public class ActividadExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        VehiculoServicios vs = new VehiculoServicios();
        Vehiculo v1 = vs.moverse();
        vs.frenar(v1);
        Vehiculo v2 = vs.moverse();
        vs.frenar(v2);
        Vehiculo v3 = vs.moverse();
        vs.frenar(v3);

       
    }

}
