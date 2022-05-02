package com.example.do_math;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class FitnessController {

    @FXML
    private Label messageValue;

    @FXML
    private Button doFitnessCalculationButton;


    @FXML
    private TextField name;
    @FXML
    private TextField steps;
    @FXML
    private TextField weight;
    @FXML
    private TextField height;
    @FXML
    private TextField age;
    @FXML
    private TextField time;

    @FXML
    private Label paceSet;
    @FXML
    private Label caloriesSet;
    @FXML
    private Label bmiSet;
    @FXML
    private Label sphSet;

    @FXML
    protected void doFitnessCalculationButton() {

        float distance = Integer.parseInt(steps.getText()) * 1.2F / 1000; //in km

        float speed = distance / (Float.parseFloat(time.getText()) / 60); //in km/h

        float met = 0;

        //set the MET index according to speed of running
        if (speed < 9.5) {
            met = 8;
        } else {
            if (speed < 12.7) {
                met = 13.5F;
            } else {
                if (speed <= 15.9) {
                    met = 16;
                } else {
                    met = 20;
                }
            }
        }


        float calories = RoundMet((met * 3.5F * (Float.parseFloat(weight.getText()) / 200)));

        float pace = RoundMet((Float.parseFloat(time.getText()) / distance));

        float sph = RoundMet((Integer.parseInt(steps.getText()) / Float.parseFloat(time.getText())));

        float bmi = RoundMet(((Float.parseFloat(weight.getText())) / (float) (Math.pow(Float.parseFloat(height.getText()), 2))));

        paceSet.setText(String.valueOf(pace));
        caloriesSet.setText(String.valueOf(calories));
        bmiSet.setText(String.valueOf(bmi));
        sphSet.setText(String.valueOf(sph));

    }

    //method for number round with 2 digits decimal
    public static float RoundMet(float a){

        double b = Math.pow(10, 2);
        return (float) (Math.ceil(a * b) / b);

    }

}
