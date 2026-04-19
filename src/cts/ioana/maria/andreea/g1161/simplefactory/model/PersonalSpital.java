package cts.ioana.maria.andreea.g1161.simplefactory.model;

public abstract class PersonalSpital {
    private String nume;

    public PersonalSpital(String nume) {
        this.nume = nume;
    }

    public abstract void afiseazaDescriere();

    public String getNume() {
        return nume;
    }
}
