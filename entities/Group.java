/**
 * 
 */
package cs1711.yourface.entities;

import java.util.Set;

/**
 * Author: G. Allen Johnson
 * Project J
 * Class: CS 17.11 - D. Pearson
 * Version: 1.6
 */
public class Group extends AbstractSocialGrouping {

    // Constructor
    public Group(String name, Long id, Set<Person> members) {
        super(members);
        this.name = name;
        this.id = id;
        getMembers();
        // this.members = members;
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

    // Returns Group values when called
    @Override
    public String toString() {
        return "Group: " + getName() + "\nCorporate ID: " + getId()
                + "\nMembers (Past & Present): \n" + members;
    }

}
