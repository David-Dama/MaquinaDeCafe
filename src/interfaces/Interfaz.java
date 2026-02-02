package src.interfaces;

import src.Instalacion.MaquinaBebida;
import src.utiles.Utilidades;
import src.Instalacion.OpcionesAzucar;



public class Interfaz {
    
    //Atributos
    private final MaquinaBebida maquinaBebida;
    private OpcionesAzucar opcionesAzucar;
    private InterfazAdmin interfazAdmin;
    
    //Constructor
    public Interfaz(MaquinaBebida maquinaBebida, OpcionesAzucar opcionesAzucar, InterfazAdmin interfazAdmin) {
        this.maquinaBebida = maquinaBebida;
        this.opcionesAzucar = opcionesAzucar;
        this.interfazAdmin = interfazAdmin;
    }
    
    
    //Metodos
    public void menuDeOpciones() {
        int opcion;
        
        do {
            System.out.println(""" 
                ╔════════════════════════════════╗
                ║       MÁQUINA DE BEBIDAS       ║
                ║          MENÚ CLIENTE          ║
                ╠════════════════════════════════╣
                ║ 1. Café Expresso    - 1.00€    ║
                ║ 2. Café Largo       - 1.20€    ║
                ║ 3. Café con Leche   - 1.50€    ║
                ║ 4. Té               - 1.10€    ║
                ║ 5. Chocolate        - 1.10€    ║
                ╚════════════════════════════════╝""");
            opcion = Utilidades.pedirInt("Seleccione una opción: ");
            
            switch (opcion) {
                case 1:
                    maquinaBebida.crearCafeExpresso(pedirCucharita(), pedirAzucar());
                    break;
                case 2:
                    maquinaBebida.crearCafeLargo(pedirCucharita(), pedirAzucar());
                    break;
                case 3:
                    maquinaBebida.crearCafeConLeche(pedirCucharita(), pedirAzucar());
                    break;
                case 4:
                    maquinaBebida.crearTe(pedirCucharita(), pedirAzucar());
                    break;
                case 5:
                    maquinaBebida.crearChocolate(pedirCucharita(), pedirAzucar());
                    break;
                
                //Si se inserta 666 se entra al menú de admin
                case 666:
                    //Comprobamos que sea el admin con las credenciales correspondientes
                    if (interfazAdmin.getUsuario().equals(Utilidades.pedirString("Introduzca el usuario: "))){
                        if (interfazAdmin.getContrasenya().equals(Utilidades.pedirString("Introduzca la contraseña"))){
                            //Si entra, mostramos el menú del admin
                            interfazAdmin.mostrarMenu();
                        }else {
                            System.out.println("Contraseña Incorrecta");
                        }
                    }else {
                        System.out.println("Usuario incorrecto");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (true);
    }
    
    private int pedirAzucar() {
        //Imprimimos la cantidad de opciones
        for (int i = 0; i < opcionesAzucar.getAzucar().length; i++) {
            System.out.printf("Opcion %d: %d gr\n", i + 1, opcionesAzucar.getAzucar()[i]);
        }
        
        int opcion;
        
        //Controlamos que la opcion esté dentro de rango
        do {
            opcion = Utilidades.pedirInt("Seleccione su opción: ");
            if (opcion > opcionesAzucar.getAzucar().length + 1 || opcion < 1) {
                System.out.println("Escoja una opción valida");
            }
        } while (opcion > opcionesAzucar.getAzucar().length + 1 || opcion < 1);
        
        return opcionesAzucar.getAzucar()[opcion-1];
    }
    
    private int pedirCucharita() {
        return Utilidades.repuestaConSoN("¿Desea cucharita? (s/n): ");
    }
}