package cts.ioana.maria.andreea.g1161.builder.main;

import cts.ioana.maria.andreea.g1161.builder.model.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient.PacientBuilder("Ioana", "Maria")
                .cuPatRabatabil()
                .cuMicDejunInclus()
                .cuHalatInterior()
                .build();

        System.out.println(pacient);
    }
}
