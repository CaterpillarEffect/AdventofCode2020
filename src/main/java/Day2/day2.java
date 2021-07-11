package Day2;

import Utils.ReUtils1;

import java.io.IOException;
import java.util.Arrays;

public class day2 {

    public static void main(String[] args) throws IOException {

        ReUtils1 utils = new ReUtils1();
        split(utils.readFile("2") );
        onlyone(utils.readFile("2"));
    }


    public static int split(String[] input) {
        int count=0;
        for (String b : input) {
            String[] answer = b.split(",");
            for (String s : answer) {
                String[] pass = s.split(":|-|\\s");
                int number = pass[4].length() -pass[4].replaceAll(pass[2],"").length();
                if(number >= Integer.valueOf(pass[0]) && number <= Integer.valueOf(pass[1])){
                    count++;
                }


            }


        }
        System.out.println(count +" count");
        return count;

    }

    public static int onlyone(String[] input) {
        int count=0;
        for (String b : input) {
            String[] answer = b.split(",");
            for (String s : answer) {
                String[] pass = s.split(":|-|\\s");
                int min = Integer.valueOf(pass[0]), max = Integer.valueOf(pass[1]);
                int number = pass[4].length() -pass[4].replaceAll(pass[2],"").length();
                if((pass[4].charAt(min-1)== pass[2].charAt(0)&pass[4].charAt(max-1)!= pass[2].charAt(0))||(pass[4].charAt(min-1)!= pass[2].charAt(0)&pass[4].charAt(max-1)== pass[2].charAt(0))){

                    count++;
                }
            }



        }
        System.out.println(count +" count");
        return count;

    }
}

