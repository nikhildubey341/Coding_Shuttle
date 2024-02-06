package Week2.Day1;

import java.sql.SQLOutput;

public class array {
    public static void main(String[] args) {

//        int age[];  //declaration
//        age = new int[5];  //allocation

//        int age[] = new int[5];
//
//        age[0]=5;
//        age[1]=2;
//
//        System.out.println(age[0]);
//        System.out.println(age[1]);
//        System.out.println(age[2]);
//
//        System.out.println(age.length);

//
//        int marks[] = {12, 34, 45, 67, 89};
//
//        System.out.println(marks[4]);


        String names[] ={"Nikhil", "Ram", "Shyam", "Mahesh", "Ramesh"};


        // for-loop -
//        for(int i=0; i< names.length; i++){
//            System.out.println("Name is "+names[i]);
//        }

        // for-each :-
        for(String name: names){
            System.out.println("Hii I am "+name);
        }
    }
}
