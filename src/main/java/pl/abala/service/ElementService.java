package pl.abala.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.abala.dao.ElementDao;
import pl.abala.entity.Element;

import java.util.Collection;

@Service
public class ElementService {
    @Autowired
    private ElementDao elementDao;

    public Collection<Element> getPeriodicTable() {
        return this.elementDao.getPeriodicTable();
    }

    public Element getElementByAtomicNumber(int atomicNumber) {
        return this.elementDao.getElementByAtomicNumber(atomicNumber);
    }

    public void delElementByAtomicNumber(int atomicNumber)  {
        this.elementDao.delElementByAtomicNumber(atomicNumber);
    }

    public void updElement(Element element) {
        this.elementDao.updElement(element);
    }

    public void addElement(Element element) {
        this.elementDao.addElement(element);
    }
}