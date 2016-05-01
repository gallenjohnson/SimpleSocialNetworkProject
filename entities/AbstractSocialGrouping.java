package cs1711.yourface.entities;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: G. Allen Johnson
 * Project J
 * Class: CS 17.11 - D. Pearson
 * Version: 1.2
 */

public abstract class AbstractSocialGrouping extends AbstractSocialEntity {

    Set<Person> members;

    protected AbstractSocialGrouping() {

    }

    protected AbstractSocialGrouping(Set<Person> members) {
        members = new HashSet<Person>();
        this.members = members;

    }

    public Set<Person> getMembers() {
        return members;
    }

    public void addMember(Person member) {

        members.add(member);

    }

    public void removeMember(Person member) {

    }
}
