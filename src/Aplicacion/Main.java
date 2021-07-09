/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aplicacion;

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
public class Main {
    public static void main(String[] args) {
        Vehiculos v=new Vehiculos("WE45",2);
        Vehiculos a=new Vehiculos("AB78",3);
        
        System.out.println(v+"\n"+a);
        
    }

}
