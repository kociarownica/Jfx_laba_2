package org.example;

public class Doctor extends Human {

    private String specialty;

    public Doctor(String name, int age, String specialty) {
        super (name, age);
        this.specialty = specialty;
    };

    public String treat(String str){
        return str;
    };

    public void diagnose(String str){
        this.treat(str);
    };
}
