/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.*;

public class Library {
    public static void main(String[] args) {
    }

    public static int[] roll(int num) {
        int[] dices= new int[num];
        Random rand = new Random();
        for (int i =0  ; i <dices.length; i++) {
            dices[i] =rand.nextInt(6) +1;

        }

        return dices;
    }
    public  static <t>  boolean containsDuplicates(t[] arr){
    //https://stackoverflow.com/questions/27568248/how-to-write-a-method-that-accepts-an-array-of-type-x-and-another-variable-with

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i].equals(  arr[j])){
                    return true;}
            }
        }
                return false;
    }
    public static double  calculatingAverages(int[] arr) {
        int collective=0;
        for (int i = 0; i < arr.length; i++) {
            collective+=arr[i];
//            System.out.println(collective);
        }
        return collective/ arr.length;
    }
    public  static int[] theLowestAverageArr(int[][] arr){
        double[] averageArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            averageArr[i]=calculatingAverages(arr[i]);

        }
        System.out.println(averageArr);
        return arr[smallestValueIndex(averageArr)];
    }
    public  static int smallestValueIndex(double[] arr){
        int i;
        double min=arr[0];
        int minIndex=0;
        for ( i=1 ; i < arr.length; i++) {
            if(min>arr[i]){
                min=arr[i];
                minIndex=i;
            }
        }
        return minIndex;

    }

    public static void analyzeData(int[][] arr) {
        Set<Integer> data = new HashSet<>();
        for (int[] e : arr) {
            for (int l : e) {
                data.add(l);
            }
        }
        int max = Collections.max(data);
        int min = Collections.min(data);
        System.out.println("High: " + max);
        System.out.println("Low: " + min);
        for (int i = min; i < max; i++) {
            if(!data.contains(i))
            System.out.println("Never saw temperature: " + i);
        }
    }



    public static void tally(ArrayList<String> list) {
        HashMap<String, Integer> votes = new HashMap<>();
        for (String e : list) {
            votes.put(e, votes.getOrDefault(e, 0) + 1);
        }
        System.out.println( maxValue(votes)+" received the most votes!");
    }

    public static String maxValue(HashMap<String, Integer> map) {
        String maxKey = "";
        int maxValue = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }




}
