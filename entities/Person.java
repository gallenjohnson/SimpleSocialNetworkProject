/**
 * 
 */
package cs1711.yourface.entities;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Author: G. Allen Johnson
 * Project J
 * Class: CS 17.11 - D. Pearson
 * Version: 3.x
 */
public class Person extends AbstractSocialEntity {

    private Map<Person, Relationship> acquaintances;
    private Set<Network> networks;
    private String location;

    public Person() {

    }

    // Constructor that creates acquaintances
    public Person(String name, Long id) {
        super();
        this.name = name;
        this.id = id;
    }

    // Constructor that creates the initial set of 7 persons
    public Person(String name, Long id,
            Map<Person, Relationship> acquaintances, Set<Network> networks,
            String location) {
        super();
        acquaintances = new HashMap<Person, Relationship>();
        networks = new HashSet<Network>();
        this.name = name;
        this.id = id;
        this.acquaintances = acquaintances;
        this.networks = networks;
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

    public Map<Person, Relationship> getAcquaintances() {
        return acquaintances;

    }

    public void setAcquaintances(Person person, Relationship relationship) {
        acquaintances.put(person, relationship);

    }

    public Set<Network> getNetworks() {
        return networks;
    }

    public void setNetworks(AbstractSocialGrouping network) {
        networks.add((Network) network);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return (name != null ? "\n" + "\nName: " + name : "")
                + "\nID: "
                + id
                + (acquaintances != null ? "\nKnown Associates: "
                        + acquaintances : "")
                + (networks != null ? "\n" + "\nNetworks: " + networks : "")
                + (location != null ? "\nCurrent Whereabouts: " + location : "");

    }

}
