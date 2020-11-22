package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Predmet {
    String naziv;
    int brojECTS;
    List<Student> listaStudenata;

    public Predmet(String naziv, int brojECTS) {
        this.naziv = naziv;
        this.brojECTS = brojECTS;
        listaStudenata = new ArrayList<>();
    }
    public void dodajStudenta(Student student) {
        listaStudenata.add(student);
    }

    public int getBrojECTS() {
        return brojECTS;
    }

    @Override
    public String toString() {
        return "Predmet{" +
                "naziv='" + naziv + '\'' +
                ", brojECTS=" + brojECTS +
                ", listaStudenata=" + listaStudenata +
                '}';
    }
}
