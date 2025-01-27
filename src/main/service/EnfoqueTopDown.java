package main.service;

import main.model.Producto;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnfoqueTopDown {
    private final Map<String, Integer> memo = new HashMap<>();

    public int maximizarBeneficio(List<Producto> productos, int capacidad, int presupuesto, int index) {
        if (index == productos.size() || capacidad <= 0 || presupuesto <= 0) {
            return 0;
        }

        String key = index + "-" + capacidad + "-" + presupuesto;

        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        Producto productoActual = productos.get(index);

        int beneficio;
        if (productoActual.getPeso() > capacidad || productoActual.getCosto() > presupuesto) {
            beneficio = maximizarBeneficio(productos, capacidad, presupuesto, index + 1);
        } else {
            int excluido = maximizarBeneficio(productos, capacidad, presupuesto, index + 1);
            int incluido = productoActual.getValor() +
                    maximizarBeneficio(productos, capacidad - productoActual.getPeso(), presupuesto - productoActual.getCosto(), index + 1);
            beneficio = Math.max(incluido, excluido);
        }

        memo.put(key, beneficio);
        return beneficio;
    }
}
