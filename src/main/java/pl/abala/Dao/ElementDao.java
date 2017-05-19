package pl.abala.Dao;

import pl.abala.Entity.Element;

import java.util.Collection;

/**
 * Created by AdB on 23.04.2017.
 */
public interface ElementDao {
    Collection<Element> getPeriodicTable();
    Element getElementByAtomicNumber(int atomicNumber);
    void delElementByAtomicNumber(int atomicNumber);
    void updElement(Element element);
    void addElement(Element element);
}