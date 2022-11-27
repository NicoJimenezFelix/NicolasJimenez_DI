package com.example.pizzerianicolas;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    TextField nombre_pedido, telefono_pedido;

    @FXML
    RadioButton rd_familiar, rd_mediana, rd_pequenia;

    @FXML
    Button boton_pedido;

    @FXML
    TextArea resumen_pedido;

    @FXML
    MenuButton tipoPizza;

    @FXML
    MenuItem barbacoa, cuatroquesos, hawaiana, jamonyqueso;

    String tamanio = "";

    ArrayList<Pedido> pedidos = new ArrayList<Pedido>();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        barbacoa.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tipoPizza.setText(barbacoa.getText());
            }
        });
        hawaiana.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tipoPizza.setText(hawaiana.getText());
            }
        });
        cuatroquesos.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tipoPizza.setText(cuatroquesos.getText());
            }
        });
        jamonyqueso.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tipoPizza.setText(jamonyqueso.getText());
            }
        });

        boton_pedido.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (rd_familiar.isSelected()){

                    tamanio = "Familiar";


                } else if (rd_mediana.isSelected()) {

                    tamanio = "Mediana";

                } else if (rd_pequenia.isSelected()) {

                    tamanio = "Pequeña";

                }

                Pizza pizza = new Pizza(tipoPizza.getText(),tamanio);

                pizza.hacerPizza();

                Pedido pedido = new Pedido((pedidos.size()+ 1),Integer.parseInt(telefono_pedido.getText()), nombre_pedido.getText(),pizza);

                pedidos.add(pedido);

                nombre_pedido.setText("");

                telefono_pedido.setText("");

                tipoPizza.setText("");

                rd_pequenia.setSelected(false);
                rd_mediana.setSelected(false);
                rd_familiar.setSelected(false);

                resumen_pedido.appendText(pedido.getId()+"    "+ pedido.getTelefono()+"    "+  pedido.getNombre()+"    "+pizza.getNombre()+"    "+ pizza.getPrecio()+"    "+" \n ");



            }
        });

    }
}