import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArbolInventario inventario = new ArbolInventario();

        int opcion;

        do {

            System.out.println("\n===== INVENTARIO =====");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Mostrar Inventario");
            System.out.println("3. Buscar Producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese el ID del producto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();

                    inventario.insertar(id, nombre);

                    System.out.println("Producto registrado.");

                    break;

                case 2:

                    System.out.println("\n===== INVENTARIO ORDENADO =====");

                    inventario.inorden();

                    break;

                case 3:

                    System.out.print("Ingrese el ID que desea buscar: ");
                    int idBuscar = scanner.nextInt();

                    Producto producto = inventario.buscar(idBuscar);

                    if (producto != null) {
                        System.out.println(
                            "Producto encontrado: " +
                            producto.nombre +
                            " | ID: " +
                            producto.id
                        );
                    } else {
                        System.out.println("El producto no existe.");
                    }

                    break;

                case 0:

                    System.out.println("Saliendo del programa...");

                    break;

                default:

                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}