/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesHijas;

import clasePadre_.Vehiculos;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 8/07/2021
 * 
 */
public class Microbus extends Vehiculos{
    private int asientosIndependientes;

    public Microbus(int asientosIndependientes, String codigo_placa, int dias) {
        super(codigo_placa, dias);
        this.asientosIndependientes = asientosIndependientes;
    }

    public int getAsientosIndependientes() {
        return asientosIndependientes;
    }

    public void setAsientosIndependientes(int asientosIndependientes) {
        this.asientosIndependientes = asientosIndependientes;
    }

    @Override
    public double precioFinal() {
       double p = this.asientosIndependientes * 30;
        return (super.precioFinal() + p);
    }

    @Override
    public String toString() {
        return super.toString()+ "\nAsinetos Independientes: " + asientosIndependientes ;
    }
    
    
    
    

}
