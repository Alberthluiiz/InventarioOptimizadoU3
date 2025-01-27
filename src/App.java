package main;

import main.model.Producto;
import main.service.EnfoqueBottomUp;
import main.service.EnfoqueRecursivo;
import main.service.EnfoqueTopDown;
import main.util.DatosPrueba;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Producto> productos = DatosPrueba.generarProductos();
        int capacidad = 50;
        int presupuesto = 100;

        // Enfoque Recursivo
        EnfoqueRecursivo recursivo = new EnfoqueRecursivo();
        System.out.println("Recursivo: " + recursivo.maximizarBeneficio(productos, capacidad, presupuesto, 0));

        // Enfoque Bottom-Up
        EnfoqueBottomUp bottomUp = new EnfoqueBottomUp();
        System.out.println("Bottom-Up: " + bottomUp.maximizarBeneficio(productos, capacidad, presupuesto));

        // Enfoque Top-Down
        EnfoqueTopDown topDown = new EnfoqueTopDown();
        System.out.println("Top-Down: " + topDown.maximizarBeneficio(productos, capacidad, presupuesto, 0));
    }
}
