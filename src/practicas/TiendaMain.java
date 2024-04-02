package practicas;
import java.util.Scanner;

/**
 *
 * @author Marcos Palomo
 * @version 2.0
 * @since 01/04/2024
 * @see MiTienda
 * @see Producto
 */

public class TiendaMain {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        MiTienda tienda = new MiTienda();

        tienda.agregarProducto(new Producto("Polo", 50.75));
        tienda.agregarProducto(new Producto("Pantalón", 35));
        tienda.agregarProducto(new Producto("Camiseta", 25));
        tienda.agregarProducto(new Producto("Zapatilla", 95.99));

        System.out.println();

        tienda.mostrarCatalogo();
        System.out.println("Buenas bienvenido a mi tienda que quiere comprar");
        String respuesta = teclado.next();

        if (tienda.comprar(new Producto(respuesta,0))){
            System.out.println("Compra exitosa gracias por comprar.");
        }else {
            System.out.println("Lo siento ha habido un problema con su compra.");
        }

        System.out.println();

        System.out.println("¿Qué producto te gustaría que hubiese en mi tienda");
        String productoUser = teclado.next();
        teclado.nextLine();

        System.out.println("¿Y qué precio tendría?");
        double precioUser = teclado.nextDouble();

        if (tienda.agregarProducto(new Producto(productoUser,precioUser))){
            System.out.println("Añadiendo el producto deseado");
        }

        System.out.println();

        tienda.mostrarCatalogo();

    }
}