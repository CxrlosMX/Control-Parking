/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasePadre_;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 8/07/2021
 *
 */
public class Vehiculos {

    private String codigo_placa;
    private double alquiler;
    private int dias;
    private static int i=1;
    private int id;

    public Vehiculos(String codigo_placa, int dias) {
        id=i++;
        this.alquiler = 500;
        this.codigo_placa = codigo_placa;
        this.dias = dias;
    }

    public String getCodigo_placa() {
        return codigo_placa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public void setCodigo_placa(String codigo_placa) {
        this.codigo_placa = codigo_placa;
    }

    //Metodo para calcular el precio
    public double precioFinal() { //El alquiler es de 500$ por cada dia
        return (this.dias * this.alquiler);
    }

    @Override
    public String toString() {
        return "ID: "+id+"\nPlaca: " + codigo_placa;
    }

}
