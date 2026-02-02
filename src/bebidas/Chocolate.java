package src.bebidas;

import src.maquinasDeCafe.inventario.Precios;

public class Chocolate {
    //Atributos
    private final int id;
    private static int contador = 0;
    private static int aguaNecesaria = 120;
    private static int cacaoNecesario = 10;
    private static double precioClase = Precios.getPrecioChocolate();
    private final int azucarPedido;
    private final int cucharita;
    private final int aguaUsada;
    private final int cacaoUsado;
    private final double precioObjeto;

    //Constructor
    public Chocolate(int azucarPedido, int cucharita) {
        this.azucarPedido = azucarPedido;
        this.cucharita = cucharita;
        id = ++contador;
        aguaUsada = aguaNecesaria;
        cacaoUsado = cacaoNecesario;
        precioObjeto = precioClase;
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

    public static int getChocolateNecesario() {
        return cacaoNecesario;
    }

    public static double getPrecioClase() {
        return precioClase;
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

    public int getChocolateUsado() {
        return cacaoUsado;
    }

    public double getPrecioObjeto() {
        return precioObjeto;
    }

    //Setters

    public static void setAguaNecesaria(int aguaNecesaria) {
        Chocolate.aguaNecesaria = aguaNecesaria;
    }

    public static void setChocolateNecesario(int chocolateNecesario) {
        Chocolate.cacaoNecesario = chocolateNecesario;
    }

    //ToString
    @Override
    public String toString() {
        return String.format("""
                    Cantidad de cada ingrediente para el café largo con ID = %d:
                    Cacao utilizado: %d ml
                    Agua utilizada: %d ml
                    Azucar pedido: %d gr
                    Precio del chocolate: %.2f
                    Uso de cucharita: %s
                """, id, cacaoUsado, aguaUsada, azucarPedido, precioObjeto, (cucharita == 1) ? "Si" : "No");
    }
}