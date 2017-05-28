package pl.abala.dao;

import pl.abala.entity.Element;

import java.util.Collection;

public interface ElementDao {
    Collection<Element> getPeriodicTable();
    Element getElementByAtomicNumber(int atomicNumber);
    void delElementByAtomicNumber(int atomicNumber);
    void updElement(Element element);
    void addElement(Element element);
}