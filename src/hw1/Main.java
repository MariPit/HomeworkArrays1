package hw1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        int secondNumber = numbers[1];
        numbers[2] = 3;
        int third = 2;
        System.out.print(numbers[0] + ", ");
        System.out.print(secondNumber + ", ");
        System.out.print(numbers[third] + ", ");
        System.out.print(numbers[5] + " ");
        System.out.println();
        for (int n=numbers.length-1; n>=0; n--){
            System.out.print(numbers[n]);
            if (n!=0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]%2!=0){
                numbers[i]+=1;
            }
        }
        System.out.print(Arrays.toString(numbers));

        System.out.println();
        float [] weights = {1.57f, 7.654f, 9.986f};
        System.out.println(weights[0]+", "+weights[1]+", "+weights[2]);
        for (float f= weights.length-1; f>=0; f--){
            System.out.print(weights[(int) f]);
            if (f!=0){
                System.out.print(", ");
            }
        }

        System.out.println();
        int [] year = {1989, 2003, 2009, 2034};
        for (int i=0; i< year.length; i++) {
            if (i != 3)
                System.out.print(year[i] + ", ");
            else
                System.out.print(year[i]);
        }
        System.out.println();
        for (int i= year.length-1; i>=0; i--){
            System.out.print(year[i]);
            if (i!=0){
                System.out.print(", ");
            }
        }
    }
}