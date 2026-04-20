package cts.ioana.maria.andreea.g1161.simplefactory.model;

public class Brancardier extends PersonalSpital {
    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Brancardierul " + getNume());
    }
}


