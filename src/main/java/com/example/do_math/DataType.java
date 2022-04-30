package com.example.do_math;

public class DataType {

    private String titleData;
    private String byteType;
    private String shortType;
    private String charType;
    private String longType;
    private String intType;
    private String floatType;
    private String doubleType;
    private String booleanType;

    public DataType(String titleData, String byteType, String shortType, String charType, String intType, String longType, String floatType, String doubleType, String booleanType) {
        this.titleData = titleData;
        this.byteType = byteType;
        this.charType = charType;
        this.shortType = shortType;
        this.longType = longType;
        this.intType = intType;
        this.floatType = floatType;
        this.doubleType = doubleType;
        this.booleanType = booleanType;
    }

    public String getTitleData() {
        return titleData;
    }

    public void setTitleData(String titleData) {
        this.titleData = titleData;
    }

    public String getByteType() {
        return byteType;
    }

    public void setByteType(String byteType) {
        this.byteType = byteType;
    }

    public String getCharType() {
        return charType;
    }

    public void setCharType(String charType) {
        this.charType = charType;
    }

    public String getShortType() {
        return shortType;
    }

    public void setShortType(String shortType) {
        this.shortType = shortType;
    }

    public String getLongType() {
        return longType;
    }

    public void setLongType(String longType) {
        this.longType = longType;
    }

    public String getIntType() {
        return intType;
    }

    public void setIntType(String intType) {
        this.intType = intType;
    }

    public String getFloatType() {
        return floatType;
    }

    public void setFloatType(String floatType) {
        this.floatType = floatType;
    }

    public String getDoubleType() {
        return doubleType;
    }

    public void setDoubleType(String doubleType) {
        this.doubleType = doubleType;
    }

    public String getBooleanType() {
        return booleanType;
    }

    public void setBooleanType(String booleanType) {
        this.booleanType = booleanType;
    }
}
