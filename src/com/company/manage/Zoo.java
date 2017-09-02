package com.company.manage;

import com.company.animal.Animal;

/**
 * Created by borka on 9/2/2017.
 */
public class Zoo {

    Cage [] cage = new Cage [3];

//    Animal [] wildCage;
//    Animal [] waterCage;
//    Animal [] airCage;


    public void addAnimalToCage (Animal animal){

        if(animal.getPlace().equals("ground")) {
//           for (int i=0; i< wildCage.length-1;i++)
//           {
//
//           }
            int i = 0;
            while ( wildCage[i] != null && i <= wildCage.length){
                i++;
            }
            if (i> wildC )
            {
                wildCage [i] = animal;
            }
        }
        }

}
