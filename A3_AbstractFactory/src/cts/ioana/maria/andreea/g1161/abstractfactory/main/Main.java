package cts.ioana.maria.andreea.g1161.abstractfactory.main;

import cts.ioana.maria.andreea.g1161.abstractfactory.model.*;

public class Main {
    public static void main(String[] args) {
        AbstractFactoryPersonal fabricaMedicala = new FactoryPersonalMedical();
        AbstractFactoryPersonal fabricaNonMedicala = new FactoryPersonalNonMedical();

        PersonalSpital medic = fabricaMedicala.createPersonal(TipPersonal.Medic, "Ion Popescu");
        PersonalSpital asistent = fabricaMedicala.createPersonal(TipPersonal.Asistent, "Maria Ionescu");
        PersonalSpital brancardier = fabricaMedicala.createPersonal(TipPersonal.Brancardier, "George Marin");

        PersonalSpital secretar = fabricaNonMedicala.createPersonal(TipPersonal.Secretar, "Ana Dumitrescu");
        PersonalSpital registrator = fabricaNonMedicala.createPersonal(TipPersonal.Registrator, "Mihai Popa");

        medic.afiseazaDescriere();
        asistent.afiseazaDescriere();
        brancardier.afiseazaDescriere();
        secretar.afiseazaDescriere();
        registrator.afiseazaDescriere();
    }
}