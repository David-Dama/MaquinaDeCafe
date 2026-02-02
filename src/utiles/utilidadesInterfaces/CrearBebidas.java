package src.utiles.utilidadesInterfaces;

import src.bebidas.*;
import src.maquinasDeCafe.inventario.IngredientesYStock;


public class CrearBebidas {

    private IngredientesYStock ingredientesYStock;
    private AlmacenVentas almacenVentas;

    public CrearBebidas(IngredientesYStock ingredientesYStock, AlmacenVentas almacenVentas) {
        this.ingredientesYStock = ingredientesYStock;
        this.almacenVentas = almacenVentas;
    }

    public void crearCafeExpresso(int cucharita, int azucar) {
        if (ingredientesYStock.getCafe() < CafeExpresso.getCafeNecesario() ||
                ingredientesYStock.getAgua() < CafeExpresso.getAguaNecesaria() ||
                ingredientesYStock.getVaso() < 1 ||
                ingredientesYStock.getAzucar() < azucar ||
                ingredientesYStock.getCucharita() < cucharita) {
            System.out.println("Cafe expresso agotado");
        } else {
            almacenVentas.registrarVenta(new CafeExpresso(cucharita, azucar));
        }
    }

    public void crearCafeConLeche(int cucharita, int azucar) {
        if (ingredientesYStock.getCafe() < CafeConLeche.getCafeNecesario() ||
                ingredientesYStock.getAgua() < CafeConLeche.getAguaNecesaria() ||
                ingredientesYStock.getVaso() < 1 ||
                ingredientesYStock.getAzucar() < azucar ||
                ingredientesYStock.getCucharita() < cucharita ||
                ingredientesYStock.getLeche() < CafeConLeche.getLecheNecesaria()) {
            System.out.println("Cafe con leche agotado");
        } else {
            almacenVentas.registrarVenta(new CafeExpresso(cucharita, azucar));
        }
    }

    public void crearCafeLargo(int cucharita, int azucar) {
        if (ingredientesYStock.getCafe() < CafeLargo.getCafeNecesario() ||
                ingredientesYStock.getAgua() < CafeLargo.getAguaNecesaria() ||
                ingredientesYStock.getVaso() < 1 ||
                ingredientesYStock.getAzucar() < azucar ||
                ingredientesYStock.getCucharita() < cucharita) {
            System.out.println("Cafe largo agotado");
        } else {
            almacenVentas.registrarVenta(new CafeExpresso(cucharita, azucar));
        }
    }

    public void crearChocolate(int cucharita, int azucar) {
        if (ingredientesYStock.getCacao() < Chocolate.getChocolateNecesario() ||
                ingredientesYStock.getAgua() < CafeExpresso.getAguaNecesaria() ||
                ingredientesYStock.getVaso() < 1 ||
                ingredientesYStock.getAzucar() < azucar ||
                ingredientesYStock.getCucharita() < cucharita) {
            System.out.println("Chocolate agotado");
        } else {
            almacenVentas.registrarVenta(new CafeExpresso(cucharita, azucar));
        }
    }

    public void crearTe(int cucharita, int azucar) {
        if (ingredientesYStock.getTe() < Te.getTeNecesario() ||
                ingredientesYStock.getAgua() < CafeExpresso.getAguaNecesaria() ||
                ingredientesYStock.getVaso() < 1 ||
                ingredientesYStock.getAzucar() < azucar ||
                ingredientesYStock.getCucharita() < cucharita) {
            System.out.println("Té agotado");
        } else {
            almacenVentas.registrarVenta(new CafeExpresso(cucharita, azucar));
        }
    }
}
