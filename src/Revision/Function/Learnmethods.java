package Revision.Function;

public class Learnmethods {

    public static void main(String[] args) {

        int numbers[] ={12, 13, 14, 15,22, 16, 17, 18, 19, 20, 2};


        // for second max
        int first_max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;


        for(int number: numbers){
            if(number>first_max){
                second_max = first_max;
                first_max = number;
            }
            else if(number>second_max && number!=first_max){
                second_max = number;
            }
        }

        System.out.println(second_max);


        // for second min
        int first_min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        for(int number: numbers){
            if(number < first_min){
                second_min = first_min;
                first_min = number;
            } else if (number<second_min &&  number!=first_min){
                second_min = number;
            }
        }

        System.out.println(second_min);





    }
}
