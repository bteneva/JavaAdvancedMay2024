package ClassesExams.SoftUniKindergarten;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Kindergarten {

    private String name;
    private int capacity;
    private List<Child> registry;

    public Kindergarten(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.registry = new ArrayList<>();
    }

    public boolean addChild(Child child) {
        boolean hasRoom = this.capacity > this.registry.size();
        if (hasRoom) {
            this.registry.add(child);
            return true;
        } else return false;
    }

    public boolean removeChild(String firstName) {
        for (Child child : this.registry) {
            if (child.getFirstName().equals(firstName)) {
                this.registry.remove(child);
                return true;
            }
        }
        return false;
    }

    public int getChildrenCount() {
        return this.registry.size();
    }

    public Child getChild(String childName) {
        for (Child child : registry) {
            if (child.getFirstName().equals(childName)) {
                return child;
            }
        }
        return null;
    }

    public String registryReport() {
        StringBuilder report = new StringBuilder();
        report.append("Registered children in ").append(this.name).append(":").append(System.lineSeparator());

        this.registry.sort(Comparator
                .comparing(Child::getAge)
                .thenComparing(Child::getFirstName)
                .thenComparing(Child::getLastName));

        for (Child child : registry) {
            report.append("-- ").append(child).append(System.lineSeparator());
        }

        return report.toString();
    }
}





