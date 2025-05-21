package com.pluralsight;

import java.util.*; //

public class Main { // this is a main class where everthing run
   public static void main(String[] args) {
      List<Person> myFamily = new ArrayList<>(); // it will make a list to hold people
     //each line creates a new person and adds them to the family list
      myFamily.add(new Person("Dana", "Wyatt", 63)); //
      myFamily.add(new Person("Zachary", "Westly", 31));
      myFamily.add(new Person("Elisha", "Aslan", 14));
      myFamily.add(new Person("Ian", "Auston", 16));
      myFamily.add(new Person("Zephaniah", "Hughes", 9));
      myFamily.add(new Person("Ezra", "Aiden", 17));
      myFamily.add(new Person("Zachary", "Westly", 31)); // duplicate for test
      myFamily.add(new Person("Zachary", "Westly", 25)); // different age

      // Before sorting // print a message so we know what's about to happen.
      System.out.println("Before sorting:");
      for (Person p : myFamily) {//For each person in the list, print them out."
         System.out.println(p);
      }

      // Sort the list using Collections.sort()
      Collections.sort(myFamily);

      // After sorting
      System.out.println("\nAfter sorting:"); //After sorting, it prints out the list again
      //After sorting:
      //
      // sorted by last name → first name → age
      for (Person p : myFamily) {
         System.out.println(p);
      }
   }
}
