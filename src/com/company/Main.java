package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Pet> pets = new ArrayList();
    public static void main(String[] args) {

        /*
        Pet myPet = new Pet("nemo", 5, "man", "fish", 0);
        myPet.walk();
        Pet myNextPet = new Pet("stepan", 18, "male", "monkey", 3);
        myNextPet.walk();
        Pet foo = new Pet("Petr", 14, "male", "dog", 4);
        foo.walk();
        ArrayList<String> names = new ArrayList<>();
        names.add("Petr");
        names.add("Jan");
        names.add("Stepan");
        names.add("Arnost");
        names.add("Adam");
        names.add("Tomas");
        names.add("Simon");
        names.add("Ondrej");
        names.add("Miky");
        names.add("Daniel");
        names.add("Eva");
        names.add("Marka");
        names.add("Tyna");
        names.add("Marek");
        names.add("Anicka");
        names.add("Tobias");
        names.add("Michal");
        names.add("Marie");
        names.add("Filip");
        AtomicInteger numberOfAs = new AtomicInteger();

        names.forEach((name) -> {
            if (name.contains("a")){
                numberOfAs.getAndIncrement();
            }
                }
        );

        System.out.println(numberOfAs);
                */

        run();
    }
        private static void run(){
            System.out.println("spousti se program ");

            menu();
        }

        private static void menu(){
            System.out.println("zadejte 1 pro pridani zviratka");
            System.out.println("zadejte 2 pro odebrani zviratka");
            System.out.println("zadejte 3 pro vypis");
            System.out.println("zadejte 4 pro konec");
            System.out.println("zadejte cislo");
            String action = sc.nextLine();
            int num = Integer.parseInt(action);
            switch (num){
                case 1 -> addPet();
                case 2 -> removePet();
                case 3 -> printAllPets();
                case 4 -> System.exit(1);
                default -> menu();
            }
        }
     private static void addPet(){
         System.out.println("akce addpet");
         System.out.println("zadejte jmeno");
         String name = sc.nextLine();
         System.out.println("zadejte vek");
         int age = Integer.parseInt(sc.nextLine());
         System.out.println("zadejte gender");
         String gender = sc.nextLine();
         System.out.println("zadejte druh");
         String type = sc.nextLine();
         System.out.println("zadejte pocet nohou ");
         int numberOfLegs = Integer.parseInt(sc.nextLine());
         pets.add(new Pet(name, age, gender, type, numberOfLegs));
         System.out.println("Action: addpet");
         menu();
     }
     private static void removePet(){
         System.out.println("action: removePet");
         System.out.println("jake jmeno zvirete chcet odebrat?");
         String name = sc.nextLine();
         pets.removeIf(pet -> pet.getName().equals(name));
         menu();
     }
     private static void printAllPets(){
         System.out.println("action: printAllPets");
         System.out.println(pets);
         menu();
     }


}
