package com.amirmasri.snapple;

/**
 * This class is responsible for generating Snapple Real Facts.
 * @author Amir Masri
 */
public class FactGenerator {

    /**
     * Generate a fact from the Snapple website.
     * @return the generated fact object
     */
    public Fact generateFact() {
        int id = Util.generateId();
        String detail = Util.getFactDetail(id);
        return new Fact(id, detail);
    }

}
