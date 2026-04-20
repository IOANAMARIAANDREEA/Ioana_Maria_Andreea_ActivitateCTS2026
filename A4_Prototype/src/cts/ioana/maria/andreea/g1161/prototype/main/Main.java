package cts.ioana.maria.andreea.g1161.prototype.main;

import cts.ioana.maria.andreea.g1161.prototype.model.Reteta;

public class Main {
    public static void main(String[] args) {
        // Cream reteta originala
        Reteta retetaOriginala = new Reteta("Aspirina");
        retetaOriginala.adaugaSolutie("Acid acetilsalicilic", 500.0);
        retetaOriginala.adaugaSolutie("Amidon", 50.0);
        retetaOriginala.adaugaSolutie("Apa", 100.0);

        System.out.println("Reteta originala: " + retetaOriginala);

        // Clonam reteta pentru un nou medicament
        Reteta retetaClonata = retetaOriginala.clone();
        retetaClonata.setNume("Aspirina Plus");
        retetaClonata.adaugaSolutie("Vitamina C", 200.0);

        System.out.println("Reteta clonata: " + retetaClonata);
        System.out.println("Reteta originala dupa clonare: " + retetaOriginala);
    }
}