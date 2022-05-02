package com.example.do_math;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class DataController {

    //List of DataType Objects have to be created for further collection of Objects and transferring them into Table
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


    @FXML
    private void initialize() {

        //Change listener will be activated when field charValue is changed
        charValue.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(final ObservableValue<? extends String> ov, final String oldValue, final String newValue) {

                //If charValue text field has more than one symbol, the substracting method will remove all symbols
                //excluding the first one.
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

    }

    //Method is creating new cells (now just empty) in the table
    private void setCell(TableColumn element, String elementID) {
        element.setCellValueFactory(new PropertyValueFactory<DataType, String>(elementID));
    }

    @FXML
    protected void doConvertationButton() {

        //clear table from previous data
        dataTypes.clear();


        //filling out the dataTypes List with created Objects DataType
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
            /*
            Char value becomes String after getText method, thus it should be converted to array of chars
            and then the first array element will be converted into different data types.
             */
            char[] stringToChar = charValue.getText().toCharArray();

            /*
            Each entered field data (String) is converting into each of possible data types and then
            converting back to String value because DataType Object has all fields as String.
            if convertation is impossible, the program will fill a cell with "unavailable";
            if convertation is possible but there is no such value among the allowed in convertation data type,
            the program will left an empty cell;
             */
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

            //fill the table with Objects DataType from dataTypes List
            mathTable.setItems(dataTypes);

        } catch (Exception ex) {

            //if you set in the field the value that is out of the range of requested data type, the message
            //will be shown.
            ex.printStackTrace();
            messageValue.setText("One or several fields are out of the range");
        }
    }
}



//doConvertationButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent e) {


                //});
                //}