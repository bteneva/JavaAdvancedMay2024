package Classes.Exercises.ComparePerson;

import org.jetbrains.annotations.NotNull;

public class Person implements Comparable<Person>{
    @Override
    public int compareTo(Person otherPerson) {
        //1. сравнение по име
        int nameCmparingResult = this.name.compareTo(otherPerson.name);
        //2. сравнение по години
        int ageComparingResult = this.age.compareTo(otherPerson.age);
        //3. сравнение по град
        int townComparingResult = this.town.compareTo(otherPerson.town);

        if(nameCmparingResult !=0){
            return nameCmparingResult;
        }else if(ageComparingResult !=0){
            return ageComparingResult;
        }else if(townComparingResult !=0){
            return townComparingResult;
        }

        return 0;
    }

    private String name;
    private String town;
    private Integer age;

    public Person(String name, String town, Integer age) {
        this.name = name;
        this.town = town;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
