public class Producto {
    
    private String nombre;
    private String departamento;
    private Double precio;

    public Producto(String nombre, int departamento, double precio) {
        this.nombre = determinarNombre(nombre);
        this.departamento = determinarDepartamento(departamento);
        this.precio = determinarPrecio(precio);
    }

    private String determinarNombre(String nombre) {
        if (nombre.equals("") || nombre.equals(" ")) {
            return "Producto desconocido";
        }
        return nombre;
    }

    private double determinarPrecio(double precio) {
        if (precio <= 0) {
            return 100;
        }
        return precio;
    }

    private String determinarDepartamento(int departamento) {
        switch (departamento) {
            case 1:
                return "Ropa";
            case 2:
                return "Electrónica y tecnología";
            case 3:
                return "Higiene y cuidado personal";
            case 4:
                return "Alimentos";
            case 5:
                return "Departamento desconocido";
        }

        return "Departamento desconocido";
    }

    //Métodos de acceso
    public String getNombre() {
        return this.nombre;
    } 

    public String getDepartamento(){
        return this.departamento;
    }

    public double getPrecio() {
        return this.precio;
    }

    //Métodos mutantes
    public void setNombre(String nombre) {
        this.nombre = determinarNombre(nombre);
    }

    public void setDepartamento(int departamento) {
        this.departamento = determinarDepartamento(departamento);
    }

    public void setPrecio(double precio) {
        this.precio = determinarPrecio(precio);
    }

    @Override
    public String toString() {
        return "Producto: " + this.nombre +
            ", Departamento: " + this.departamento +
            ", Precio: $" + this.precio;
    }
}