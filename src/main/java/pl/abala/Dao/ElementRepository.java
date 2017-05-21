package pl.abala.Dao;

import org.springframework.stereotype.Repository;
import pl.abala.Entity.Element;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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
                put(11, new Element(11, 22.98977, "Na", "Sodium"));
                put(12, new Element(12, 24.305, "Mg", "Magnesium"));
                put(13, new Element(13, 26.98154, "Al", "Aluminum"));
                put(14, new Element(14, 28.0855, "Si", "Silicon"));
                put(15, new Element(15, 30.97376, "P", "Phosphorus"));
                put(16, new Element(16, 32.066, "S", "Sulfur"));
                put(17, new Element(17, 35.4527, "Cl", "Chlorine"));
                put(18, new Element(18, 39.948, "Ar", "Argon"));
                put(19, new Element(19, 39.0983, "K", "Potassium"));
                put(20, new Element(20, 40.078, "Ca", "Calcium"));
                put(21, new Element(21, 44.9559, "Sc", "Scandium"));
                put(22, new Element(22, 47.88, "Ti", "Titanium"));
            }
        };
    }

    @Override
    public Collection<Element> getPeriodicTable() {
        return periodicTable.values();
    }

    @Override
    public Element getElementByAtomicNumber(int atomicNumber) {
        return periodicTable.get(atomicNumber);
    }

    @Override
    public void delElementByAtomicNumber(int atomicNumber) {
        periodicTable.remove(atomicNumber);
    }

    @Override
    public void updElement(Element element) {
        Element e = periodicTable.get(element.getAtomicNumber());
        e.setAtomicMass(element.getAtomicMass());
        e.setSymbol(element.getSymbol());
        e.setName(element.getName());
    }

    @Override
    public void addElement(Element element) {
        periodicTable.put(element.getAtomicNumber(), element);
    }
}