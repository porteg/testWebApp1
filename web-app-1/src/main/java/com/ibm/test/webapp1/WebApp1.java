package com.ibm.test.webapp1;

public class WebApp1 {

    private String dato1 = "";
    private String dato2 = "";
    
    public WebApp1() { }

    public WebApp1(String dato1, String dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
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