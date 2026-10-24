public class Cajero {
    public static void main(String[] args) {

        //Prueba NOmbre
        Producto productoNombre1 = new Producto("Gansito", 1, 16.99);
        Producto productoNombre2 = new Producto("", 1, 16.99);
        System.out.println(productoNombre1.getNombre());
        System.out.println(productoNombre2.getNombre());

        //Prueba Precio
        Producto productoPrecio1 = new Producto("Gansito", 1, 16.99);
        Producto productoPrecio2 = new Producto("Pluma", 1, 0);
        System.out.println(productoPrecio1.getPrecio());
        System.out.println(productoPrecio2.getPrecio());
    
        //Prueba Departamento
        Producto productoDepartamento1 = new Producto("Producto 1", 1, 50);
        Producto productoDepartamento2 = new Producto("Producto 2", 2, 50);
        Producto productoDepartamento3 = new Producto("Producto 3", 3, 50);
        Producto productoDepartamento4 = new Producto("Producto 4", 4, 50);
        Producto productoDepartamento5 = new Producto("Producto 5", 5, 50);
        System.out.println(productoDepartamento1);
        System.out.println(productoDepartamento2);
        System.out.println(productoDepartamento3);
        System.out.println(productoDepartamento4);
        System.out.println(productoDepartamento5);
    }
}