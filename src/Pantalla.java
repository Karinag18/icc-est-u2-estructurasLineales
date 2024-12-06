class Pantalla {
    private int id;
    private String page;
    private String ruta;
    private Pantalla next; // Enlace al siguiente objeto Pantalla (para la lista enlazada)

    public Pantalla(int id, String page, String ruta) {
        this.id = id;
        this.page = page;
        this.ruta = ruta;
        this.next = null; // Inicialmente, no apunta a ningún siguiente
    }

    // Método getRuta() ya está implementado
    public String getRuta() {
        return ruta;
    }

    // Implementación de getNext() para enlazar con otro objeto Pantalla
    public Pantalla getNext() {
        return next;
    }

    // Establecer el siguiente objeto Pantalla
    public void setNext(Pantalla next) {
        this.next = next;
    }

    // Implementación de getValue(), devuelve la propia Pantalla
    public Pantalla getValue() {
        return this; // Retorna la propia instancia de Pantalla
    }

    @Override
    public String toString() {
        return "Pantalla{id=" + id + ", page='" + page + "', ruta='" + ruta + "'}";
    }
}
