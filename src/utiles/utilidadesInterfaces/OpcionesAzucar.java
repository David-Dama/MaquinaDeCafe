package src.utiles.utilidadesInterfaces;

import src.utiles.Utilidades;

import java.util.Arrays;

public class OpcionesAzucar {
    //Atributos
    private int[] azucar;

    // Constructor: crea un array vacío según el tamaño que el usuario elija
    public OpcionesAzucar(int tamanyoFuncionalidadAzucar) {
        if (tamanyoFuncionalidadAzucar <= 0) {
            throw new IllegalArgumentException("El tamaño debe ser mayor que 0"); //Lanzamos excepcion para no crear el objeto
        }
        this.azucar = new int[tamanyoFuncionalidadAzucar];
    }

    //Getter
    public int[] getAzucar() {
        return azucar.clone(); //Esto evita que se pueda cambiar el array
    }

    //Metodos
    public void rellenarArrayAzucar() {
        //Rellenamos el array
        for (int i = 0; i < azucar.length; i++) {
            azucar[i] = Utilidades.pedirInt("Introduce el valor para la posición " + (i + 1) + ": ");
        }

        //Ordenamos el array
        Arrays.sort(azucar);
    }
}
