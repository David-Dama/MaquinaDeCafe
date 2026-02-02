package src.bebidas;

import src.maquinasDeCafe.inventario.Precios;
import src.utiles.utilidadesInterfaces.AlmacenVentas;

public class CafeConLeche {
    //Atributos
    private final int id;
    private static int contador = 0;
    private static int aguaNecesaria = 100;
    private static int cafeNecesario = 8;
    private static int lecheNecesaria = 12;
    private static double precioClase = Precios.getPrecioCafeConLeche();
    private final int azucarPedido;
    private final int cucharita;
    private final int aguaUsada;
    private final int cafeUsado;
    private final int lecheUsada;
    private final double precioObjeto;

    //Constructor
    public CafeConLeche(int azucarPedido, int cucharita) {
        this.azucarPedido = azucarPedido;
        this.cucharita = cucharita;
        id = ++contador;
        lecheUsada = lecheNecesaria;
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

    public static int getLecheNecesaria() {
        return lecheNecesaria;
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

    public int getLecheUsada() {
        return lecheUsada;
    }

    public double getPrecioObjeto() {
        return precioObjeto;
    }

    //Setters
    public static void setLecheNecesaria(int lecheNecesaria) {
        CafeConLeche.lecheNecesaria = lecheNecesaria;
    }

    public static void setCafeNecesario(int cafeNecesario) {
        CafeConLeche.cafeNecesario = cafeNecesario;
    }

    public static void setAguaNecesaria(int aguaNecesaria) {
        CafeConLeche.aguaNecesaria = aguaNecesaria;
    }

    //ToString
    @Override
    public String toString() {
        return String.format("""
                Cantidad de cada ingrediente para el café largo con ID = %d:
                    Cafe utilizado: %d gr
                    Leche utilizada: %d ml
                    Agua utilizada: %d ml
                    Azucar pedido: %d gr
                    Precio del café con leche: %.2f
                    Uso de cucharita: %s
                """, id, cafeUsado, lecheUsada, aguaUsada, azucarPedido, precioObjeto, (cucharita == 1) ? "Si" : "No");
    }
}
