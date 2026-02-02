package src;

import src.Instalacion.*;
import src.interfaces.Interfaz;
import src.interfaces.InterfazAdmin;

public class AppMaquina1 {
    static void main(String[] args) {
        
        //El tecnico programa la máquina
        
        //Creamos los objetos necesarios para el funcionamiento de la máquina
        Precios preciosPrometeo = new Precios(1.5, 1, 1.2, 1.5, 1.1);
        Inventario inventarioPrometeo = new Inventario(4000, 1000, 1000, 1000, 1000, 1000, 200, 200);
        AlmacenVentas almacenVentasPrometeo = new AlmacenVentas();
        
        MaquinaBebida maquinaBebidaPrometeo = new MaquinaBebida(inventarioPrometeo, almacenVentasPrometeo, preciosPrometeo);
        OpcionesAzucar opcionesAzucarPrometeo = new OpcionesAzucar(3);
        
        //Instrucciones para rellenar el array con las opciones de azucar
        System.out.println("Opciones de azucar (Como valor predeterminado tendrá 3 opciones, pero se puede cambiar en cualquier momento desde el menú de administrador.):");
        opcionesAzucarPrometeo.rellenarArrayAzucar();
        
        //Creamos una contraseña y usuario genéricos
        String usuarioPrometeo = "Admin";
        String contrasenyaPrometeo = "Admin123";
        
        //Creamos los interfaces
        InterfazAdmin interfazAdminPrometeo = new InterfazAdmin(almacenVentasPrometeo, inventarioPrometeo, preciosPrometeo, opcionesAzucarPrometeo, usuarioPrometeo, contrasenyaPrometeo);
        Interfaz interfazPrometeo = new Interfaz(maquinaBebidaPrometeo, opcionesAzucarPrometeo, interfazAdminPrometeo);
        
        
        
        //La máquina está puesta en marcha
        System.out.println("\nCliente:");
        interfazPrometeo.menuDeOpciones();
    
        
        
        
    }
    
}
