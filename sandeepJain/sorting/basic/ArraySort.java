import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySort {
    public static void main(String[] args) {
        List ss = new ArrayList<Student>();
        ss.add(new Student("ritik", 4));
        ss.add(new Student("Ashwin", 32));
        ss.add(new Student("soumya", 1));
        ss.add(new Student("kesab", 14));
        ss.add(new Student("smrat", 3));

        Collections.sort(ss);

        for(var obj : ss) {
            System.out.println(obj);
        }
    }
}

class Student implements java.lang.Comparable{
    String name;
    int roll;
    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", roll=" + roll + "]";
    }
    @Override
    public int compareTo(Object o) {
        // throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
        Student ss = (Student)o;
        if(this.roll > ss.roll) {
            return 1;
        } else {
            return -1;
        }
    }

    
    
}