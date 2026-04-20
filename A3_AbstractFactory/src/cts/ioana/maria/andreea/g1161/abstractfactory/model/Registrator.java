package cts.ioana.maria.andreea.g1161.abstractfactory.model;

public class Registrator extends PersonalSpital {
    public Registrator(String nume) { super(nume); }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Registratorul " + getNume());
    }
}