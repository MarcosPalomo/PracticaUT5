package practicas;

import java.util.Objects;

/**
 * Clase que representa la estructura básica que tienen que tener todos los productos de mi tienda.
 * @author Marcos Palomo.
 * @version 1.0
 * @since 01/04/2024.
 * @see MiTienda
 *
 */

public class Producto {

    private String nombre;
    private double precio;

    /**
     * Constructor de mi clase producto.
     *
     * @param nombre El nombre del producto.
     * @param precio El precio del producto.
     */
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Metodo para obtener el nombre del producto.
     *
     *  @return El nombre del producto.
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para obtener el precio del producto.
     *
     * @return El precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     *
     * @param nombre El nombre nuevo.
     * @deprecated Este metodo estña marcado como obsoleto.
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param precio El precio nuevo.
     * @deprecated Este metodo estña marcado como obsoleto.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo para comparar si dos productos son iguales.
     *
     * @param o El objeto con el que deso comparar.
     * @return true si los productos tienen el mismo nombre, false si tiene nombre distinto.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(nombre, producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    /**
     * Método para obtener una cadena que represente un producto.
     *
     * @return Te devulve una cadena que representa al producto devolviendo su nombre y su precio.
     */
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
