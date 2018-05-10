package devpeople;

import devcat.Cat;

public class People {
    private int age;
    private String name;
    private String lastName;
    private Cat peopleCat;

    @Override
    public String toString() {
        return "People [Name: "+name+", LastName: "+lastName+", Age: "+age+", Cat: "+peopleCat+"]";
    }

    public People(int age, String name, String lastName, Cat peopleCat) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.peopleCat = peopleCat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Cat getPeopleCat() {
        return peopleCat;
    }

    public void setPeopleCat(Cat peopleCat) {
        this.peopleCat = peopleCat;
    }


}
