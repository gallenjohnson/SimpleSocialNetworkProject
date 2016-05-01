/**
 * 
 */
package cs1711.yourface.entities;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: G. Allen Johnson
 * Project J
 * Class: CS 17.11 - D. Pearson
 * Version: 1.6
 */
public class Band extends AbstractSocialGrouping {

    private Set<Person> fans;
    private String description;
    private String location;

    // Constructor
    public Band(String name, Long id, Set<Person> fans, Set<Person> members,
            String description, String location) {
        super(members);
        fans = new HashSet<Person>();
        this.name = name;
        this.id = id;
        this.fans = fans;
        getMembers();
        this.description = description;
        this.location = location;

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

    public Set<Person> getFans() {
        return fans;
    }

    public void addFans(Person fan) {
        fans.add(fan);

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {

        return location;
    }

    public void setLocation(String location) {
        this.location = location;

    }

    // Returns band data when called
    @Override
    public String toString() {
        return "Band: " + name + "\nID: " + id + "\nPopular with: " + fans
                + "\n" + "\nMembers: " + members + "\n" + "\nStatement: "
                + description + "\nLocation: " + location;
    }

}
