package pl.abala.dao;

import org.springframework.stereotype.Repository;
import pl.abala.entity.Element;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ElementRepository implements ElementDao {
    private static Map<Integer, Element> periodicTable;

    static {
        periodicTable = new HashMap<Integer, Element>();
        periodicTable.put(1, new Element(1, 1.00794, "H", "Hydrogen"));
        periodicTable.put(2, new Element(2, 4.0026, "He", "Helium"));
        periodicTable.put(3, new Element(3, 6.941, "Li", "Lithium"));
        periodicTable.put(5, new Element(5, 10.811, "B", "Boron"));
        periodicTable.put(6, new Element(6, 12.011, "C", "Carbon"));
        periodicTable.put(7, new Element(7, 14.0067, "N", "Nitrogen"));
        periodicTable.put(8, new Element(8, 15.9994, "O", "Oxygen"));
        periodicTable.put(9, new Element(9, 18.9984, "F", "Fluorine"));
        periodicTable.put(10, new Element(10, 20.1797, "Ne", "Neon"));
        periodicTable.put(11, new Element(11, 22.98977, "Na", "Sodium"));
        periodicTable.put(12, new Element(12, 24.305, "Mg", "Magnesium"));
        periodicTable.put(13, new Element(13, 26.98154, "Al", "Aluminum"));
        periodicTable.put(14, new Element(14, 28.0855, "Si", "Silicon"));
        periodicTable.put(15, new Element(15, 30.97376, "P", "Phosphorus"));
        periodicTable.put(16, new Element(16, 32.066, "S", "Sulfur"));
        periodicTable.put(17, new Element(17, 35.4527, "Cl", "Chlorine"));
        periodicTable.put(18, new Element(18, 39.948, "Ar", "Argon"));
        periodicTable.put(19, new Element(19, 39.0983, "K", "Potassium"));
        periodicTable.put(20, new Element(20, 40.078, "Ca", "Calcium"));
        periodicTable.put(21, new Element(21, 44.9559, "Sc", "Scandium"));
        periodicTable.put(22, new Element(22, 47.88, "Ti", "Titanium"));
        periodicTable.put(23, new Element(23, 50.9415, "V", "Vanadium"));
        periodicTable.put(24, new Element(24, 51.996, "Cr", "Chromium"));
        periodicTable.put(25, new Element(25, 54.938, "Mn", "Manganese"));
        periodicTable.put(26, new Element(26, 55.847, "Fe", "Iron"));
        periodicTable.put(27, new Element(27, 58.9332, "Co", "Cobalt"));
        periodicTable.put(28, new Element(28, 58.6934, "Ni", "Nickel"));
        periodicTable.put(29, new Element(29, 63.546, "Cu", "Copper"));
        periodicTable.put(30, new Element(30, 65.39, "Zn", "Zinc"));
        periodicTable.put(31, new Element(31, 69.723, "Ga", "Gallium"));
        periodicTable.put(32, new Element(32, 72.61, "Ge", "Germanium"));
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