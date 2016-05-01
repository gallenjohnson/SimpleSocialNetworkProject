/**
 * 
 */
package cs1711.yourface;

import cs1711.yourface.entities.AbstractSocialGrouping;
import cs1711.yourface.entities.Band;
import cs1711.yourface.entities.Group;
import cs1711.yourface.entities.Network;
import cs1711.yourface.entities.Person;
import cs1711.yourface.entities.Relationship;

/**
 * Author: G. Allen Johnson
 * Project J
 * Class: CS 17.11 - D. Pearson
 * Version: 3.x
 */
public class YourFace {

    public void fillNetwork(Network n, Person p) {

        n.addMember(p);
    }

    public void fillGroup(Group g, Person p) {

        g.addMember(p);
    }

    public void fillBandFans(Band b, Person fan) {

        b.addFans(fan);
    }

    public void fillBandMembers(Band b, Person p) {

        b.addMember(p);
    }

    public static void main(String[] args) {

        // Makes groups
        AbstractSocialGrouping group1 = new Group("The Blue Sun Corporation",
                8L, null);
        AbstractSocialGrouping group2 = new Group("The Independents", 9L, null);

        // Makes networks
        AbstractSocialGrouping network1 = new Network("The Companion's Guild",
                10L, null);
        AbstractSocialGrouping network2 = new Network("The Crew", 11L, null);

        // Makes bands
        AbstractSocialGrouping band1 = new Band("Brown Coats", 12L, null, null,
                "We have done the impossible and that makes us mighty.",
                "The 'verse");
        AbstractSocialGrouping band2 = new Band("The Alliance", 13L, null,
                null, "Building better worlds.", "The Central Planets");

        // Creates and defines Persons

        Person person1 = new Person("Malcolm Reynolds", 1L, null, null,
                "Serenity");
        Person person2 = new Person("Zoe Washburne", 2L, null, null,
                "The Bridge");
        Person person3 = new Person("Shepherd Book", 3L, null, null,
                "Common Area");
        Person person4 = new Person("Inara Serra", 4L, null, null, "Shuttle");
        Person person5 = new Person("Kaylee Frye", 5L, null, null,
                "Engine Room");
        Person person6 = new Person("River Tam", 6L, null, null, "Infirmary");
        Person person7 = new Person("Jayne Cobb", 7L, null, null, "Bunk");

        // Sets networks for created persons
        person1.setNetworks(network2);
        person2.setNetworks(network2);
        person3.setNetworks(network2);
        person4.setNetworks(network1);
        person4.setNetworks(network2);
        person5.setNetworks(network2);
        person6.setNetworks(network2);
        person7.setNetworks(network2);

        // Sets acquaintances for created persons

        // Begin person1 block
        person1.setAcquaintances(new Person("Badger", 14L), new Relationship(
                "Fixer", false));
        person1.setAcquaintances(new Person("Saffron", 15L), new Relationship(
                "Married", true));
        person1.setAcquaintances(new Person("Adelei Niska", 16L),
                new Relationship("Enemy", true));
        // End person1 block

        // Begin person2 block
        person2.setAcquaintances(new Person("Wash", 17L), new Relationship(
                "Married", true));
        person2.setAcquaintances(new Person("Badger", 14L), new Relationship(
                "Fixer", false));
        person2.setAcquaintances(new Person("Monty", 18L), new Relationship(
                "Friend", true));
        // End person2 block

        // Begin person3 block
        person3.setAcquaintances(new Person("Lawrence Dobson", 19L),
                new Relationship("Enemy", false));
        person3.setAcquaintances(new Person("Adelei Niska", 16L),
                new Relationship("Enemy", false));
        person3.setAcquaintances(new Person("Jubal Early", 20L),
                new Relationship("Enemy", false));
        // End person3 block

        // Begin person4 block
        person4.setAcquaintances(new Person("Atherton Wing", 21L),
                new Relationship("Client", false));
        person4.setAcquaintances(new Person("Nandi", 22L), new Relationship(
                "Friend", true));
        person4.setAcquaintances(new Person("Fess Higgins", 23L),
                new Relationship("Client", false));
        // End person4 block

        // Begin person5 block
        person5.setAcquaintances(new Person("Simon Tam", 24L),
                new Relationship("Lover", true));
        person5.setAcquaintances(new Person("Bester", 25L), new Relationship(
                "Ex lover", true));
        person5.setAcquaintances(new Person("Tracy Smith", 26L),
                new Relationship("Fling", true));
        // End person5 block

        // Begin person6 block
        person6.setAcquaintances(new Person("Simon Tam", 24L),
                new Relationship("Brother", false));
        person6.setAcquaintances(new Person("Dr. Matthias", 27L),
                new Relationship("Doctor", false));
        person6.setAcquaintances(new Person("The Blue Gloves", 28L),
                new Relationship("Former Employer", false));
        // End person6 block

        // Begin person7 block
        person7.setAcquaintances(new Person("Vera", 29L), new Relationship(
                "Favorite gun ever", false));
        person7.setAcquaintances(new Person("Magistrate Higgins", 30L),
                new Relationship("Enemy", true));
        person7.setAcquaintances(new Person("Lawrence Dobson", 19L),
                new Relationship("Enemy", true));
        // End person7 block

        System.out.println(person1);
        System.out.println("********************");
        System.out.println(person2);
        System.out.println("********************");
        System.out.println(person3);
        System.out.println("********************");
        System.out.println(person4);
        System.out.println("********************");
        System.out.println(person5);
        System.out.println("********************");
        System.out.println(person6);
        System.out.println("********************");
        System.out.println(person7);
        System.out.println("********************");
        // System.out.println();

        // Fills created Groups
        ((Group) group1).addMember(person3);
        ((Group) group1).addMember(person6);
        ((Group) group2).addMember(person1);
        ((Group) group2).addMember(person2);
        ((Group) group2).addMember(person3);
        ((Group) group2).addMember(person5);

        // Fills created Networks

        ((Network) network1).addMember(person4);
        ((Network) network2).addMember(person1);
        ((Network) network2).addMember(person2);
        ((Network) network2).addMember(person3);
        ((Network) network2).addMember(person4);
        ((Network) network2).addMember(person5);
        ((Network) network2).addMember(person6);
        ((Network) network2).addMember(person7);

        // Fills created Bands with fans and members

        // Adds band1 members
        ((Band) band1).addMember(person1);
        ((Band) band1).addMember(person2);
        // Adds band1 fans
        ((Band) band1).addFans(person5);
        ((Band) band1).addFans(person6);
        ((Band) band1).addFans(person7);

        // Adds band2 members
        ((Band) band2).addMember(person3);
        // Adds band2 fans
        ((Band) band2).addFans(person4);
        ((Band) band2).addFans(person7);

    }
}
