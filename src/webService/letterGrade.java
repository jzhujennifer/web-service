package webService;

import java.util.ArrayList;
import java.util.Scanner;

    public class letterGrade {
        static Scanner input = new Scanner(System.in);
        static ArrayList<String> gradesText = new ArrayList<String>();
        static ArrayList<Double> gradesNum = new ArrayList<Double>();

        public static void gradeArray() {

            System.out.println("Please enter letter grades,empty line to finish :  ");
            String line;
            while (true) {
                line = input.nextLine();
                if (line.isEmpty()) {
                    break;
                }
                gradesText.add(line);
            }
            for (String gt : gradesText) {
                System.out.println("Grade was:" + gt);

            }

        }
    }
