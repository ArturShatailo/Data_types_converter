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

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Base64;

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

        setCell(byteType, byteType.getId());
        setCell(charType, charType.getId());
        setCell(shortType, shortType.getId());
        setCell(longType, longType.getId());
        setCell(intType, intType.getId());
        setCell(floatType, floatType.getId());
        setCell(doubleType, doubleType.getId());
        setCell(booleanType, booleanType.getId());
        mathTable.setItems(dataTypes);

    }

    private void setCell(TableColumn element, String elementID) {
        element.setCellValueFactory(new PropertyValueFactory<DataType, String>(elementID));
    }

    /*
    private void downloadData(String titleData, String insertType, Object value){

        String vByte;
        String vShort;
        String vChar;
        String vInt;
        String vLong;
        String vFloat;
        String vDouble;
        String vBoolean;

        try {
            vByte = String.valueOf((byte) value);
        }catch (Exception ex){
            ex.printStackTrace();
            vByte = "unavailable";
        }
        try {
            vShort = String.valueOf((short) value);
        }catch (Exception ex){
            ex.printStackTrace();
            vShort = "unavailable";
        }
        try {
            vChar = String.valueOf((char) value);
        }catch (Exception ex){
            ex.printStackTrace();
            vChar = "unavailable";
        }
        try {
            vInt = String.valueOf((int) value);
        }catch (Exception ex){
            ex.printStackTrace();
            vInt = "unavailable";
        }
        try {
            vLong = String.valueOf((long) value);
        }catch (Exception ex){
            ex.printStackTrace();
            vLong = "unavailable";
        }
        try {
            vFloat = String.valueOf((float) value);
        }catch (Exception ex){
            ex.printStackTrace();
            vFloat = "unavailable";
        }
        try {
            vDouble = String.valueOf((double) value);
        }catch (Exception ex){
            ex.printStackTrace();
            vDouble = "unavailable";
        }
        try {
            vBoolean = String.valueOf((boolean) value);
        }catch (Exception ex){
            ex.printStackTrace();
            vBoolean = "unavailable";
        }

        dataTypes.add(new DataType(titleData, insertType, vByte, vShort, vChar, vInt, vLong, vFloat, vDouble, vBoolean));

    }*/


    @FXML
    protected void doConvertationButton() {
        doConvertationButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                dataTypes.clear();

                dataTypes.add(new DataType("ENTERED VALUES:",
                        byteValue.getText(),
                        shortValue.getText(),
                        charValue.getText(),
                        intValue.getText(),
                        longValue.getText(),
                        floatValue.getText(),
                        doubleValue.getText(),
                        booleanValue.getText()));

                try{

                    char[] stringToChar = charValue.getText().toCharArray();
                    dataTypes.add(new DataType("byte",
                            String.valueOf((byte) Byte.parseByte(byteValue.getText())),
                            String.valueOf((byte) Short.parseShort(shortValue.getText())),
                            String.valueOf((byte) stringToChar[0]),
                            String.valueOf((byte) Integer.parseInt(intValue.getText())),
                            String.valueOf((byte) Long.parseLong(longValue.getText())),
                            String.valueOf((byte) Float.parseFloat(floatValue.getText())),
                            String.valueOf((byte) Double.parseDouble(doubleValue.getText())),
                            "unavailable"));

                    dataTypes.add(new DataType("char",
                            String.valueOf((char) Byte.parseByte(byteValue.getText())),
                            String.valueOf((char) Short.parseShort(shortValue.getText())),
                            String.valueOf((char) stringToChar[0]),
                            String.valueOf((char) Integer.parseInt(intValue.getText())),
                            String.valueOf((char) Long.parseLong(longValue.getText())),
                            String.valueOf((char) Float.parseFloat(floatValue.getText())),
                            String.valueOf((char) Double.parseDouble(doubleValue.getText())),
                            "unavailable"));

                    dataTypes.add(new DataType("short",
                            String.valueOf((short) Byte.parseByte(byteValue.getText())),
                            String.valueOf((short) Short.parseShort(shortValue.getText())),
                            String.valueOf((short) stringToChar[0]),
                            String.valueOf((short) Integer.parseInt(intValue.getText())),
                            String.valueOf((short) Long.parseLong(longValue.getText())),
                            String.valueOf((short) Float.parseFloat(floatValue.getText())),
                            String.valueOf((short) Double.parseDouble(doubleValue.getText())),
                            "unavailable"));

                    dataTypes.add(new DataType("long",
                            String.valueOf((long) Byte.parseByte(byteValue.getText())),
                            String.valueOf((long) Short.parseShort(shortValue.getText())),
                            String.valueOf((long) stringToChar[0]),
                            String.valueOf((long) Integer.parseInt(intValue.getText())),
                            String.valueOf((long) Long.parseLong(longValue.getText())),
                            String.valueOf((long) Float.parseFloat(floatValue.getText())),
                            String.valueOf((long) Double.parseDouble(doubleValue.getText())),
                            "unavailable"));

                    dataTypes.add(new DataType("int",
                            String.valueOf((int) Byte.parseByte(byteValue.getText())),
                            String.valueOf((int) Short.parseShort(shortValue.getText())),
                            String.valueOf((int) stringToChar[0]),
                            String.valueOf((int) Integer.parseInt(intValue.getText())),
                            String.valueOf((int) Long.parseLong(longValue.getText())),
                            String.valueOf((int) Float.parseFloat(floatValue.getText())),
                            String.valueOf((int) Double.parseDouble(doubleValue.getText())),
                            "unavailable"));

                    dataTypes.add(new DataType("float",
                            String.valueOf((float) Byte.parseByte(byteValue.getText())),
                            String.valueOf((float) Short.parseShort(shortValue.getText())),
                            String.valueOf((float) stringToChar[0]),
                            String.valueOf((float) Integer.parseInt(intValue.getText())),
                            String.valueOf((float) Long.parseLong(longValue.getText())),
                            String.valueOf((float) Float.parseFloat(floatValue.getText())),
                            String.valueOf((float) Double.parseDouble(doubleValue.getText())),
                            "unavailable"));

                    dataTypes.add(new DataType("double",
                            String.valueOf((double) Byte.parseByte(byteValue.getText())),
                            String.valueOf((double) Short.parseShort(shortValue.getText())),
                            String.valueOf((double) stringToChar[0]),
                            String.valueOf((double) Integer.parseInt(intValue.getText())),
                            String.valueOf((double) Long.parseLong(longValue.getText())),
                            String.valueOf((double) Float.parseFloat(floatValue.getText())),
                            String.valueOf((double) Double.parseDouble(doubleValue.getText())),
                            "unavailable"));

                    dataTypes.add(new DataType("boolean",
                            "unavailable",
                            "unavailable",
                            "unavailable",
                            "unavailable",
                            "unavailable",
                            "unavailable",
                            "unavailable",
                            booleanValue.getText()));


                    //downloadData("byte", byteValue.getText(), Byte.parseByte(byteValue.getText()));
                    //downloadData("char", charValue.getText(), charValue.getText());
                    //downloadData("short", shortValue.getText(), Short.parseShort(shortValue.getText()));
                    //downloadData("long", longValue.getText(), Long.parseLong(longValue.getText()));
                    /*downloadData("int", intValue.getText(), Integer.parseInt(intValue.getText()));
                    downloadData("float", floatValue.getText(), Float.parseFloat(floatValue.getText()));
                    downloadData("double", doubleValue.getText(), Double.parseDouble(doubleValue.getText()));
                    downloadData("boolean", booleanValue.getText(), booleanValue.getText());*/
                } catch (Exception ex) {
                    ex.printStackTrace();
                    messageValue.setText("One or several fields are out of the range");
                }
            }
        });
    }
}

