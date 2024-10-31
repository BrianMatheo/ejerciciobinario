/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenararbolbi;

import javax.swing.JOptionPane;

public class Arbol {
    
    Nodo raiz;
     
    public Arbol() {
        raiz = null;
    }

    public void insertar(int marca, String nombre, String color) {
        raiz = insertarRecursivo(raiz, marca, nombre, color);
    }

    private Nodo insertarRecursivo(Nodo actual, int marca, String nombre, String color) {
        if (actual == null) {
            return new Nodo(marca, nombre, color);
        }

        if (marca == 1) {
            actual.Izq = insertarRecursivo(actual.Izq, marca, nombre, color);
        } else if (marca == 2) {
            actual.Derecho = insertarRecursivo(actual.Derecho, marca, nombre, color);
        }
        return actual;
    }

    public void recorrerInOrden() {
        recorrerInOrdenRecursivo(raiz);
    }

    private void recorrerInOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            recorrerInOrdenRecursivo(nodo.Izq);
            JOptionPane.showMessageDialog(null, nodo.getMarca());
            recorrerInOrdenRecursivo(nodo.Derecho);
        }
    }
}

