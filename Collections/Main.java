package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        /* Map */

        Map<String, Integer> people = new HashMap<>();
        people.put(
        "Thomas kutty", 25);
        people.put("Alan", 22);
        people.put("Akila", 22);
        people.put("Dona", 22);
        people.put("chandni", 22);
        

        // System.out.println(people);
        System.out.println(people.get("Dona"));
        System.out.println(people.size());
        System.out.println(people.keySet());
        System.out.println(people.values());
        for(String name: people.keySet()){
            System.out.println(name+" : "+people.get(name));
        }


        /* Set */

        // Set<Integer> set = new HashSet<>();
        // Set<Integer> set = new TreeSet<>();
        // set.add(10);
        // set.add(1);
        // set.add(34);
        // set.add(3);

        // Iterator<Integer> ite = set.iterator();
        // while(ite.hasNext()){
        //     System.out.println(ite.next());
        // }


        /* List */

        // List<Integer> list = new ArrayList<>();
        // list.add(0, 5);
        // list.add(34);
        // list.add(2);
    
        // // System.out.println(list);
        // for(int i: list){
        //     System.out.println(i);
        // }


        

        
        

    }
    
}
