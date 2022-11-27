package com.example.pizzerianicolas;

public class Pedido {

    int id = 0;

    int telefono = 0;

    String nombre = "";

    Pizza pizza;

    public Pedido(int id, int telefono, String nombre, Pizza pizza) {
        this.id = id;
        this.telefono = telefono;
        this.nombre = nombre;
        this.pizza = pizza;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
}
