import java.util.Scanner; 
import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class main {
    public static void main(String[] args) {
int dogCount = 1;
System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

int catCount = 2;
System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

int turtleCount = 0;
System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
flipNHeads(1);
clock();


    }
    static String pluralize(String name , int num){
        if(num==1){
            return name;
        }
        else if(num<0){
            return "Kindly enter a valid number";
        }
        else{
            return name+"s";
        }
    

    }
    static void flipNHeads(int num){
       Random rand = new Random(); 
        float flip;
        int count = 0;
        int i =0;
        if (num>1){
            System.out.println( "Kindly enter a valid number");
        }
        while (count<num){
            i++;
            flip=rand.nextFloat();
            if(flip<.5f){
                System.out.println("tails");
            }
            else{
                System.out.println("heads");
                count++;
            }
        }
        System.out.println("It took "+i+" flips to flip "+num+" head in a row.");
    }
    static void clock(){

        // String timestring =String.format("%02d:%02d:%02d", hour, minute, second);
        while(true){
            try{
                    LocalDateTime now = LocalDateTime.now();
                    int hour = now.getHour();
                    int minute = now.getMinute();
                    int second = now.getSecond();
                    String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                    System.out.println(time);
                    Thread.sleep(1000);
                    }
                    catch(InterruptedException e){
                        System.out.println("an error occurred");
                    }

        }
    }    
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    