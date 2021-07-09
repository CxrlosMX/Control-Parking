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
public class Camioneta extends Vehiculos {

    public Camioneta(String codigo_placa, int dias) {
        super(codigo_placa, dias);
    }

    @Override
    public double precioFinal() {
        return (super.precioFinal() * 550);
    }

}
