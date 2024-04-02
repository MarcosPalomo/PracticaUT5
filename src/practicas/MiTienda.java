package practicas;

import java.util.ArrayList;

/**
 * Esta clase contiene las acciones que se pueden hacer en mi tienda.
 *
 * @author Marcos Palomo.
 * @version 1.0
 * @since 01/04/2024.
 * @see Producto
 * @see TiendaMain
 */

public class MiTienda {

    private ArrayList <Producto> catalogo = new ArrayList <>();

    /**
     * Constructor de la clase MiTienda.
     */
    public MiTienda() {
        this.catalogo = catalogo;
    }

    /**
     * Metodo que se usa para añadir productos a mi lista.
     *
     * @param producto El producto que deseo guardar en el catálogo.
     * @return true si se agrega correctamente, false si el producto ya existe en la lista catálogo.
     */

    public boolean  agregarProducto (Producto producto){
        if (catalogo.contains(producto)){
            System.out.println("No se puede añadir ya que está ese producto ya está en el catalogo");
            return false;
        }else {
            catalogo.add(producto);
            return true;
        }
    }

    /**
     * Metodo para comprar un producto de la tienda.
     *
     * @param producto El producto que se quiere comprar.
     * @return true si la compra se realiza correctamente, false si el producto no existe en la lista catálogo por lo que no se realiza la compra.
     */

    public boolean comprar (Producto producto){
        if (catalogo.contains(producto)){

            return true;

        }else {
            return false;
        }
    }

    /**
     * Metodo para mostrar el catalogo de productos que tiene mi tienda.
     */

    public void mostrarCatalogo(){

        for (Producto producto: catalogo){
            System.out.println(producto.toString());
        }

    }
}
