# Ejercicio 07 - Estructuras de Control 4
## Descripción del ejercicio
Se realizarán más ejercicios relacionados con las estructuras de control

### Objetivos
* Dada la clase ``Exercise07`` proporcionada, completar los métodos proporcionados ``positionInAList()``, ``sumFirstNaturalNumbers()`` y 
  ``showFirstNaturalNumbers()`` siguiendo las instrucciones de los ``TODO`` comentados.

### Métodos a implementar
* Desde el método ``main()`` se llamará al resto de métodos, pasándoles a cada uno, respectivamente, los argumentos necesarios

* El método ``positionInAList()`` recibe un número entero por parámetro. En el método habrá que declarar una variable de tipo 
  ``List<Integer>`` e inicializarla como un nuevo ``ArrayList``. A continuación se le añadirán a la lista los números del 0 al 10, ambos 
  inclusive, a través del método ``add()``. Se recorrerá la lista para comprobar cuál es el índice, es decir: la posición, del número 
  recibido por parámetro en la lista. Finalmente, se mostrará por pantalla dicha posición; y en el caso de que el número no se encuentre 
  en la lista, también se mostrará por pantalla.
* El método ``sumFirstNaturalNumbers()`` recibe un número entero por parámetro. El método mostrará por pantalla un mensaje o mensajes, 
  para que quede más claro, que muestre la suma de los primeros números positivos que indique el parámetro.
* El método ``showFirstNaturalNumbers()`` recibe un número entero por parámetro. El método mostrará por pantalla un mensaje o mensajes,
  para que quede más claro, que muestre los primeros números positivos que indique el parámetro.

### Requisitos
* No se pueden modificar en absoluto las clases de test.

### Test

```
mvn test
```
