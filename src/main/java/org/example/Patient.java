package org.example;

public class Patient extends Human{

    protected Disease dis;

    public Patient(String name, int age) {
        super (name, age);
        dis = new Disease("none");
    }

    public void complain(){
        Doctor doc = new Doctor("Иннокентий", 46, "Педиатр");
        doc.diagnose(dis.getSymptoms());
    }
}