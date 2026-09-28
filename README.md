# Sistema de Inventario con Árbol Binario
 ## Descripción

Este proyecto es una aplicación de consola desarrollada en Java para gestionar un inventario de productos utilizando la estructura de datos Árbol Binario de Búsqueda (ABB).

El programa permite registrar productos, mostrar el inventario ordenado por ID y buscar productos mediante su identificador.

El proyecto está dividido estrictamente en tres clases, cada una con una función específica.

## Tecnologías utilizadas
Java
Visual Studio Code
Git
GitHub
Consola de comandos
Árbol Binario de Búsqueda
# Estructura del proyecto
ArbolInventario/
│
├── Producto.java
├── ArbolInventario.java
├── Main.java
└── README.md
## Clases del proyecto
1. Producto.java

Representa el nodo del árbol.

Contiene:

int id → Identificador del producto.
String nombre → Nombre del producto.
Producto izquierdo → Referencia al hijo izquierdo.
Producto derecho → Referencia al hijo derecho.
2. ArbolInventario.java

Contiene la lógica principal del árbol.

Permite:

Insertar productos.
Recorrer el árbol mediante Inorden.
Buscar productos por ID.

La inserción se realiza comparando los ID:

Si el ID nuevo es menor → va a la izquierda.

Si el ID nuevo es mayor → va a la derecha.

El recorrido Inorden permite mostrar los productos organizados de menor a mayor según su ID.

3. Main.java

Es la clase principal del programa.

Contiene el menú de opciones:

===== MENÚ INVENTARIO =====
1. Registrar Producto
2. Mostrar Inventario
3. Buscar Producto
0. Salir
## Funcionamiento
Registrar producto

El usuario introduce:

ID del producto.
Nombre del producto.

El programa inserta el producto en la posición correspondiente del árbol.

Mostrar inventario

Se utiliza un recorrido Inorden:

Izquierda → Raíz → Derecha

Esto permite visualizar los productos ordenados por su ID.

Buscar producto

El usuario introduce el ID que desea buscar.

El programa recorre el árbol comparando el ID buscado con los nodos existentes hasta encontrarlo o determinar que no existe.

# Ejecución

Desde la terminal, ubicándose dentro de la carpeta del proyecto:

javac *.java

Después:

java Main
 Ejemplo
===== MENÚ INVENTARIO =====
1. Registrar Producto
2. Mostrar Inventario
3. Buscar Producto
0. Salir

Seleccione una opción: 1

Ingrese el ID del producto: 20
Ingrese el nombre del producto: Arroz

Producto registrado correctamente.

Si posteriormente se registran:

ID: 20 - Arroz
ID: 10 - Leche
ID: 30 - Pan

Al seleccionar Mostrar Inventario, el recorrido Inorden mostrará:

ID: 10 - Leche
ID: 20 - Arroz
ID: 30 - Pan
### Objetivo

El objetivo del proyecto es aplicar los conceptos de:

Programación orientada a objetos.
Recursividad.
Árboles binarios de búsqueda.
Nodos y referencias.
Recorridos de árboles.
Búsqueda de información.
Manejo de menús mediante switch.
Entrada de datos mediante Scanner.
