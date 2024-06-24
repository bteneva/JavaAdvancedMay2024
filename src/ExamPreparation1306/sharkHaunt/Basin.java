package ExamPreparation1306.sharkHaunt;

import java.util.*;

public class Basin {
    private String name;
    private int capacity;
    private List<Shark> sharks;

    // Constructors
    public Basin(String name, int capacity, List<Shark> sharks) {
        this.name = name;
        this.capacity = capacity;
        this.sharks = new ArrayList<>(sharks);
    }

    public Basin(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.sharks = new ArrayList<>();
    }

    // Getters and Setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setSharks(List<Shark> sharks) {
        this.sharks = new ArrayList<>(sharks);
    }

    public List<Shark> getSharks() {
        return this.sharks;
    }

    // Methods
    public void addShark(Shark shark) {
        if (this.sharks.size() < capacity) {
            this.sharks.add(shark);
        } else {
            System.out.println("This basin is at full capacity!");
        }
    }

    public boolean removeShark(String kind) {
        return sharks.removeIf(shark -> shark.getKind().equals(kind));
    }

    public Shark getLargestShark() {
        return Collections.max(this.sharks, (s1, s2) -> Integer.compare(s1.getLength(), s2.getLength()));
    }

    public int getAverageLength() {
        return (int)this.sharks.stream().mapToInt(Shark::getLength).average().orElse(0);
    }

    public Shark getShark(String kind) {
        for (Shark shark : this.sharks) {
            if (shark.getKind().equals(kind)) {
                return shark;
            }
        }
        return null;
    }

    public int getCount() {
        return this.sharks.size();
    }

    public String report() {
        StringBuilder report = new StringBuilder();
        report.append(String.format("Sharks in %s:%n", this.name));
        for (Shark shark : this.sharks) {
            report.append(shark.toString()).append(System.lineSeparator());
        }
        return report.toString().trim();
    }
}
