package cts.ioana.maria.andreea.g1161.abstractfactory.model;

public class FactoryPersonalMedical implements AbstractFactoryPersonal {

    @Override
    public PersonalSpital createPersonal(TipPersonal tip, String nume) {
        switch (tip) {
            case Brancardier: return new Brancardier(nume);
            case Asistent:    return new Asistent(nume);
            case Medic:       return new Medic(nume);
            default: throw new IllegalArgumentException("Tip non-medical primit in fabrica medicala: " + tip);
        }
    }
}