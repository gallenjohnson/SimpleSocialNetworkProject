/**
 * 
 */
package cs1711.yourface.entities;

import java.util.Set;

/**
 * Author: G. Allen Johnson
 * Project J
 * Class: CS 17.11 - D. Pearson
 * Version: 1.9
 */
public class Network extends AbstractSocialGrouping {

    // Constructor
    public Network(String name, Long id, Set<Person> members) {
        super(members);
        this.name = name;
        this.id = id;
        getMembers();
    }

    // Getters and Setters
    @Override
    public String getName() {

        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public long getId() {

        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;

    }

    // Only returns name value to avoid infinite self-reference loop
    @Override
    public String toString() {
        // return name;
        return name; // + "\nMembers: " + members;
    }

}
