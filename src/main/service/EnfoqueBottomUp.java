package main.service;

import main.model.Producto;
import java.util.List;

public class EnfoqueBottomUp {
    public int maximizarBeneficio(List<Producto> productos, int capacidad, int presupuesto) {
        int[][][] dp = new int[productos.size() + 1][capacidad + 1][presupuesto + 1];

        for (int i = 1; i <= productos.size(); i++) {
            Producto producto = productos.get(i - 1);
            for (int c = 0; c <= capacidad; c++) {
                for (int p = 0; p <= presupuesto; p++) {
                    if (producto.getPeso() <= c && producto.getCosto() <= p) {
                        dp[i][c][p] = Math.max(dp[i - 1][c][p], producto.getValor() + dp[i - 1][c - producto.getPeso()][p - producto.getCosto()]);
                    } else {
                        dp[i][c][p] = dp[i - 1][c][p];
                    }
                }
            }
        }
        return dp[productos.size()][capacidad][presupuesto];
    }
}
