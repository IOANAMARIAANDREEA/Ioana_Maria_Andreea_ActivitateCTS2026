package cts.ioana.maria.andreea.g1161.builder.model;

public class Pacient {
    private String nume;
    private String prenume;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halatInterior;

    // Constructorul este privat, obiectul se va crea prin Builder
    private Pacient() { }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", patRabatabil=" + patRabatabil +
                ", micDejunInclus=" + micDejunInclus +
                ", papuciCamera=" + papuciCamera +
                ", halatInterior=" + halatInterior +
                '}';
    }

    // -----------------------
    // Inner static class Builder
    // -----------------------
    public static class PacientBuilder {
        private String nume;
        private String prenume;
        private boolean patRabatabil;
        private boolean micDejunInclus;
        private boolean papuciCamera;
        private boolean halatInterior;

        public PacientBuilder(String nume, String prenume) {
            this.nume = nume;
            this.prenume = prenume;
        }

        public PacientBuilder cuPatRabatabil() {
            this.patRabatabil = true;
            return this;
        }

        public PacientBuilder cuMicDejunInclus() {
            this.micDejunInclus = true;
            return this;
        }

        public PacientBuilder cuPapuciCamera() {
            this.papuciCamera = true;
            return this;
        }

        public PacientBuilder cuHalatInterior() {
            this.halatInterior = true;
            return this;
        }

        public Pacient build() {
            Pacient p = new Pacient();
            p.nume = this.nume;
            p.prenume = this.prenume;
            p.patRabatabil = this.patRabatabil;
            p.micDejunInclus = this.micDejunInclus;
            p.papuciCamera = this.papuciCamera;
            p.halatInterior = this.halatInterior;
            return p;
        }
    }
}
