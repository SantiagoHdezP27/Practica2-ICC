public class Ticket {
    
    private Producto producto1;
    private Producto producto2;
    private Double total;
    private Double dineroRecibido;
    private Double cambio;

    public Ticket(Producto producto1, Producto producto2, double dineroRecibido) {

        this.producto1 = producto1;
        this.producto2 = producto2;
        this.dineroRecibido = dineroRecibido;
        //Para esta práctica no se requiere su uso (total y cambio)
        this.total = producto1.getPrecio() + producto2.getPrecio();
        this.cambio = dineroRecibido - total;
    }

    //Métodos de acceso
    public Producto getProducto1() {
        return this.producto1;
    }

    public Producto getProducto2() {
        return this.producto2;
    }

    public double getTotal() {
        return this.total;
    }

    public double getDineroRecibido() {
        return this.dineroRecibido;
    }

    public double getCambio() {
        return this.cambio;
    }

    //Métodos mutantes
    public void setProducto1(Producto producto1) {
        this.producto1 = producto1;
    }

    public void setProducto2(Producto producto2) {
        this.producto2 = producto2;
    }

    public void setDineroRecibido(double dineroRecibido) {
        this.dineroRecibido = dineroRecibido;
    }

    @Override
        public String toString() {
            return "TICKET \n" +
                this.producto1 + "\n" +
                this.producto2 + "\n" +
                "Total: $" + this.total + "\n" +
                "Dinero recibido: $" + this.dineroRecibido + "\n" +
                "Cambio: $" + this.cambio;        
            }    
}
