package src.maquinasDeCafe.inventario;

public class Precios {
    //Atributos
    private static double precioCafeConLeche = 1.5;
    private static double precioCafeExpresso = 1;
    private static double precioCafeLargo = 1.2;
    private static double precioChocolate = 1.1;
    private static double precioTe = 1.1;

    //Getters y setters

    public static double getPrecioCafeExpresso() {
        return precioCafeExpresso;
    }

    public static void setPrecioCafeExpresso(double precioCafeExpresso) {
        Precios.precioCafeExpresso = precioCafeExpresso;
    }

    public static double getPrecioCafeConLeche() {
        return precioCafeConLeche;
    }

    public static void setPrecioCafeConLeche(double precioCafeConLeche) {
        Precios.precioCafeConLeche = precioCafeConLeche;
    }

    public static double getPrecioCafeLargo() {
        return precioCafeLargo;
    }

    public static void setPrecioCafeLargo(double precioCafeLargo) {
        Precios.precioCafeLargo = precioCafeLargo;
    }

    public static double getPrecioChocolate() {
        return precioChocolate;
    }

    public static void setPrecioChocolate(double precioChocolate) {
        Precios.precioChocolate = precioChocolate;
    }

    public static double getPrecioTe() {
        return precioTe;
    }

    public static void setPrecioTe(double precioTe) {
        Precios.precioTe = precioTe;
    }
}
