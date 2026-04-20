package cts.ioana.maria.andreea.g1161.prototype.model;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements Cloneable {
    private String nume;
    private Map<String, Double> solutii;

    public Reteta(String nume) {
        this.nume = nume;
        this.solutii = new HashMap<>();
    }

    public void adaugaSolutie(String solutie, double cantitate) {
        solutii.put(solutie, cantitate);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Map<String, Double> getSolutii() {
        return solutii;
    }

    @Override
    public Reteta clone() {
        try {
            Reteta clone = (Reteta) super.clone();
            clone.solutii = new HashMap<>(this.solutii);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "nume='" + nume + '\'' +
                ", solutii=" + solutii +
                '}';
    }
}