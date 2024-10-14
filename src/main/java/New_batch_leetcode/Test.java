package New_batch_leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import static java.lang.CharSequence.compare;

class Person implements Comparable<Person> {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

//    @Override
//    public int compareTo(Person o) {
//        return CharSequence.compare(this.name,o.name);
//    }
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age); // Compare by age
    }
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Test {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.add(new Person("Bharlie", 5));
        Collections.sort(people); // Sorts based on compareTo
// Collections.sort() uses compareTo to sort the list of people by age.
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
