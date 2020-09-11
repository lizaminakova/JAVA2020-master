package ru.lizaminakova.JAVA1.pr1.Ex1;

public class Main {

    public static void main(String[] args) {
        int array []={1, 2, 3, 4, 5};
        int k=0;
        for (int i=0; i<array.length; i++ ) {
          k=k+array[i];
        }
	System.out.println(k);
        int l=0;
        int j=0;
        while (j<array.length) {
            l=l+array[j];
            j++;
        }
        System.out.println(l);
        int m=0;
        int b=0;
        do {
            m=m+array[b];
           b++;
        } while (b<array.length);
        System.out.println(m);

	//int[] array =  new int [3];
	//array[0]=1;
	//array[1]=5;
	//array[2]=-90;
	//int[]array2 = {1, 5, -90};
	//for (int i=0; i<array.length; i++) {
	   // System.out.println(array[i]);
    //}
       //double var = 1.0/3;
      // String message = String.format("my num is: %.2f", var);
       //System.out.println(message);
//        System.out.println(Math.random()*100);
//        Random rand=new Random(123);
//        System.out.println(rand.nextInt(100));
//        System.out.println(rand.nextInt(100));
//        System.out.println(rand.nextInt(100));
        //System.out.println(myMethod(3, 7));
    }
//    public static int myMethod (int a, int b) {
//        return a + b;
//    }
}
