package Trabajo_Final;

import java.util.LinkedList;
import java.util.Scanner;
// Clase en la que crearemos métodos para llenar las Listas ...

import Trabajo_Final.Estudiante_Dis;

public class Listas {
    Scanner sc = new Scanner();

    //Método para llenar ListaEstudiante_Ing

    //Método para llenar ListaEstudiante_Dis
    public LinkedList<Estudiante_Dis> llenarListEstudiante_Dis(){
        LinkedList<Estudiante_Dis> listaEstudiante_Dis = new LinkedList();
        Estudiante_Dis estudiante_dis = new Estudiante_Dis();

        System.out.print("Ingrese el nombre del estudiante: ");
        while(!sc.hasNext()){
            System.out.print("Dato no válido. Por favor ingrese de nuevo: ");
            sc.next();
        }
        estudiante_dis.setNombre(sc.next());
        sc.nextLine();

        listaEstudiante_Dis.add(estudiante_dis);
    }
    //Método para llenar ListaComputadores
    //Método para llenar ListaTablet
}
