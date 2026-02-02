package src.utiles;

import java.util.Scanner;

public class Utilidades {
    private static final Scanner sc = new Scanner(System.in);

    public static int pedirInt(String mensaje) {
        System.out.println(mensaje);

        while (!sc.hasNextInt()) {
            System.out.println("Input inválido. Introduce un número entero.");
            sc.next(); // descartamos lo que haya metido
            System.out.println(mensaje);
        }

        return sc.nextInt();
    }

    public static double pedirPrecio(String mensaje) {
        double precio = -1;

        while (precio <= 0) {
            System.out.println(mensaje);

            // Validamos que sea un double
            while (!sc.hasNextDouble()) {
                System.out.println("Input inválido. Introduce un número decimal válido mayor que 0 (recuerda usar el punto, no la coma).");
                sc.next(); // descartamos el input inválido
                System.out.println(mensaje);
            }

            precio = sc.nextDouble();

            if (precio <= 0) {
                System.out.println("El precio debe ser mayor que 0.");
            }
        }

        return precio;
    }

    public static int repuestaConSoN(String mensaje) {
        do {
            System.out.print(mensaje);
            char respuesta = sc.next().charAt(0);
            if (respuesta == 's') {
                return 1;
            } else if (respuesta == 'n') {
                return 0;
            } else {
                System.out.println("Solo puede introducir el carácter 's' o 'n'");
            }
        } while (true);
    }
}
