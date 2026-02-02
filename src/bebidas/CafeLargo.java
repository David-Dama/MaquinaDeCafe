package src.bebidas;

import src.Instalacion.Precios;

public class CafeLargo {
    //Atributos
    private final int id;
    private static int contador = 0;
    private static int aguaNecesaria = 35;
    private static int cafeNecesario = 7;
    private Precios precio;
    private final int azucarPedido;
    private final int cucharita;
    private final int aguaUsada;
    private final int cafeUsado;
    private final double precioObjeto;
    
    //Constructor
    public CafeLargo(int azucarPedido, int cucharita, Precios precio) {
        this.azucarPedido = azucarPedido;
        this.cucharita = cucharita;
        id = ++contador;
        cafeUsado = cafeNecesario;
        aguaUsada = aguaNecesaria;
        precioObjeto = precio.getPrecioCafeLargo();
    }
    
    //Getters
    public int getId() {
        return id;
    }
    
    public static int getContador() {
        return contador;
    }
    
    public static int getAguaNecesaria() {
        return aguaNecesaria;
    }
    
    public static int getCafeNecesario() {
        return cafeNecesario;
    }
    

    
    public int getAzucarPedido() {
        return azucarPedido;
    }
    
    public int isCucharita() {
        return cucharita;
    }
    
    public int getAguaUsada() {
        return aguaUsada;
    }
    
    public int getCafeUsado() {
        return cafeUsado;
    }
    
    public double getPrecioObjeto() {
        return precioObjeto;
    }
    
    //Setters
    public static void setAguaNecesaria(int aguaNecesaria) {
        CafeLargo.aguaNecesaria = aguaNecesaria;
    }
    
    public static void setCafeNecesario(int cafeNecesario) {
        CafeLargo.cafeNecesario = cafeNecesario;
    }
    
    //ToString
    @Override
    public String toString() {
        return String.format("""
            Cantidad de cada ingrediente para el café largo con ID = %d:
                Cafe utilizado: %d gr
                Agua utilizada: %d ml
                Azucar pedido: %d gr
                Precio del café largo: %.2f
                Uso de cucharita: %s
            """, id, cafeUsado, aguaUsada, azucarPedido, precioObjeto, (cucharita == 1) ? "Si" : "No");
    }
}