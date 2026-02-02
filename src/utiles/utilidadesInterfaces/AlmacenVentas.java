package src.utiles.utilidadesInterfaces;

import src.bebidas.*;

public class AlmacenVentas {


    // Arrays iniciales de 1 posición

    private CafeConLeche[] ventasCafeConLeche = new CafeConLeche[1];
    private CafeExpresso[] ventasCafeExpresso = new CafeExpresso[1];
    private CafeLargo[] ventasCafeLargo = new CafeLargo[1];
    private Chocolate[] ventasChocolate = new Chocolate[1];
    private Te[] ventasTe = new Te[1];

    // Contadores

    private int contadorCafeConLeche = 0;
    private int contadorCafeExpresso = 0;
    private int contadorCafeLargo = 0;
    private int contadorChocolate = 0;
    private int contadorTe = 0;

    public AlmacenVentas() {
    }

    // Metodos para aumentar el array

    private void aumentarArrayCafeConLeche() {
        CafeConLeche[] nuevo = new CafeConLeche[ventasCafeConLeche.length + 1];
        System.arraycopy(ventasCafeConLeche, 0, nuevo, 0, ventasCafeConLeche.length);
        ventasCafeConLeche = nuevo;
    }

    private void aumentarArrayCafeExpresso() {
        CafeExpresso[] nuevo = new CafeExpresso[ventasCafeExpresso.length + 1];
        System.arraycopy(ventasCafeExpresso, 0, nuevo, 0, ventasCafeExpresso.length);
        ventasCafeExpresso = nuevo;
    }

    private void aumentarArrayCafeLargo() {
        CafeLargo[] nuevo = new CafeLargo[ventasCafeLargo.length + 1];
        System.arraycopy(ventasCafeLargo, 0, nuevo, 0, ventasCafeLargo.length);
        ventasCafeLargo = nuevo;
    }

    private void aumentarArrayChocolate() {
        Chocolate[] nuevo = new Chocolate[ventasChocolate.length + 1];
        System.arraycopy(ventasChocolate, 0, nuevo, 0, ventasChocolate.length);
        ventasChocolate = nuevo;
    }

    private void aumentarArrayTe() {
        Te[] nuevo = new Te[ventasTe.length + 1];
        System.arraycopy(ventasTe, 0, nuevo, 0, ventasTe.length);
        ventasTe = nuevo;
    }

    // Metodos para registrar ventas

    public void registrarVenta(CafeConLeche cafe) {
        if (contadorCafeConLeche >= ventasCafeConLeche.length) {
            aumentarArrayCafeConLeche();
        }
        ventasCafeConLeche[contadorCafeConLeche] = cafe;
        contadorCafeConLeche++;
    }

    public void registrarVenta(CafeExpresso cafe) {
        if (contadorCafeExpresso >= ventasCafeExpresso.length) {
            aumentarArrayCafeExpresso();
        }
        ventasCafeExpresso[contadorCafeExpresso] = cafe;
        contadorCafeExpresso++;
    }

    public void registrarVenta(CafeLargo cafe) {
        if (contadorCafeLargo >= ventasCafeLargo.length) {
            aumentarArrayCafeLargo();
        }
        ventasCafeLargo[contadorCafeLargo] = cafe;
        contadorCafeLargo++;
    }

    public void registrarVenta(Chocolate chocolate) {
        if (contadorChocolate >= ventasChocolate.length) {
            aumentarArrayChocolate();
        }
        ventasChocolate[contadorChocolate] = chocolate;
        contadorChocolate++;
    }

    public void registrarVenta(Te te) {
        if (contadorTe >= ventasTe.length) {
            aumentarArrayTe();
        }
        ventasTe[contadorTe] = te;
        contadorTe++;
    }

    //Metodos de consulta de los precios de cada objeto guardado en el array

    public double precioCafesConLecheVendidos() {
        double precioTotal = 0;

        for (CafeConLeche bebida : ventasCafeConLeche){
            precioTotal += precioTotal + bebida.getPrecioObjeto();
        }

        return precioTotal;
    }

    public double precioCafesExpressosVendidos() {
        double precioTotal = 0;

        for (CafeExpresso bebida : ventasCafeExpresso){
            precioTotal += precioTotal + bebida.getPrecioObjeto();
        }

        return precioTotal;
    }

    public double precioCafesLargosVendidos() {
        double precioTotal = 0;

        for (CafeLargo bebida : ventasCafeLargo){
            precioTotal += precioTotal + bebida.getPrecioObjeto();
        }

        return precioTotal;
    }

    public double precioTesVendidos() {
        double precioTotal = 0;

        for (Te bebida : ventasTe){
            precioTotal += precioTotal + bebida.getPrecioObjeto();
        }

        return precioTotal;
    }

    public double precioChocolatesVendidos() {
        double precioTotal = 0;

        for (Chocolate bebida : ventasChocolate){
            precioTotal += precioTotal + bebida.getPrecioObjeto();
        }

        return precioTotal;
    }

    // Metodos de consulta de los totales

    public int getTotalVentas() {
        return contadorCafeConLeche + contadorCafeExpresso + contadorCafeLargo +
                contadorChocolate + contadorTe;
    }

    public double getTotalPrecio() {
        return precioCafesExpressosVendidos() + precioCafesLargosVendidos() + precioCafesConLecheVendidos()
                + precioTesVendidos() + precioChocolatesVendidos();
    }

    public void mostrarResumen() {
        System.out.printf("""
                === RESUMEN DE VENTAS ===
                Café Expresso:  %d ventas - %.2f €
                Café Largo:     %d ventas - %.2f €
                Café con leche: %d ventas - %.2f €
                Té:             %d ventas - %.2f €
                Chocolate:      %d ventas - %.2f €
                TOTAL:          %d ventas - %.2f €
                """, contadorCafeExpresso, precioCafesExpressosVendidos(),
                contadorCafeLargo, precioCafesLargosVendidos(),
                contadorCafeConLeche, precioCafesConLecheVendidos(),
                contadorTe, precioTesVendidos(),
                contadorChocolate, precioChocolatesVendidos(),
                getTotalVentas(), getTotalPrecio());
    }
}