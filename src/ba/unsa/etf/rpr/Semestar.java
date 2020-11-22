package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Semestar {
    List<Predmet> listaPredmeta;
    Map<Student, Integer> brojECSTpoSemestru;
    int brojSemestra;

    public Semestar(int brojSemestra, List<Predmet> listaPredmeta) {
        this.listaPredmeta = listaPredmeta;
        this.brojSemestra = brojSemestra;
        brojECSTpoSemestru = new HashMap<>();
    }

    public void upisiStudenta(Student s, List<IzborniPredmet> predmet) throws Exception {

        int brojBodova = 0;
        for(int i = 0; i < listaPredmeta.size(); i++)
            if(listaPredmeta.get(i) instanceof  ObavezniPredmet)
                    brojBodova += listaPredmeta.get(i).getBrojECTS();
        for(int i = 0; i < predmet.size(); i++)
            brojBodova += predmet.get(i).getBrojECTS();
        if(brojBodova < 30) throw new Exception();


        for(int i = 0; i < listaPredmeta.size(); i++) {
            if (listaPredmeta.get(i) instanceof ObavezniPredmet)
                listaPredmeta.get(i).dodajStudenta(s);
            for(int j = 0; j < predmet.size(); j++) {
                if(predmet.get(j) == listaPredmeta.get(i))
                    listaPredmeta.get(i).dodajStudenta(s);
            }
        }
        brojECSTpoSemestru.put(s, brojBodova);
    }

    @Override
    public String toString() {
        return "Semestar{" +
                "listaPredmeta=" + listaPredmeta +
                ", brojSemestra=" + brojSemestra +
                '}';
    }
}
