package src.bebidas;

import src.maquinasDeCafe.inventario.Precios;

public class Te {
    //Atributos
    private final int id;
    private static int contador = 0;
    private static int aguaNecesaria = 120;
    private static int teNecesario = 10;
    private static double precioClase = Precios.getPrecioTe();
    private final int azucarPedido;
    private final int cucharita;
    private final int aguaUsada;
    private final int teUsado;
    private final double precioObjeto;

    //Constructor
    public Te(int azucarPedido, int cucharita) {
        this.azucarPedido = azucarPedido;
        this.cucharita = cucharita;
        id = ++contador;
        aguaUsada = aguaNecesaria;
        teUsado = teNecesario;
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

    public static int getTeNecesario() {
        return teNecesario;
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

    public int getTeUsado() {
        return teUsado;
    }

    public double getPrecioObjeto() {
        return precioObjeto;
    }

    //Setters
    public static void setAguaNecesaria(int aguaNecesaria) {
        Te.aguaNecesaria = aguaNecesaria;
    }

    public static void setTeNecesario(int teNecesario) {
        Te.teNecesario = teNecesario;
    }

    //ToString
    @Override
    public String toString() {
        return String.format("""
                    Cantidad de cada ingrediente para el café largo con ID = %d:
                    Te utilizado: %d ml
                    Agua utilizada: %d ml
                    Azucar pedido: %d gr
                    Precio del te: %.2f
                    Uso de cucharita: %s
                """, id, teUsado, aguaUsada, azucarPedido, precioObjeto, (cucharita == 1) ? "Si" : "No");
    }
}
