package Trabajo_Final;import java.util.Scanner;

public class Main {
    private static VectorManager vectorManager = new VectorManager();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú Principal:");
            System.out.println("1. Estudiantes de Ingeniería");
            System.out.println("2. Estudiantes de Diseño");
            System.out.println("3. Imprimir Inventario Total");
            System.out.println("4. Salir del Programa");
            System.out.print("Seleccione una opción: ");
            opcion = validarOpcion(scanner, 1, 4);

            switch (opcion) {
                case 1:
                    mostrarMenuIngenieria(scanner);
                    break;
                case 2:
                    mostrarMenuDiseno(scanner);
                    break;
                case 3:
                    vectorManager.imprimirInventario();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }

    private static void mostrarMenuIngenieria(Scanner scanner) {
        int opcion;
        do {
            System.out.println("Menú Estudiantes de Ingeniería:");
            System.out.println("1. Registrar préstamo de equipo");
            System.out.println("2. Modificar préstamo de equipo");
            System.out.println("3. Devolución de equipo");
            System.out.println("4. Buscar equipo");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = validarOpcion(scanner, 1, 5);

            switch (opcion) {
                case 1:
                    vectorManager.registrarPrestamoIngenieria(scanner);
                    break;
                case 2:
                    vectorManager.modificarPrestamo(scanner);
                    break;
                case 3:
                    vectorManager.devolucionEquipo(scanner);
                    break;
                case 4:
                    vectorManager.buscarEquipo(scanner);
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }

    private static void mostrarMenuDiseno(Scanner scanner) {
        int opcion;
        do {
            System.out.println("Menú Estudiantes de Diseño:");
            System.out.println("1. Registrar préstamo de equipo");
            System.out.println("2. Modificar préstamo de equipo");
            System.out.println("3. Devolución de equipo");
            System.out.println("4. Buscar equipo");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = validarOpcion(scanner, 1, 5);

            switch (opcion) {
                case 1:
                    vectorManager.registrarPrestamoDiseno(scanner);
                    break;
                case 2:
                    vectorManager.modificarPrestamo(scanner);
                    break;
                case 3:
                    vectorManager.devolucionEquipo(scanner);
                    break;
                case 4:
                    vectorManager.buscarEquipo(scanner);
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }

    private static int validarOpcion(Scanner scanner, int min, int max) {
        int opcion;
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.println("Opción inválida. Ingrese un número.");
                scanner.next();
            }
            opcion = scanner.nextInt();
            if (opcion >= min && opcion <= max) {
                break;
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        return opcion;
    }
}
