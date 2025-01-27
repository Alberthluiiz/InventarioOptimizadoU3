package main.service;

import main.model.Producto;
import java.util.List;

public class EnfoqueRecursivo {
    public int maximizarBeneficio(List<Producto> productos, int capacidad, int presupuesto, int index) {
        if (index == productos.size() || capacidad <= 0 || presupuesto <= 0) {
            return 0;
        }

        Producto productoActual = productos.get(index);

        // Si no podemos incluir el producto actual
        if (productoActual.getPeso() > capacidad || productoActual.getCosto() > presupuesto) {
            return maximizarBeneficio(productos, capacidad, presupuesto, index + 1);
        }

        // Caso 1: Excluimos el producto actual
        int beneficioExcluido = maximizarBeneficio(productos, capacidad, presupuesto, index + 1);

        // Caso 2: Incluimos el producto actual
        int beneficioIncluido = productoActual.getValor() +
                maximizarBeneficio(productos, capacidad - productoActual.getPeso(), presupuesto - productoActual.getCosto(), index + 1);

        // Retornamos el máximo beneficio
        return Math.max(beneficioIncluido, beneficioExcluido);
    }
}
