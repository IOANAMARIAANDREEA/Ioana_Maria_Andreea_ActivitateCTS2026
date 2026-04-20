package cts.ioana.maria.andreea.g1161.abstractfactory.model;

public class Medic extends PersonalSpital {
    public Medic(String nume) { super(nume); }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Medicul " + getNume());
    }
}