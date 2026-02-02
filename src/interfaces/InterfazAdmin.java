package src.interfaces;

import src.bebidas.*;
import src.maquinasDeCafe.inventario.*;
import src.utiles.Utilidades;
import src.utiles.utilidadesInterfaces.AlmacenVentas;

public class InterfazAdmin {

    private IngredientesYStock ingredientesYStock;
    private final AlmacenVentas almacenVentas = new AlmacenVentas();

    public InterfazAdmin(IngredientesYStock ingredientesYStock) {
        this.ingredientesYStock = ingredientesYStock;
    }

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("""
                    ╔═════════════════════════════════╗
                    ║        MODO ADMINISTRADOR       ║
                    ╠═════════════════════════════════╣
                    ║ 1. Ver estado inventario        ║
                    ║ 2. Reponer ingredientes y stock ║
                    ║ 3. Ver reporte financiero       ║
                    ║ 4. Cambiar precios              ║
                    ║ 5. Modificar recetas            ║
                    ║ 6. Volver al menú principal     ║
                    ╚═════════════════════════════════╝""");
            opcion = Utilidades.pedirInt("Seleccione una opción: ");

            switch (opcion) {
                case 1:
                    System.out.println(ingredientesYStock);
                    break;
                case 2:
                    ingredientesYStock.recargaIngredientes();
                    ingredientesYStock.recargaStock();
                    break;
                case 3:
                    almacenVentas.mostrarResumen();
                    break;
                case 4:
                    cambiarPrecioBebida();
                    break;
                case 5:
                    modificarReceta();
                    break;
                case 6:
                    System.out.println("Volviendo al menú principal");
                    break;
                default:
                    System.out.println("Escoja una opción válida.");
            }
        } while (opcion != 6);
    }

    private int seleccionarOpcionDeBebida() {
        int opcion;

        do {
            System.out.println("""
                    Seleccione la bebida la quiere modificar el precio:
                    1. Café Expresso
                    2. Café Largo
                    3. Café con Leche
                    4. Té
                    5. Chocolate
                    """);
            opcion = Utilidades.pedirInt("Seleccione una opción: ");

            if (opcion > 5 || opcion < 1) {
                System.out.println("El número está fuera de rango (1-5).");
            }

        } while (opcion > 5 || opcion < 1);

        return opcion;
    }

    private void cambiarPrecioBebida() {
        int opcion = seleccionarOpcionDeBebida();

        switch (opcion) {
            case 1:
                Precios.setPrecioCafeExpresso(Utilidades.pedirPrecio("¿Cúal desea que sea el nuevo precio? (Anterior: 1.00)"));
                break;
            case 2:
                Precios.setPrecioCafeLargo(Utilidades.pedirPrecio("¿Cúal desea que sea el nuevo precio? (Anterior: 1.20)"));
                break;
            case 3:
                Precios.setPrecioCafeConLeche(Utilidades.pedirPrecio("¿Cúal desea que sea el nuevo precio? (Anterior: 1.50)"));
                break;
            case 4:
                Precios.setPrecioTe(Utilidades.pedirPrecio("¿Cúal desea que sea el nuevo precio? (Anterior: 1.10)"));
                break;
            case 5:
                Precios.setPrecioChocolate(Utilidades.pedirPrecio("¿Cúal desea que sea el nuevo precio? (Anterior: 1.10)"));
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private void modificarReceta() {
        int opcion = seleccionarOpcionDeBebida();
        int respuesta;

        switch (opcion) {
            case 1:
                respuesta = Utilidades.repuestaConSoN("¿Desea cambiar la cantidad de agua?");
                if (respuesta == 1) {
                    CafeExpresso.setAguaNecesaria(Utilidades.pedirInt("Ingrese la nueva cantidad de agua (en ml): "));
                }

                respuesta = Utilidades.repuestaConSoN("¿Desea cambiar la cantidad de café?");
                if (respuesta == 1) {
                    CafeExpresso.setCafeNecesario(Utilidades.pedirInt("Ingrese la nueva cantidad de café (en gr): "));
                }
                break;
            case 2:
                respuesta = Utilidades.repuestaConSoN("¿Desea cambiar la cantidad de agua?");
                if (respuesta == 1) {
                    CafeLargo.setAguaNecesaria(Utilidades.pedirInt("Ingrese la nueva cantidad de agua (en ml): "));
                }

                respuesta = Utilidades.repuestaConSoN("¿Desea cambiar la cantidad de café?");
                if (respuesta == 1) {
                    CafeLargo.setCafeNecesario(Utilidades.pedirInt("Ingrese la nueva cantidad de café (en gr): "));
                }
                break;
            case 3:
                respuesta = Utilidades.repuestaConSoN("¿Desea cambiar la cantidad de agua?");
                if (respuesta == 1) {
                    CafeConLeche.setAguaNecesaria(Utilidades.pedirInt("Ingrese la nueva cantidad de agua (en ml): "));
                }

                respuesta = Utilidades.repuestaConSoN("¿Desea cambiar la cantidad de café?");
                if (respuesta == 1) {
                    CafeConLeche.setCafeNecesario(Utilidades.pedirInt("Ingrese la nueva cantidad de café (en gr): "));
                }

                respuesta = Utilidades.repuestaConSoN("¿Desea cambiar la cantidad de leche?");
                if (respuesta == 1) {
                    CafeConLeche.setLecheNecesaria(Utilidades.pedirInt("Ingrese la nueva cantidad de leche (en ml): "));
                }
                break;
            case 4:
                respuesta = Utilidades.repuestaConSoN("¿Desea cambiar la cantidad de agua?");
                if (respuesta ==1){
                    Te.setAguaNecesaria(Utilidades.pedirInt("Ingrese la nueva cantidad de agua (en ml): "));
                }

                respuesta = Utilidades.repuestaConSoN("¿Desea cambiar la cantidad de té?");
                if (respuesta ==1){
                    Te.setTeNecesario(Utilidades.pedirInt("Ingrese la nueva cantidad de te (en gr): "));
                }
                break;
            case 5:
                respuesta = Utilidades.repuestaConSoN("¿Desea cambiar la cantidad de agua?");
                if (respuesta ==1){
                    Chocolate.setAguaNecesaria(Utilidades.pedirInt("Ingrese la nueva cantidad de café (en ml): "));
                }

                respuesta = Utilidades.repuestaConSoN("¿Desea cambiar la cantidad de cacao?");
                if (respuesta ==1){
                    Chocolate.setChocolateNecesario(Utilidades.pedirInt("Ingrese la nueva cantidad de café (en gr): "));
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}

