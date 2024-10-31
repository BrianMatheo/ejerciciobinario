
package com.mycompany.ordenararbolbi;
public class Nodo {

    /**
     * @return the marca
     */
    public int getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(int marca) {
        this.marca = marca;
    }


    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    public Nodo(int marca, String nombre, String color) {
        this.marca = marca;
        this.nombre = nombre;
        this.color = color;
        this.nodoIzq = null;
        this.nodoDerecho = null;
    }
    private int marca;
    private String nombre;
    private String color;
    private Nodo nodoIzq;
    private Nodo nodoDerecho;
}
