package Generics;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box <T extends Comparable<T>> {
    private List<T> values;

    public Box(){
        this.values = new ArrayList<>();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (T value : values) {
            String formattedValue = String.format("%s: %s", value.getClass().getName(), value);
            sb.append(formattedValue).append(System.lineSeparator());
        }
        return sb.toString();
    }
    public void add(T value){
        values.add(value);
    }

    public void swap(int index1, int index2){
        //Collections.swap(this.values, index1, index2);
        T firstValue = values.get(index1);
        T secondValue = values.get(index2);
        this.values.set(index2,firstValue);
        this.values.set(index1, secondValue);
    }
    public int countGreaterValue(T valueToCompare){
        int count = 0;

        for (T value : this.values) {
            if (value.compareTo(valueToCompare) > 0){
                count++;
            }
        }
        return count;
    }


}
