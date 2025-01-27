package main.model;
public class Producto {
    private String nombre;
    private int valor;
    private int peso;
    private int costo;

    public Producto(String nombre, int valor, int peso, int costo) {
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }

    public int getPeso() {
        return peso;
    }

    public int getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", valor=" + valor +
                ", peso=" + peso +
                ", costo=" + costo +
                '}';
    }
}
