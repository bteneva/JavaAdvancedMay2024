package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomList <T extends Comparable> {
    private List<T> elements;

    public CustomList(){
        this.elements = new ArrayList<>();
    }
    public void add(T element){
        this.elements.add(element);
    }

    public T remove (int index){
        return  this.elements.remove(index);
    }

    public boolean contains(T element){
        return this.contains(element);
    }
    public void swap(int index1, int index2){
        Collections.swap(elements, index1, index2);
    }
    public int countGreaterValue(T elementToCompare){
        int count = 0;

        for (T value : this.elements) {
            if (value.compareTo(elementToCompare) > 0){
                count++;
            }
        }
        return count;
    }
    public T getMax(){
        return (T) Collections.max(this.elements);
    }

    public T getMin(){
        return (T) Collections.min(this.elements);
    }
    public void sort(){
        Collections.sort(this.elements); //сортира в нарастващ ред
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (T element : elements) {
            sb.append(element.toString()).append(System.lineSeparator());

        }
        return sb.toString().trim();
    }

}
