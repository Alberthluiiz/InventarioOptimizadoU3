package main.util;

import main.model.Producto;
import java.util.ArrayList;
import java.util.List;

public class DatosPrueba {
    public static List<Producto> generarProductos() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Producto1", 50, 10, 20));
        productos.add(new Producto("Producto2", 60, 20, 30));
        productos.add(new Producto("Producto3", 70, 30, 40));
        productos.add(new Producto("Producto4", 80, 40, 50));
        return productos;
    }
}
