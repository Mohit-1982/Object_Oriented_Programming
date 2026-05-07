package OOPS.Day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Iterable {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Collection<Integer> c = new ArrayList<>();//we can do this as well because collection is parent class of
        //these interfaces
    }
}


package OOPS.Day13;

import java.lang.Iterable;
import java.util.Iterator;

class NameContainer implements Iterable<String>{
    private String[] arr;
    private int size;

    NameContainer(String[] arr) {
        this.arr = arr;
        this.size = this.arr.length;
    }

    @Override
    public Iterator<String> iterator() {
        //Anonymous class
        return new Iterator<String>() {
            private int pos = 0;

            @Override
            public boolean hasNext() {
                return pos < size;
            }

            @Override
            public String next() {
                return arr[pos++];
            }
        };
    }
}

public class OwnIterator {
    public static void main(String[] args) {
        String[] arr = {"Mohit", "Rohit", "Aditya"};

        NameContainer n1 = new NameContainer(arr);

        Iterator<String> it = n1.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Enhanced for loop
        //it is same as the code we have written above

        for (String s : arr) {
            System.out.println(s);
        }
    }
}


package OOPS.Day13;

import java.util.*;

public class ConcurrentModificationException {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        for (int ele : list) {
            list.remove(ele);//it will throw ConcurrentModificationException
        }
    }
}
