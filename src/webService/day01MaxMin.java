package webService;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class day01MaxMin {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Double> numList = new ArrayList<Double>();
    public static void getNumberList(){
        System.out.println("Please enter numbers,0 to finish :  ");

        while (true) {
            double number = input.nextDouble();
            if (number==0) {
                break;
            }
            numList.add(number);
        }
        for (double nl : numList) {
            System.out.printf( "%.2f;\n",  +nl );
        }
     double sum = 0.00;
        for(int i=0; i<numList.size();i++){
            sum = sum + numList.get(i);
        }
        System.out.printf("%.2f\n", sum);

        double average = sum/ numList.size();

        System.out.printf("%.2f\n", average);

        double max = Collections.max(numList);
        System.out.printf("%.2f\n", max);
        double min = Collections.min(numList);
        System.out.printf("%.2f\n", min);

    }


    public static void main(String[] args) {
        day01MaxMin.getNumberList();
    }
}
