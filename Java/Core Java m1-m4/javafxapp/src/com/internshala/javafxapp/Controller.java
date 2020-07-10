package com.internshala.javafxapp;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public Label welcomeLabel;

    @FXML
    public ChoiceBox<String> choiceBox;

    @FXML
    public TextField userTextfield;

    @FXML
    public Button convertButton;

    private static final String C_to_F = "Celsius to Faherenhiet";
    private static final String F_to_C = "Faherenhiet to Celsius";

    private boolean isC_to_F = true;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        choiceBox.getItems().add(C_to_F);
        choiceBox.getItems().add(F_to_C);
        choiceBox.setValue(C_to_F);
        choiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) ->
        {
            System.out.println(newValue);
            if(newValue.equals(C_to_F)){
                isC_to_F=true;
            }
            else{
                isC_to_F = false;
            }
        });

        convertButton.setOnAction(event -> {
            convert();
        });
    }

    private void convert() {
        String input = userTextfield.getText();
        float enterTemperature = 0.0f;
        try {
            enterTemperature = Float.parseFloat(input);
        } catch(Exception exception){
            warnuser();
            return;
        }

        float newTemperature = 0.0f;
        if(isC_to_F){
            newTemperature = (enterTemperature * 9/5)+32;
        }
        else{
            newTemperature = (enterTemperature - 32)*5/9;
        }
        display(newTemperature);
    }

    private void warnuser() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Invalid value enter");
        alert.setContentText("Please Enter a valid value");
        alert.show();
    }

    private void display(float newTemperature) {
        String unit = isC_to_F?"F":"C";
        System.out.println("The new Temperature "+newTemperature+" "+unit);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Result");
        alert.setContentText("The new Temperature "+newTemperature+" "+ unit);
        alert.show();
    }
}
