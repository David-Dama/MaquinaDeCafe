package src.Instalacion;

import src.utiles.Utilidades;

import java.util.Arrays;

public class OpcionesAzucar {
    //Atributos
    private int[] azucar;
    private int tamanyoFuncionalidadAzucar;
    
    // Constructor: crea un array vacío según el tamaño que el usuario elija
    public OpcionesAzucar(int tamanyoFuncionalidadAzucar) {
        if (tamanyoFuncionalidadAzucar <= 0) {
            throw new IllegalArgumentException("El tamaño debe ser mayor que 0"); //Lanzamos excepción para no crear el objeto
        }
        this.tamanyoFuncionalidadAzucar = tamanyoFuncionalidadAzucar;
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
    
    public void setTamanyoFuncionalidadAzucar(int n){
        //Comprobamos que se pueda crear el array
        if (n <= 0){
            System.out.println("Tamaño invalido");
        }
        this.tamanyoFuncionalidadAzucar = n;
        
        //Creamos un nuevo array u lo asignamos al atributo de la clase
        this.azucar = new int[tamanyoFuncionalidadAzucar];
        
        this.rellenarArrayAzucar();
    }
    
    
}
