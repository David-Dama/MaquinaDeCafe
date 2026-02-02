package src.bebidas;

import src.maquinasDeCafe.inventario.Precios;

public class CafeExpresso {
    //Atributos
    private final int id;
    private static int contador = 0;
    private static int aguaNecesaria = 35;
    private static int cafeNecesario = 7;
    private static double precioClase = Precios.getPrecioCafeExpresso();
    private final int azucarPedido;
    private final int cucharita;
    private final int aguaUsada;
    private final int cafeUsado;
    private final double precioObjeto;

    //Constructor
    public CafeExpresso(int cucharita, int azucarPedido) {
        this.cucharita = cucharita;
        this.azucarPedido = azucarPedido;
        id = ++contador;
        cafeUsado = cafeNecesario;
        aguaUsada = aguaNecesaria;
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

    public static int getCafeNecesario() {
        return cafeNecesario;
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

    public int getCafeUsado() {
        return cafeUsado;
    }

    public double getPrecioObjeto() {
        return precioObjeto;
    }

    //Setter
    public static void setAguaNecesaria(int aguaNecesaria) {
        CafeExpresso.aguaNecesaria = aguaNecesaria;
    }

    public static void setCafeNecesario(int cafeNecesario) {
        CafeExpresso.cafeNecesario = cafeNecesario;
    }

    //ToString
    @Override
    public String toString() {
        return String.format("""
                Cantidad de cada ingrediente para el café expresso con ID = %d:
                    Cafe utilizado: %d gr
                    Agua utilizada: %d ml
                    Azucar pedido: %d gr
                    Precio del café expresso: %.2f
                    Uso de cucharita: %s
                """, id, cafeUsado, aguaUsada, azucarPedido, precioObjeto, (cucharita == 1) ? "Si" : "No");
    }
}
