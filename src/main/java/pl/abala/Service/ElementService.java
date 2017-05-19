package pl.abala.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.abala.Dao.ElementDao;
import pl.abala.Entity.Element;

import java.util.Collection;

/**
 * Created by AdB on 23.04.2017.
 */
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