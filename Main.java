package Trabajo_Final;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" ---------- UNIVERSIDAD SAN JUAN DE DIOS ---------- \n" +
                        "  -------------- PRÉSTAMO DE EQUIPOS ---------- \n" +
                        "\nSeleccione el tipo de Estudiante: " +
                        "\n1. Estudiante de Ingeniería " +
                        "\n2. Estudiante de Diseño " +
                        "\n3. Salir " +
                        "\nIngrese opción: ");

        int opt = 0;
        while(opt != 3){
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("\n ---------- FIN PROGRAMA ---------- ");
                    break;
                default:
                    break;
            }
        }
    }
}
