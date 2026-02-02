package src.interfaces;

import src.utiles.Utilidades;
import src.utiles.utilidadesInterfaces.*;


public class InterfazCliente {

    //Atributos
    private final CrearBebidas crearBebidas;
    private OpcionesAzucar opcionesAzucar;

    //Constructor
    public InterfazCliente(CrearBebidas crearBebidas) {
        this.crearBebidas = crearBebidas;
    }

    //Metodos
    public void MenuDeOpciones() {
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
                    ║ 6. Salir                       ║
                    ╚════════════════════════════════╝""");
            opcion = Utilidades.pedirInt("Seleccione una opción: ");

            switch (opcion) {
                case 1:
                    crearBebidas.crearCafeExpresso(Utilidades.repuestaConSoN("¿Desea cucharita? (s/n): "), pedirAzucar());
                    break;
                case 2:
                    crearBebidas.crearCafeLargo(Utilidades.repuestaConSoN("¿Desea cucharita? (s/n): "), pedirAzucar());
                    break;
                case 3:
                    crearBebidas.crearCafeConLeche(Utilidades.repuestaConSoN("¿Desea cucharita? (s/n): "), pedirAzucar());
                    break;
                case 4:
                    crearBebidas.crearTe(Utilidades.repuestaConSoN("¿Desea cucharita? (s/n): "), pedirAzucar());
                    break;
                case 5:
                    crearBebidas.crearChocolate(Utilidades.repuestaConSoN("¿Desea cucharita? (s/n): "), pedirAzucar());
                    break;
                case 6:
                    System.out.println("Gracias por su compra. ¡Vuelva pronto!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            if (opcion != 6) {
                int respuesta = Utilidades.repuestaConSoN("¿Desea comprar otra bebida? (s/n): ");
                if (respuesta == 0) {
                    opcion = 6;
                }
            }
        } while (opcion != 6);
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
            if (opcion > opcionesAzucar.getAzucar().length || opcion < 0) {
                System.out.println("Escoja una opción valida");
            }
        } while (opcion > opcionesAzucar.getAzucar().length || opcion < 0);

        return opcionesAzucar.getAzucar()[opcion];
    }
}