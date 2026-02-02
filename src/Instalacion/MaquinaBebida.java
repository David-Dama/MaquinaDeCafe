package src.Instalacion;

import src.bebidas.*;


public class MaquinaBebida {
    //Atributos
    private Inventario inventario;
    private AlmacenVentas almacenVentas;
    private Precios precios;
    
    //Constructor
    public MaquinaBebida(Inventario inventario, AlmacenVentas almacenVentas, Precios precios) {
        this.inventario = inventario;
        this.almacenVentas = almacenVentas;
        this.precios = precios;
    }
    
    //Creamos un metodo para cada bebida verificando que se puede crear, en el caso de que no mostramos un mensaje de error
    
    public void crearCafeExpresso(int cucharita, int azucar) {
        if (inventario.getCafe() < CafeExpresso.getCafeNecesario() || inventario.getAgua() < CafeExpresso.getAguaNecesaria() || inventario.getVaso() < 1 || inventario.getAzucar() < azucar || inventario.getCucharita() < cucharita) {
            System.out.println("Cafe expresso agotado");
        } else {
            almacenVentas.registrarVenta(new CafeExpresso(cucharita, azucar, precios));
            inventario.reducirCafe(CafeExpresso.getCafeNecesario());
            inventario.reducirAgua(CafeExpresso.getAguaNecesaria());
            inventario.reducirCucharitas(cucharita);
            inventario.reducirAzucar(azucar);
            inventario.reducirVasos(1);
        }
    }
    
    public void crearCafeConLeche(int cucharita, int azucar) {
        if (inventario.getCafe() < CafeConLeche.getCafeNecesario() || inventario.getAgua() < CafeConLeche.getAguaNecesaria() || inventario.getVaso() < 1 || inventario.getAzucar() < azucar || inventario.getCucharita() < cucharita || inventario.getLeche() < CafeConLeche.getLecheNecesaria()) {
            System.out.println("Cafe con leche agotado");
        } else {
            almacenVentas.registrarVenta(new CafeExpresso(cucharita, azucar, precios));
            inventario.reducirCafe(CafeConLeche.getCafeNecesario());
            inventario.reducirAgua(CafeConLeche.getAguaNecesaria());
            inventario.reducirLeche(CafeConLeche.getLecheNecesaria());
            inventario.reducirCucharitas(cucharita);
            inventario.reducirAzucar(azucar);
            inventario.reducirVasos(1);
        }
    }
    
    public void crearCafeLargo(int cucharita, int azucar) {
        if (inventario.getCafe() < CafeLargo.getCafeNecesario() || inventario.getAgua() < CafeLargo.getAguaNecesaria() || inventario.getVaso() < 1 || inventario.getAzucar() < azucar || inventario.getCucharita() < cucharita) {
            System.out.println("Cafe largo agotado");
        } else {
            almacenVentas.registrarVenta(new CafeExpresso(cucharita, azucar, precios));
            inventario.reducirCafe(CafeLargo.getCafeNecesario());
            inventario.reducirAgua(CafeLargo.getAguaNecesaria());
            inventario.reducirCucharitas(cucharita);
            inventario.reducirAzucar(azucar);
            inventario.reducirVasos(1);
        }
    }
    
    public void crearChocolate(int cucharita, int azucar) {
        if (inventario.getCacao() < Chocolate.getCacaoNecesario() || inventario.getAgua() < CafeExpresso.getAguaNecesaria() || inventario.getVaso() < 1 || inventario.getAzucar() < azucar || inventario.getCucharita() < cucharita) {
            System.out.println("Chocolate agotado");
        } else {
            almacenVentas.registrarVenta(new CafeExpresso(cucharita, azucar, precios));
            inventario.reducirCacao(Chocolate.getCacaoNecesario());
            inventario.reducirAgua(Chocolate.getAguaNecesaria());
            inventario.reducirCucharitas(cucharita);
            inventario.reducirAzucar(azucar);
            inventario.reducirVasos(1);
        }
    }
    
    public void crearTe(int cucharita, int azucar) {
        if (inventario.getTe() < Te.getTeNecesario() || inventario.getAgua() < CafeExpresso.getAguaNecesaria() || inventario.getVaso() < 1 || inventario.getAzucar() < azucar || inventario.getCucharita() < cucharita) {
            System.out.println("Té agotado");
        } else {
            almacenVentas.registrarVenta(new CafeExpresso(cucharita, azucar, precios));
            inventario.reducirTe(Te.getTeNecesario());
            inventario.reducirAgua(Te.getAguaNecesaria());
            inventario.reducirCucharitas(cucharita);
            inventario.reducirAzucar(azucar);
            inventario.reducirVasos(1);
        }
    }
}
