package com.example.do_math;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DoMathApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(DoMathApplication.class.getResource("table-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 772, 632);
        stage.setTitle("Do convert of Data type");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}