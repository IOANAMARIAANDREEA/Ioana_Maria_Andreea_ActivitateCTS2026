package cts.ioana.maria.andreea.g1161.abstractfactory.model;

public class FactoryPersonalNonMedical implements AbstractFactoryPersonal {

    @Override
    public PersonalSpital createPersonal(TipPersonal tip, String nume) {
        switch (tip) {
            case Secretar:    return new Secretar(nume);
            case Registrator: return new Registrator(nume);
            default: throw new IllegalArgumentException("Tip medical primit in fabrica non-medicala: " + tip);
        }
    }
}