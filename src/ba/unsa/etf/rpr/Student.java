package ba.unsa.etf.rpr;

import java.util.HashMap;
import java.util.Map;

public class Student {
    String imePrezime;
    int brojInexa;

    public Student(String imePrezime, int brojInexa) {
        this.imePrezime = imePrezime;
        this.brojInexa = brojInexa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imePrezime='" + imePrezime + '\'' +
                ", brojInexa=" + brojInexa +
                '}';
    }
}
