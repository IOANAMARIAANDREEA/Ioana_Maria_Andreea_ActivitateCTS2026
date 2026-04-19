package cts.ioana.maria.andreea.g1161.simplefactory.model;

public class FactoryPersonal {

    public PersonalSpital createPersonal(TipPersonal tip, String nume) {
        switch (tip) {
            case Brancardier:
                return new Brancardier(nume);
            case Asistent:
                return new Asistent(nume);
            case Medic:
                return new Medic(nume);
            default:
                throw new IllegalArgumentException("Tip necunoscut: " + tip);
        }
    }
}
