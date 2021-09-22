package webService;

import java.util.ArrayList;
import java.util.Scanner;

public class day01TreeLoops {
    static Scanner input = new Scanner(System.in);

    public static void getTree(){
        System.out.println("How big does your tree needs to be?");
        int size = input.nextInt();
        char starSign = '*';
        String[] treeM= new String[size];
        String[] treeL= new String[size];
        String[] treeR= new String[size];
       for(int i=0; i<size;i++ ){
           treeM[i] = "*";
           treeL[i] = "";
           treeR[i] = "";
           for(int j=0;j<size-1;j++){
                if(j<i){
                    treeR[i] +="*";
                }
                else {
                    treeR[i] +=" ";
                }
           }
           for(int k=size-2;k>=0;k--){
               if(k<i){
                   treeL[i] +="*";
               }
               else {
                   treeL[i] +=" ";
               }
           }
       }

        for(int z=0;z<size;z++){
            System.out.println(treeL[z]+treeM[z]+treeR[z]);
        }

    }

    public static void main(String[] args) {
        day01TreeLoops.getTree();
    }
}
