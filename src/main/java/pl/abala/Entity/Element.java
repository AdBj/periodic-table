package pl.abala.Entity;

import org.springframework.data.annotation.Id;

/**
 * Created by AdB on 23.04.2017.
 */
public class Element {
    @Id
    int atomicNumber;
    double atomicMass;
    String symbol;
    String name;

    public Element(int atomicNumber, double atomicMass, String symbol, String name) {
        this.atomicNumber = atomicNumber;
        this.atomicMass = atomicMass;
        this.symbol = symbol;
        this.name = name;
    }

    public Element(){}

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public double getAtomicMass() {
        return atomicMass;
    }

    public void setAtomicMass(double atomicMass) {
        this.atomicMass = atomicMass;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}