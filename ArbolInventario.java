public class ArbolInventario {

    Producto raiz;

    // Método para insertar un producto
    public void insertar(int id, String nombre) {
        Producto nuevo = new Producto(id, nombre);

        if (raiz == null) {
            raiz = nuevo;
        } else {
            insertarRecursivo(raiz, nuevo);
        }
    }

    // Método recursivo para insertar
    private void insertarRecursivo(Producto actual, Producto nuevo) {

        if (nuevo.id < actual.id) {

            if (actual.izquierdo == null) {
                actual.izquierdo = nuevo;
            } else {
                insertarRecursivo(actual.izquierdo, nuevo);
            }

        } else if (nuevo.id > actual.id) {

            if (actual.derecho == null) {
                actual.derecho = nuevo;
            } else {
                insertarRecursivo(actual.derecho, nuevo);
            }

        } else {
            System.out.println("El ID ya existe.");
        }
    }

    // Recorrido Inorden
    public void inorden() {
        if (raiz == null) {
            System.out.println("El inventario está vacío.");
        } else {
            inordenRecursivo(raiz);
        }
    }

    private void inordenRecursivo(Producto actual) {

        if (actual != null) {

            inordenRecursivo(actual.izquierdo);

            System.out.println(
                "ID: " + actual.id +
                " | Nombre: " + actual.nombre
            );

            inordenRecursivo(actual.derecho);
        }
    }

    // Buscar producto por ID
    public Producto buscar(int id) {
        return buscarRecursivo(raiz, id);
    }

    private Producto buscarRecursivo(Producto actual, int id) {

        if (actual == null) {
            return null;
        }

        if (id == actual.id) {
            return actual;
        }

        if (id < actual.id) {
            return buscarRecursivo(actual.izquierdo, id);
        } else {
            return buscarRecursivo(actual.derecho, id);
        }
    }
}