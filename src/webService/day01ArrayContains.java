package webService;

import java.util.Arrays;

public class day01ArrayContains {
    public static int[] concatenate(int[]a1, int[]a2){
        int[]numArray = new int[a1.length + a2.length];
        for( int i=0; i < a1.length; i++){
            numArray[i] = a1[i];
            }
        for(int j=a1.length; j<numArray.length; j++){
            numArray[j]= a2[j-a1.length];
        }

        return numArray;
}

    public static void printDups(int[] a1, int[] a2) {
        int arrSize = 0;
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a2.length;j++){
                if(a1[i]==a2[j]){
                    arrSize++;
                    break;
                }
            }
        }
        int[] dupArr = new int[arrSize];
        int count = 0;
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a2.length;j++){
                if(a1[i]==a2[j]){
                    dupArr[count]=a1[i];
                    count++;
                    break;
                }
            }
        }
        System.out.println(arrSize);
        System.out.println(Arrays.toString(dupArr));
        }
    public static void removeDups(int[] a1, int[] a2) {
        int arrSize = a1.length;
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a2.length;j++){
                if(a1[i]==a2[j]){
                    arrSize--;
                    break;
                }
            }
        }
        int[] removeDupArr = new int[arrSize];
        int count = 0;
        boolean isDup = false;
        for(int i=0;i<a1.length;i++){
            isDup = false;
            for(int j=0;j<a2.length;j++){
                if(a1[i]==a2[j]){
                    isDup = true;
                    break;
                }
            }
            if(!isDup){
                removeDupArr[count]=a1[i];
                count++;
            }
        }
        System.out.println(arrSize);
        System.out.println(Arrays.toString(removeDupArr));
    }
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(concatenate(new int[]{2,7,8},new int[]{-1,9})));
        //printDups(new int[]{1, 3, 7, 8, 2, 7, 9, 11},new int[]{3, 8, 7, 5, 13, 5, 12});
        removeDups(new int[]{2, 3, 7, 9, 3 },new int[]{3, 7});
    }


}





