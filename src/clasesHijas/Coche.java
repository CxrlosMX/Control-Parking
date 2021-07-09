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
public class Coche extends Vehiculos {

    private int numAsientos;

    public Coche(int numAsientos, String codigo_placa, int dias) {
        super(codigo_placa, dias);
        this.numAsientos = numAsientos;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    @Override
    public double precioFinal() {
        double p = this.numAsientos * 20;
        return (super.precioFinal() + p);
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumero de Asientos: " + numAsientos;
    }

}
