package com.example.do_math;

public class DataType {

    private String titleData;
    private String insertType;
    private byte byteType;
    private short shortType;
    private char charType;
    private long longType;
    private int intType;
    private float floatType;
    private double doubleType;
    private String booleanType;

    public DataType(String titleData, String insertType, byte byteType, short shortType, char charType, int intType, long longType, float floatType, double doubleType, String booleanType) {
        this.titleData = titleData;
        this.insertType = insertType;
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

    public String getInsertType() {
        return insertType;
    }

    public void setInsertType(String insertType) {
        this.insertType = insertType;
    }

    public Byte getByteType() {
        return byteType;
    }

    public void setByteType(byte byteType) {
        this.byteType = byteType;
    }

    public Character getCharType() {
        return charType;
    }

    public void setCharType(char charType) {
        this.charType = charType;
    }

    public Short getShortType() {
        return shortType;
    }

    public void setShortType(short shortType) {
        this.shortType = shortType;
    }

    public Long getLongType() {
        return longType;
    }

    public void setLongType(long longType) {
        this.longType = longType;
    }

    public Integer getIntType() {
        return intType;
    }

    public void setIntType(int intType) {
        this.intType = intType;
    }

    public Float getFloatType() {
        return floatType;
    }

    public void setFloatType(float floatType) {
        this.floatType = floatType;
    }

    public Double getDoubleType() {
        return doubleType;
    }

    public void setDoubleType(double doubleType) {
        this.doubleType = doubleType;
    }

    public String getBooleanType() {
        return booleanType;
    }

    public void setBooleanType(String booleanType) {
        this.booleanType = booleanType;
    }
}
