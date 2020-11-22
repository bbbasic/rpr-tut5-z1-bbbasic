package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        List<Predmet> p = new ArrayList<>();
        ObavezniPredmet p1 = new ObavezniPredmet("Inzenjerska matematika 1", 20);
        IzborniPredmet p2 = new IzborniPredmet("Inzenjerska fizika 1", 1);
        p.add(p1);
        p.add(p2);
        Semestar s = new Semestar(1,p);

        List<IzborniPredmet> ip = new ArrayList<>();
        ip.add((IzborniPredmet) p2);

        Student student = new Student("Meho Mehic", 1);
        s.upisiStudenta(student, ip);

        System.out.println(s.toString());



    }
}
