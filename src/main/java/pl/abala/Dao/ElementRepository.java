package pl.abala.Dao;

import org.springframework.stereotype.Repository;
import pl.abala.Entity.Element;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by AdB on 23.04.2017.
 */
@Repository
public class ElementRepository implements ElementDao {
    private static Map<Integer, Element> periodicTable;

    static {
        periodicTable = new HashMap<Integer, Element>() {
            {
                put(1, new Element(1, 1.00794, "H", "Hydrogen"));
                put(2, new Element(2, 4.0026, "He", "Helium"));
                put(3, new Element(3, 6.941, "Li", "Lithium"));
				put(5, new Element(5, 10.811, "B", "Boron"));
				put(6, new Element(6, 12.011, "C", "Carbon"));
				put(7, new Element(7, 14.0067, "N", "Nitrogen"));
				put(8, new Element(8, 15.9994, "O", "Oxygen"));
				put(9, new Element(9, 18.9984, "F", "Fluorine"));
				put(10, new Element(10, 20.1797, "Ne", "Neon"));
            }
        };
    }

    @Override
    public Collection<Element> getPeriodicTable() {
        return this.periodicTable.values();
    }

    @Override
    public Element getElementByAtomicNumber(int atomicNumber) {
        return this.periodicTable.get(atomicNumber);
    }

    @Override
    public void delElementByAtomicNumber(int atomicNumber) {
        this.periodicTable.remove(atomicNumber);
    }

    @Override
    public void updElement(Element element) {
        Element e = this.periodicTable.get(element.getAtomicNumber());
        e.setAtomicMass(element.getAtomicMass());
        e.setSymbol(element.getSymbol());
        e.setName(element.getName());
    }

    @Override
    public void addElement(Element element) {
        this.periodicTable.put(element.getAtomicNumber(), element);
    }
}