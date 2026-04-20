package cts.ioana.maria.andreea.g1161.simplefactory.model;

public class Asistent extends PersonalSpital {
    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Asistentul " + getNume());
    }
}