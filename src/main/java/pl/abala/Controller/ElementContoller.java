package pl.abala.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.abala.Entity.Element;
import pl.abala.Service.ElementService;

import java.awt.*;
import java.util.Collection;

/**
 * Created by AdB on 24.04.2017.
 */
@RestController
@RequestMapping("/elements")
public class ElementContoller {
    @Autowired
    private ElementService elementService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Element> getPeriodicTable() {
        return this.elementService.getPeriodicTable();
    }

    @RequestMapping(value = "/{atomicNumber}", method = RequestMethod.GET)
    public Element getElementByAtomicNumber(@PathVariable("atomicNumber") int atomicNumber) {
        return this.elementService.getElementByAtomicNumber(atomicNumber);
    }

    @RequestMapping(value = "/{atomicNumber}", method = RequestMethod.DELETE)
    void delElementByAtomicNumber(@PathVariable("atomicNumber") int atomicNumber) {
        this.elementService.delElementByAtomicNumber(atomicNumber);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    void updElementByAtomicNumber(@RequestBody Element element) {
        this.elementService.updElement(element);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    void addElementByAtomicNumber(@RequestBody Element element) {
        this.elementService.addElement(element);
    }
}