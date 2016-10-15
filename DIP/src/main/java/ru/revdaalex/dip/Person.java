package ru.revdaalex.dip;

/**
 * Class Person.
 * Created by revdaalex on 14.10.2016.
 */
public class Person {
    /**
     * Variable name.
     */

    private String name;
    /**
     * Variable age.
     */
    private int age;
    /**
     *
     */

    private int id;

    /**
     * Getter.
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter.
     * @param name set name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter.
     * @return age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter.
     * @param age set age.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Getter.
     * @return id.
     */
    public int getId() {
        return id;
    }

    /**
     * Setter.
     * @param id set id.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Main constructor.
     * @param name name.
     * @param age age.
     * @param id id.
     */
    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
}
