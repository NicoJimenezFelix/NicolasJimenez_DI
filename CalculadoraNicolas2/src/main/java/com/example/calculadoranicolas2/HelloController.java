package com.example.calculadoranicolas2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Button cero;

    @FXML
    private Button uno;

    @FXML
    private Button dos;

    @FXML
    private Button tres;

    @FXML
    private Button cuatro;

    @FXML
    private Button cinco;

    @FXML
    private Button seis;

    @FXML
    private Button siete;

    @FXML
    private Button ocho;

    @FXML
    private Button nueve;

    @FXML
    private Button delete;

    @FXML
    private Button suma;

    @FXML
    private Button resta;

    @FXML
    private Button multiplicar;

    @FXML
    private Button dividir;

    @FXML
    private Button deciamal;
    @FXML
    private Button igual;

    @FXML
    private TextField cuadro_operaciones;

    @FXML
    private ToggleButton boton_sci;

    @FXML
    private ToggleButton boton_registro;

    @FXML
    private GridPane panel_registro;

    @FXML
    private GridPane panel_sci;

    @FXML
    private BorderPane calculadora_pane;


    double op1 = 0;
    double op2 = 0;
    String operacion;
    double resultado;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        calculadora_pane.getChildren().remove(panel_sci);
        calculadora_pane.getChildren().remove(panel_registro);

        uno.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                cuadro_operaciones.setText(cuadro_operaciones.getText() + uno.getText());
            }
        });

        dos.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                cuadro_operaciones.setText(cuadro_operaciones.getText() + dos.getText());
            }
        });

        tres.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                cuadro_operaciones.setText(cuadro_operaciones.getText() + tres.getText());
            }
        });

        cuatro.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                cuadro_operaciones.setText(cuadro_operaciones.getText() + cuatro.getText());
            }
        });

        cinco.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                cuadro_operaciones.setText(cuadro_operaciones.getText() + cinco.getText());
            }
        });

        seis.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                cuadro_operaciones.setText(cuadro_operaciones.getText() + seis.getText());
            }
        });

        siete.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                cuadro_operaciones.setText(cuadro_operaciones.getText() + siete.getText());
            }
        });

        ocho.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                cuadro_operaciones.setText(cuadro_operaciones.getText() + ocho.getText());
            }
        });

        nueve.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                cuadro_operaciones.setText(cuadro_operaciones.getText() + nueve.getText());
            }
        });

        cero.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                cuadro_operaciones.setText(cuadro_operaciones.getText() + cero.getText());
            }
        });

        deciamal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                cuadro_operaciones.setText(cuadro_operaciones.getText() + deciamal.getText());
            }
        });



        suma.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                op1 = Double.parseDouble(cuadro_operaciones.getText());
                cuadro_operaciones.setText("");
                operacion = "+";
            }
        });

        resta.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                op1 = Double.parseDouble(cuadro_operaciones.getText());
                cuadro_operaciones.setText("");
                operacion = "-";
            }
        });

        multiplicar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                op1 = Double.parseDouble(cuadro_operaciones.getText());
                cuadro_operaciones.setText("");
                operacion = "x";
            }
        });

        dividir.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                op1 = Double.parseDouble(cuadro_operaciones.getText());
                cuadro_operaciones.setText("");
                operacion = "/";
            }
        });

        igual.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                op2 = Double.parseDouble(cuadro_operaciones.getText());
                switch (operacion){
                    case "+":
                        resultado = op1 + op2;
                        break;
                    case "-":
                        resultado = op1 - op2;
                        break;
                    case "x":
                        resultado = op1 * op2;
                        break;
                    case "/":
                        resultado = op1 / op2;
                        break;
                }
                cuadro_operaciones.setText(String.valueOf(resultado));
            }
        });

        delete.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                cuadro_operaciones.setText("");
            }
        });

        boton_sci.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                if (boton_sci.isSelected()){
                    calculadora_pane.setLeft(panel_sci);
                }else {
                    calculadora_pane.getChildren().remove(panel_sci);
                }

            }
        });

        boton_registro.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                if (boton_registro.isSelected()){
                    calculadora_pane.setRight(panel_registro);
                }else {
                    calculadora_pane.getChildren().remove(panel_registro);
                }

            }
        });
    }
}