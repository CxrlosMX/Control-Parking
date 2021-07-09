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
public class CamionCarga extends Vehiculos {

    private int toneladasCarga;

    public CamionCarga(int toneladasCarga, String codigo_placa, int dias) {
        super(codigo_placa, dias);
        this.toneladasCarga = toneladasCarga;
    }

    public int getToneladasCarga() {
        return toneladasCarga;
    }

    public void setToneladasCarga(int toneladasCarga) {
        this.toneladasCarga = toneladasCarga;
    }

    @Override
    public double precioFinal() {
        double p = this.toneladasCarga * 30;
        return (super.precioFinal() * p);
    }

    @Override
    public String toString() {
        return super.toString() + "\nCarga Toneladas Maxima: " + toneladasCarga ;
    }
    
}
