/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorVehiculos_;

import clasePadre_.Vehiculos;
import clasesHijas.CamionCarga;
import clasesHijas.Camioneta;
import clasesHijas.Coche;
import clasesHijas.Microbus;
import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 8/07/2021
 *
 */
public class Parking {

    private Vehiculos[][] matriz;
    private int contador;

    public Parking(int fila, int columna) {
        matriz = new Vehiculos[fila][columna];
        this.contador = -1;
    }

    public Parking() {
        matriz = new Vehiculos[3][3];
        this.contador = -1;
    }

    //Metodo para rellenr valores
    public Vehiculos rellenar(int i) {
        int dia = 0;
        boolean bandera = false;
        Vehiculos v = null;
        String codigo_placa = JOptionPane.showInputDialog(null, "Introduce las placas del Vehiculo", "Introduciendo las placas del vehiculo", 1);
        do {
            dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce los dias que estara el vehiculo", "Introduciendo dias", 1));
            if (dia > 0) {
                bandera = true;
            } else {
                JOptionPane.showMessageDialog(null, "Introduce un valor valido", "Introduce un valor mayor a 0", 2);
            }
        } while (!bandera);
        if (i == 1) {//Coche
            int numAsientos = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de asientos del coche", "Introduciendo numero de asientos", 1));
            v = new Coche(numAsientos, codigo_placa, dia);
        } else if (i == 2) {//Microbus
            int asientosIndependientes = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de asientos Independientes", "Introduciendo numero de asientos Independientes", 1));
            v = new Microbus(asientosIndependientes, codigo_placa, dia);
        } else if (i == 3) {
            int toneladasCarga = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce Las toneladas del Camion", "Introduciendo Toneladas", 1));
            v = new CamionCarga(toneladasCarga, codigo_placa, dia);
        } else {//Camioneta
            v = new Camioneta(codigo_placa, dia);
        }

        return v;
    }

    //Metodo para agregar un Vehiculo
    public void addVehiculo(Vehiculos v) {
        boolean encontrado = false;
        for (int i = 0; i < matriz.length && !encontrado; i++) {
            for (int j = 0; j < matriz[0].length && !encontrado; j++) {
                if (matriz[i][j] == null) {
                    matriz[i][j] = v;
                    JOptionPane.showMessageDialog(null, "Vehiculo Agregado Correctamente", "Agregado", 1);
                    this.contador--;
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Error al intentar Agregar el vehiculo", "Error", 2);
        }

    }

    //Metodo para mostrar a los vehiculos
    public void mostrarVehiculos() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != null) {
                    System.out.print(matriz[i][j] + "||");
                }
            }
        }

    }

    //Metodo para mostrar a cada tipo de vehiculo
    public void mostrarSeccionVehiculo() {
        String coche = "";
        String microbus = "";
        String camion = "";
        String camioneta = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != null) {
                    if (matriz[i][j] instanceof Coche) {
                        coche = coche + "\n" + matriz[i][j] + "\n----------";
                    } else if (matriz[i][j] instanceof Microbus) {
                        microbus = microbus + "\n" + matriz[i][j] + "\n----------";

                    } else if (matriz[i][j] instanceof CamionCarga) {
                        camion = camion + "\n" + matriz[i][j] + "\n----------";

                    } else {
                        camioneta = camioneta + "\n" + matriz[i][j] + "\n----------";

                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, coche, "Informacion Coches", 1);
        JOptionPane.showMessageDialog(null, microbus, "Informacion Microbus", 1);
        JOptionPane.showMessageDialog(null, camion, "Informacion Camion", 1);
        JOptionPane.showMessageDialog(null, camioneta, "Informacion Camioneta", 1);

    }

    //Metodo para eliminar un vehiculo por id
    public void deleteVehiculo(int id) {
        boolean encontrado = false;
        for (int i = 0; i < matriz.length && !encontrado; i++) {
            for (int j = 0; j < matriz[0].length && !encontrado; j++) {
                if (matriz[i][j] != null && matriz[i][j].getId() == id) {
                    JOptionPane.showMessageDialog(null, "Vehiculo Eliminado: " + matriz[i][j].getCodigo_placa(), "Eliminado", 1);
                    matriz[i][j] = null;
                    this.contador--;
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se encontro el vehiculo ", "Error al eliminar", 0);
        }

    }

    //Metodo para comprobar si la lista esta vacia o llena y verificar si hay espacio
    public boolean noLlena() {
        return (contador != -1 || contador < matriz.length);
    }

}
