package cts.ioana.maria.andreea.g1161.abstractfactory.model;

public class Secretar extends PersonalSpital {
    public Secretar(String nume) { super(nume); }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Secretarul " + getNume());
    }
}