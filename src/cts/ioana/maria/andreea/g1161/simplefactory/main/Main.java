package cts.ioana.maria.andreea.g1161.simplefactory.main;

import cts.ioana.maria.andreea.g1161.simplefactory.model.*;

public class Main {
    public static void main(String[] args) {
        FactoryPersonal fabrica = new FactoryPersonal();

        PersonalSpital medic = fabrica.createPersonal(TipPersonal.Medic, "Ion Popescu");
        PersonalSpital asistent = fabrica.createPersonal(TipPersonal.Asistent, "Maria Ionescu");
        PersonalSpital brancardier = fabrica.createPersonal(TipPersonal.Brancardier, "George Marin");

        medic.afiseazaDescriere();
        asistent.afiseazaDescriere();
        brancardier.afiseazaDescriere();
    }
}