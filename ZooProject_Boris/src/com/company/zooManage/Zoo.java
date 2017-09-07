package com.company.zooManage;

import com.company.animal.Animal;

/**
 * Created by borka on 9/2/2017.
 */
public class Zoo {

    //Cage[] cage = new Cage[3];



    public Zoo() {
                Animal[] airCage;
                Animal[] groundCage;
                Animal[] waterCage;
            }



        public void addAnimalToZoo(Animal animal)
        {
                     switch (animal.getPlace())
                            {
                                case "ground" :
                                    addAnimalToCage(animal, Cage.groundCage);
                                    break;
                                case "water":
                                    addAnimalToCage(animal, Cage.waterCage);
                                    break;
                                case "air":
                                    addAnimalToCage(animal, Cage.airCage);
                                    break;
                            }
                        }

                    public void addAnimalToCage(Animal animal, Animal[] cage) {
                        for (int i = 0; i < cage.length; i++) {
                            if (cage[i] == null) {
                                cage[i] = animal;
                                return;
                            }
                        }
                    }
                    public static void printCage(Animal[] cage) {


                        //       int busyCages = 0;
//       for (Animal curr: cage
//            ) {
//           if (curr != null) {
//               System.out.println(curr);
//               busyCages++;
//           }
//       }
                        System.out.println(cage[0].getPlace().toString() + " animal:");
                        for (int i = 0; i < cage.length; i++) {

                            if (cage[i] != null) {
                                System.out.println(cage[i].getName() + " - lives in #" + (i + 1) + " "+ (cage[i].getPlace().toString() + " cage"));
                                //  busyCages++;
                            }

                            //   System.out.println(cage[0].getPlace().toString() +" cage live "+ busyCages + " animal" );

                        }
                        System.out.println("-----------------");
                    }

                }