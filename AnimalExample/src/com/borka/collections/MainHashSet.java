package com.borka.collections;

import java.util.*;

/**
 * Created by Comp14 on 07/09/2017.
 */
public class MainHashSet {
    public static void main(String[] args) {
        //TODO: hashSet example
        Set<String> students = new HashSet<>();
        students.add("yossi");
        students.add("yossi2");
        students.add("daniel");
        students.add("daniel3");

        Iterator<String> it = students.iterator();

        while (it.hasNext()) {
            System.out.println(it.next().hashCode());
        }


        String[] studentsGroup = {"fzur", "dil", "efra", "coris", "aniel"};
        ArrayList<String> students1 = new ArrayList<>();
        for (String s : studentsGroup) {
            students1.add(s);
        }

        ///// Sort Examples /////////////
        Collections.sort(students1);
        System.out.println(students1);
        Collections.reverse(students1);
        System.out.println(students1);
        Collections.shuffle(students1);
        System.out.println(students1);

    }
}
