package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {

        positionInAList(5);
        positionInAList(14);
        sumFirstNaturalNumbers(5);

    }


    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
      List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);

        String resultadoBusqueda = "El elemento " + num + " no se encuentra en la lista.";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == num) {
                resultadoBusqueda = "El elemento " + num + " se ha encontrado.";
                break;
            }
        }
        System.out.println(resultadoBusqueda);

    }

    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int sumaTotal = 0;
        for (int i = 1; i <= num; i++) {
            sumaTotal = sumaTotal + i;
        }
        System.out.println(" la suma de los primeros N números positivos es:  " + sumaTotal);

    }


    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
               for (int i = 1; i <= num; i++) {
                System.out.print(i + " ");
            }
        }

    }
