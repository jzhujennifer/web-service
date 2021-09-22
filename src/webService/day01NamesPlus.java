package webService;

import java.util.ArrayList;
import java.util.Scanner;

public class day01NamesPlus {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> nameList = new ArrayList<String>();
    public static void getNameList(){
        System.out.println("Please enter name,empty line to finish :  ");

        while (true) {
            String name = input.nextLine();
            if (name.isEmpty()) {
                break;
            }
            nameList.add(name);
        }
        for (String nl : nameList) {
            System.out.print( nl+";" );
        }

    }
    public static void main(String[] args) {
        day01NamesPlus.getNameList();
    }
}


