package cs1711.yourface.entities;

/**
 * Author: G. Allen Johnson
 * Project J
 * Class: CS 17.11 - D. Pearson
 * Version: 1.3
 */

public class Relationship {
    private String type;
    private boolean isMutual;

    public Relationship() {
    }

    public Relationship(String type, boolean isMutual) {
        this.type = type;
        this.isMutual = isMutual;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isMutual() {
        return isMutual;
    }

    public void setMutual(boolean isMutual) {
        this.isMutual = isMutual;
    }

    @Override
    public String toString() {
        return "\nRelationship: " + type + "\nMutual: " + isMutual;
    }

}
