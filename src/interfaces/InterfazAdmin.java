package src.interfaces;

import src.bebidas.*;
import src.Instalacion.AlmacenVentas;
import src.Instalacion.Inventario;
import src.utiles.Utilidades;
import src.Instalacion.OpcionesAzucar;
import src.Instalacion.Precios;

public class InterfazAdmin {
    
    private Inventario inventario;
    private final AlmacenVentas almacenVentas;
    private Precios precios;
    private OpcionesAzucar opcionesAzucar;
    private String usuario;
    private String contrasenya;
    
    //Constructor
    public InterfazAdmin(AlmacenVentas almacenVentas, Inventario inventario, Precios precios, OpcionesAzucar opcionesAzucar, String usuario, String contrasenya) {
        this.almacenVentas = almacenVentas;
        this.inventario = inventario;
        this.precios = precios;
        this.opcionesAzucar = opcionesAzucar;
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        
    }
    
    //Getters y setters
    public Inventario getInventario() {
        return inventario;
    }
    
    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }
    
    public AlmacenVentas getAlmacenVentas() {
        return almacenVentas;
    }
    
    public Precios getPrecios() {
        return precios;
    }
    
    public void setPrecios(Precios precios) {
        this.precios = precios;
    }
    
    public OpcionesAzucar getOpcionesAzucar() {
        return opcionesAzucar;
    }
    
    public void setOpcionesAzucar(OpcionesAzucar opcionesAzucar) {
        this.opcionesAzucar = opcionesAzucar;
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    public String getContrasenya() {
        return contrasenya;
    }
    
    //Metodos
    public void mostrarMenu() {
        int opcion;
        
        do {
            System.out.println("""
                ╔════════════════════════════════════╗
                ║        MODO ADMINISTRADOR          ║
                ╠════════════════════════════════════╣
                ║ 1. Ver estado inventario           ║
                ║ 2. Reponer ingredientes y stock    ║
                ║ 3. Ver datos de una bebida vendida ║
                ║ 4. Ver reporte financiero          ║
                ║ 5. Cambiar precios                 ║
                ║ 6. Modificar recetas               ║
                ║ 7. Modificar opciones de azucar    ║
                ║ 8. Modificar usuario               ║
                ║ 9. Modificar contraseña            ║
                ║ 10. Volver al menú principal       ║
                ║ 11. Apagar máquina                 ║
                ╚════════════════════════════════════╝""");
            opcion = Utilidades.pedirInt("Seleccione una opción: ");
            
            switch (opcion) {
                case 1:
                    System.out.println(inventario);
                    break;
                case 2:
                    inventario.recargaIngredientes();
                    inventario.recargaStock();
                    System.out.println("Inventario repuesto al máximo");
                    break;
                case 3:
                    verInformacionIngredienteEspecifico();
                    break;
                case 4:
                    System.out.println(almacenVentas);
                    break;
                case 5:
                    cambiarPrecioBebida();
                    break;
                case 6:
                    modificarReceta();
                    break;
                case 7:
                    opcionesAzucar.setTamanyoFuncionalidadAzucar(Utilidades.pedirInt("Introduzca la cantidad de opciones de azúcar que desea: "));
                    break;
                case 8:
                    this.usuario = Utilidades.pedirString("Introduzca el nuevo ID de usuario: ");
                    break;
                case 9:
                    this.contrasenya = Utilidades.pedirString(String.format("Introduzca la nueva contraseña para el usuario %s:", this.usuario));
                    break;
                case 10:
                    System.out.println("Volviendo al menú principal");
                    break;
                case 11:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Escoja una opción válida.");
                    break;
            }
            
        } while (opcion != 10);
    }
    
    private int seleccionarOpcionDeBebida() {
        int opcion;
        
        do {
            System.out.println("""
                Seleccione la bebida:
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
                precios.setPrecioCafeExpresso(Utilidades.pedirPrecio(String.format("¿Cúal desea que sea el nuevo precio? (Anterior: %.2f)", precios.getPrecioCafeExpresso())));
                break;
            case 2:
                precios.setPrecioCafeLargo(Utilidades.pedirPrecio(String.format("¿Cúal desea que sea el nuevo precio? (Anterior: %.2f)", precios.getPrecioCafeLargo())));
                break;
            case 3:
                precios.setPrecioCafeConLeche(Utilidades.pedirPrecio(String.format("¿Cúal desea que sea el nuevo precio? (Anterior: %.2f)", precios.getPrecioCafeConLeche())));
                break;
            case 4:
                precios.setPrecioTe(Utilidades.pedirPrecio(String.format("¿Cúal desea que sea el nuevo precio? (Anterior: %.2f)", precios.getPrecioTe())));
                break;
            case 5:
                precios.setPrecioChocolate(Utilidades.pedirPrecio(String.format("¿Cúal desea que sea el nuevo precio? (Anterior: %.2f)", precios.getPrecioChocolate())));
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
                respuesta = Utilidades.repuestaConSoN("¿Desea cambiar la cantidad de agua? (s/n)");
                if (respuesta == 1) {
                    CafeExpresso.setAguaNecesaria(Utilidades.pedirInt("Ingrese la nueva cantidad de agua (en ml): "));
                }
                
                respuesta = Utilidades.repuestaConSoN("¿Desea cambiar la cantidad de café? (s/n)");
                if (respuesta == 1) {
                    CafeExpresso.setCafeNecesario(Utilidades.pedirInt("Ingrese la nueva cantidad de café (en gr): "));
                }
                break;
            case 2:
                respuesta = Utilidades.repuestaConSoN("¿Desea cambiar la cantidad de agua? (s/n)");
                if (respuesta == 1) {
                    CafeLargo.setAguaNecesaria(Utilidades.pedirInt("Ingrese la nueva cantidad de agua (en ml): "));
                }
                
                respuesta = Utilidades.repuestaConSoN("¿Desea cambiar la cantidad de café? (s/n)");
                if (respuesta == 1) {
                    CafeLargo.setCafeNecesario(Utilidades.pedirInt("Ingrese la nueva cantidad de café (en gr): "));
                }
                break;
            case 3:
                respuesta = Utilidades.repuestaConSoN("¿Desea cambiar la cantidad de agua? (s/n)");
                if (respuesta == 1) {
                    CafeConLeche.setAguaNecesaria(Utilidades.pedirInt("Ingrese la nueva cantidad de agua (en ml): "));
                }
                
                respuesta = Utilidades.repuestaConSoN("¿Desea cambiar la cantidad de café? (s/n)");
                if (respuesta == 1) {
                    CafeConLeche.setCafeNecesario(Utilidades.pedirInt("Ingrese la nueva cantidad de café (en gr): "));
                }
                
                respuesta = Utilidades.repuestaConSoN("¿Desea cambiar la cantidad de leche? (s/n)");
                if (respuesta == 1) {
                    CafeConLeche.setLecheNecesaria(Utilidades.pedirInt("Ingrese la nueva cantidad de leche (en ml): "));
                }
                break;
            case 4:
                respuesta = Utilidades.repuestaConSoN("¿Desea cambiar la cantidad de agua? (s/n)");
                if (respuesta == 1) {
                    Te.setAguaNecesaria(Utilidades.pedirInt("Ingrese la nueva cantidad de agua (en ml): "));
                }
                
                respuesta = Utilidades.repuestaConSoN("¿Desea cambiar la cantidad de té? (s/n)");
                if (respuesta == 1) {
                    Te.setTeNecesario(Utilidades.pedirInt("Ingrese la nueva cantidad de té (en gr): "));
                }
                break;
            case 5:
                respuesta = Utilidades.repuestaConSoN("¿Desea cambiar la cantidad de agua? (s/n)");
                if (respuesta == 1) {
                    Chocolate.setAguaNecesaria(Utilidades.pedirInt("Ingrese la nueva cantidad de agua (en ml): "));
                }
                
                respuesta = Utilidades.repuestaConSoN("¿Desea cambiar la cantidad de cacao? (s/n)");
                if (respuesta == 1) {
                    Chocolate.setChocolateNecesario(Utilidades.pedirInt("Ingrese la nueva cantidad de cacao (en gr): "));
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
    
    public void verInformacionIngredienteEspecifico(){
        int opcion = seleccionarOpcionDeBebida();
        
        try {
            switch (opcion) {
                case 1:
                    System.out.println(almacenVentas.getVentasCafeExpresso()[(Utilidades.pedirInt("Buscar café expresso por ID:") - 1)]);
                    break;
                case 2:
                    System.out.println(almacenVentas.getVentasCafeLargo()[(Utilidades.pedirInt("Buscar café largo por ID:") - 1)]);
                    break;
                case 3:
                    System.out.println(almacenVentas.getVentasCafeConLeche()[(Utilidades.pedirInt("Buscar café con leche por ID:") - 1)]);
                    break;
                case 4:
                    System.out.println(almacenVentas.getVentasTe()[(Utilidades.pedirInt("Buscar té por ID:") - 1)]);
                    break;
                case 5:
                    System.out.println(almacenVentas.getVentasChocolate()[(Utilidades.pedirInt("Buscar chocolate por ID:") - 1)]);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } catch (NullPointerException e){
            System.out.println("No se ha encontrado ningúna bebida del tipo seleccionado con ese ID");
        }
    }
    
    public void crearOpcionesDeAzucar() {
        OpcionesAzucar opcionesAzucar = new OpcionesAzucar(Utilidades.pedirInt("Seleccione la cantidad de opciones. "));
    }
}

