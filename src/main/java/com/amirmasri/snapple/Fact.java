package com.amirmasri.snapple;

import java.io.Serializable;

/**
 * This class represents a Snapple Real Fact.
 * @author Amir Masri
 */
public class Fact implements Serializable {

    /**
     * Fact constructor.
     * @param id the fact number
     * @param detail the fact detail text
     */
    Fact(Integer id, String detail) {
        this.id = id;
        this.detail = detail;
    }

    private Integer id;
    private String detail;

    @Override
    public String toString() {
        return "Fact #" + this.id + " " + this.detail;
    }

    public Integer getId() {
        return id;
    }

    public String getDetail() {
        return detail;
    }

}
