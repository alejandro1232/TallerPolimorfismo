/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerpolimorfismo.modelo;

import co.unicauca.tallerpolimorfismo.modelo.Viaje;
import java.util.Date;

/**
 *
 * @author JR
 */
public class ViajeTodoIncluido extends Viaje {

    // Constructores 
   
    public ViajeTodoIncluido(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }

    @Override
    public String descripcion() {
        return "Disfruta tu viaje todo incluido";
    }
    //No se sobreescribe cualquierMetodo2()
}
