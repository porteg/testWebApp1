package com.ibm.test.webapp1;

public class WebApp1 {

    private String dato1 = "";
    private String dato2 = "";
    
    public WebApp1() { }

    public WebApp1(String d1, String d2) {
        this.dato1 = d1;
        this.dato2 = d2;
    }

    public void setDato1(String dato) {
        this.dato1 = dato;
    }

    public void setDato2(String dato) {
        this.dato2 = dato;
    }

    public String getDato1() {
        return this.dato1;
    }

    public String getDato2() {
        return this.dato2;
    }

}