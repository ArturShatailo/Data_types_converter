package com.example.do_math;

import com.dlsc.formsfx.model.structure.Field;
import com.dlsc.formsfx.model.structure.IntegerField;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

import java.util.ArrayList;

public class DataController {

    private ObservableList<DataType> dataTypes = FXCollections.observableArrayList();

    @FXML
    private Label messageValue;
    @FXML
    private TableView<DataType> mathTable;
    @FXML
    private TextField DataValue;
    @FXML
    private TableColumn<DataType, String> titleData;
    @FXML
    private TableColumn<DataType, String> insertType;
    @FXML
    private TableColumn<DataType, Byte> byteType;
    @FXML
    private TableColumn<DataType, Character> charType;
    @FXML
    private TableColumn<DataType, Short> shortType;
    @FXML
    private TableColumn<DataType, Long> longType;
    @FXML
    private TableColumn<DataType, Integer> intType;
    @FXML
    private TableColumn<DataType, Float> floatType;
    @FXML
    private TableColumn<DataType, Double> doubleType;
    @FXML
    private TableColumn<DataType, Boolean> booleanType;
    @FXML
    private Button doConvertationButton;


    @FXML
    private TextField byteValue;
    @FXML
    private TextField charValue;
    @FXML
    private TextField shortValue;
    @FXML
    private TextField longValue;
    @FXML
    private TextField intValue;
    @FXML
    private TextField floatValue;
    @FXML
    private TextField doubleValue;
    @FXML
    private TextField booleanValue;


    private static ArrayList <TableColumn<DataType, String>> arrayOfElements = new ArrayList<>();

    @FXML
    private void initialize() {

        charValue.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(final ObservableValue<? extends String> ov, final String oldValue, final String newValue) {
                if (charValue.getText().length() > 1) {
                    String s = charValue.getText().substring(0, 1);
                    charValue.setText(s);
                }
            }
        });

        int a = 90800;
        downloadDataExample("Example (int)", "90800", (byte) a, (short) a, (char) a, (int) a, (long) a, (float) a, (double) a, "unavailable");
        //setCell(titleData, titleData.getId());
        setCell(insertType, insertType.getId());
        setCell(byteType, byteType.getId());
        setCell(charType, charType.getId());
        setCell(shortType, shortType.getId());
        setCell(longType, longType.getId());
        setCell(intType, intType.getId());
        setCell(floatType, floatType.getId());
        setCell(doubleType, doubleType.getId());
        setCell(booleanType, booleanType.getId());

        //insertType.setCellValueFactory(new PropertyValueFactory<DataType, String>("insertType"));
        mathTable.setItems(dataTypes);

    }

    private void setCell(TableColumn element, String elementID) {
        element.setCellValueFactory(new PropertyValueFactory<DataType, String>(elementID));
    }

    private void downloadDataExample(String titleData, String insertType, byte byteType, short shortType, char charType, int intType, long longType, float floatType, double doubleType, String booleanType){
            dataTypes.add(new DataType(titleData, insertType, byteType, shortType, charType, intType, longType, floatType, doubleType, booleanType));
        }

    private void downloadData(String titleData, String insertType, Object value){

        String vByte;
        try {
            vByte = String.valueOf((byte) value);
        }catch (Exception ex){
            ex.printStackTrace();
            vByte = "unavailable";
        }
        short vShort = (short) value;
        char vChar = (char) value;
        int vInt = (int) value;
        long vLong = (long) value;
        float vFloat = (float) value;
        double vDouble = (double) value;
        //boolean vBoolean = value;


        dataTypes.add(new DataType(titleData, insertType, vByte, vShort, vChar, vInt, vLong, vFloat, vDouble, "String"));
    }


    @FXML
    protected void doConvertationButton() {
        doConvertationButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                dataTypes.clear();
                try{
                    downloadData("byte", byteValue.getText(), Byte.parseByte(byteValue.getText()));
                    downloadData("char", charValue.getText(), charValue.getText());
                    downloadData("short", shortValue.getText(), Short.parseShort(shortValue.getText()));
                    downloadData("long", longValue.getText(), Long.parseLong(longValue.getText()));
                    downloadData("int", intValue.getText(), Integer.parseInt(intValue.getText()));
                    downloadData("float", floatValue.getText(), Float.parseFloat(floatValue.getText()));
                    downloadData("double", doubleValue.getText(), Double.parseDouble(doubleValue.getText()));
                    //downloadData("boolean", booleanValue.getText(), booleanValue.getText());
                } catch (Exception ex) {
                    ex.printStackTrace();
                    messageValue.setText("One or several fields are out of the range");
                }
            }
        });
    }
}

