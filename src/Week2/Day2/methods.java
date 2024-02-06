package Week2.Day2;

public class methods {
    public static void main(String[] args) {

//        for (String arg:args) {
//            System.out.println(arg);
//        }


//        System.out.println(1);
//        System.out.println(2);
//        greet();
//        System.out.println(3);
//        System.out.println(4);

     int Nic =   average(4, 6, false);
     int doubleOfNic = Nic *2;
        System.out.println("Hello");
        System.out.println(Nic);
        System.out.println(doubleOfNic);

        int Ved = average(4, 2, true);
        int tripleOfVed = Ved * 3;
        System.out.println(Ved);
        System.out.println(tripleOfVed);


    }

    static  void greet(){
        System.out.println(5);
        System.out.println("Hello World");
        System.out.println(6);
    }


    public static int average(int a, int b, boolean shouldAverage){
        if(shouldAverage == false){
            return -1;
        }
        int avg = (a+b)/2;
        System.out.println("returning the avg");
        return avg;
    }

    static int minimum(int a, int b){

//        if(a<b) return a;
//        return b;

        return a<b ? a:b;
    }





}
