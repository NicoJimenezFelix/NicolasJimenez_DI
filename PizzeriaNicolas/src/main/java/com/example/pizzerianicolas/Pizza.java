package com.example.pizzerianicolas;

import java.util.ArrayList;

public class Pizza {

    String nombre = "";

    String tamanio = "";
    ArrayList <IngredientesPizza> ingredientes = new ArrayList<IngredientesPizza>();
    int precio;

    public Pizza(String nombre, String tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

    public void hacerPizza() {
        if (nombre.equalsIgnoreCase("Barbacoa")) {
            ingredientes.add(new IngredientesPizza("Bacon"));
            ingredientes.add(new IngredientesPizza("Barbacoa"));
            ingredientes.add(new IngredientesPizza("Cebolla"));
            ingredientes.add(new IngredientesPizza("Maiz"));
            ingredientes.add(new IngredientesPizza("Chicha"));
            if (tamanio.equalsIgnoreCase("Pequeña")) {
                precio = 7;

            } else if (tamanio.equalsIgnoreCase("Mediana")) {
                precio = 12;

            } else if (tamanio.equalsIgnoreCase("Familiar")) {
                precio = 15;
            }
        }
        if (nombre.equalsIgnoreCase("Hawaiana")) {
            ingredientes.add(new IngredientesPizza("Piña"));
            ingredientes.add(new IngredientesPizza("Salsa"));
            ingredientes.add(new IngredientesPizza("Jamon"));
            if (tamanio.equalsIgnoreCase("Pequeña")) {
                precio = 7;

            } else if (tamanio.equalsIgnoreCase("Mediana")) {
                precio = 12;

            } else if (tamanio.equalsIgnoreCase("Familiar")) {
                precio = 15;
            }

        }
        if (nombre.equalsIgnoreCase("Jamon Y Queso")) {
            ingredientes.add(new IngredientesPizza("Jamon"));
            ingredientes.add(new IngredientesPizza("Queso"));

            if (tamanio.equalsIgnoreCase("Pequeña")) {
                precio = 7;

            } else if (tamanio.equalsIgnoreCase("Mediana")) {
                precio = 12;

            } else if (tamanio.equalsIgnoreCase("Familiar")) {
                precio = 15;
            }

        }
        if (nombre.equalsIgnoreCase("Cuatro Quesos")) {
            ingredientes.add(new IngredientesPizza("Queso Gouda"));
            ingredientes.add(new IngredientesPizza("Queso Parmesano"));
            ingredientes.add(new IngredientesPizza("Queso Bomngiorno"));
            ingredientes.add(new IngredientesPizza("Queso Fratelli"));
            if (tamanio.equalsIgnoreCase("Pequeña")) {
                precio = 7;

            } else if (tamanio.equalsIgnoreCase("Mediana")) {
                precio = 12;

            } else if (tamanio.equalsIgnoreCase("Familiar")) {
                precio = 15;
            }

        }
    }

    public void mostrarDatosPizza(){
        System.out.println(nombre);
        System.out.println(tamanio);
        System.out.println(precio);
        System.out.println(ingredientes);

        for (int i = 0; i < ingredientes.size(); i++) {

            System.out.println(ingredientes.get(i).getNombre());
            
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public ArrayList<IngredientesPizza> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<IngredientesPizza> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
