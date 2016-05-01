package cs1711.yourface.entities;

/**
 * Author: G. Allen Johnson
 * Project J
 * Class: CS 17.11 - D. Pearson
 * Version: 1.2
 */

public abstract class AbstractSocialEntity implements SocialEntity {
    String name;
    long id;

    protected AbstractSocialEntity() {

    }

    protected AbstractSocialEntity(String name, Long id) {
        this.name = name;
        this.id = id;

    }

    @Override
    public String getName() {

        return name;
    }

    @Override
    public long getId() {

        return id;
    }

    @Override
    public abstract String toString();
}
