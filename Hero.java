import java.util.Collections;
import java.util.Comparator;

public class Hero implements Comparable<Hero> {

    // Sort heroes by Name
        @Override
        public int compareTo(Hero h1, Hero h2) {
            return h1.getName().compareTo(h2.getName());

        //The above Comparator can also be written using lambda expression like so =>
        heroNameComparator = (h1, h2) -> h1.getName().compareTo(h2.getName());

        //Which can be shortened even further using Java 8 Comparator default method
        //heroNameComparator = Comparator.comparing(Employee::getName)

    };
    public int compareTo(Employee anotherEmployee) {
        if(this.getId() < anotherEmployee.getId()) {
            return -1;
        } else if (this.getId() > anotherEmployee.getId()) {
            return 1;
        } else {
            return 0;
        }
    }



    // attributs
    private String name;
    private int age;

    // constructeurs
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // accesseurs (getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // mutateurs (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}