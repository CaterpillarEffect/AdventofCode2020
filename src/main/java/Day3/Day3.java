package Day3;

import Utils.ReUtils1;

import java.io.IOException;
import java.util.ArrayList;

public class Day3 {

    public static void main(String[] args) throws IOException {
        ReUtils1 utils = new ReUtils1();
        utils.readFile("3");
       System.out.println( findTree(utils.readFile("3")));
  //System.out.println(checkTree(utils.readFile("test")) );
        checkTree(utils.readFile("3"));

    }
    /*
    In the above example, these slopes would find 2, 7, 3, 4, and 2 tree(s) respectively;
     multiplied together, these produce the answer 336.
     */
    public static int findTree(String[] input){
        int position =0;
        int count =0;
        int linenumber= 1;
        for (String line : input) {
            System.out.println("£line numer"+linenumber);
            linenumber++;
            System.out.println ("postition"+ position);
            System.out.println(line.charAt(position));
            System.out.println(position);
            System.out.println(line.length());

            int len = line.length();
            System.out.println(line.charAt(position));

            if (line.charAt(position)=='#'){
            count++;}
if(position +3>line.length()-1){
    System.out.println(position+3);
    position = (position +3)-len;
}else{
    position+=3;
}
        }



return count;
    }

    public static int multiplyTress(String[] input, int shift, int row){
        int answer =0;

        /**
         * Right 1, down 1.
         * Right 3, down 1. (This is the slope you already checked.)
         * Right 5, down 1.
         * Right 7, down 1.
         * Right 1, down 2.
         */

        int position =0;
        int count =0;
        int linenumber= 1;

//        while(linenumber+row <=input.length){
//            System.out.println(linenumber + "linenumber");
//            System.out.println(input.length);
            for (int x = 1; x<=input.length; x+=row ) {
                linenumber = x;


               String line = input[x-1];
//               System.out.println(position + " postion");
//               System.out.println(linenumber + "row");
//
//                System.out.println(line.charAt(position));

                int len = line.length();

                if (line.charAt(position) == '#') {
                    count++;
                }
                if (position + shift > line.length() - 1) {

                    position = (position + shift) - len;
                } else {
                    position += shift;
                }

            }
//linenumber+=row;
//            System.out.println(linenumber);
//        }

        return count;
    }


    public static void checkTree(String[] input){
System.out.println(" check "+ multiplyTress(input, 1,1));
        System.out.println(" check "+ multiplyTress(input, 3,1));
        System.out.println(" check "+ multiplyTress(input, 5,1));
       System.out.println(" check "+ multiplyTress(input, 7,1));
        System.out.println(" check "+ multiplyTress(input, 3,2));

        int i = multiplyTress(input, 1, 1) * multiplyTress(input, 3,1)* multiplyTress(input, 5, 1) * multiplyTress(input, 7, 1)  * multiplyTress(input, 3, 2);
        System.out.println(i);
//
////return multiplyTress(input, 1,1)*
//        multiplyTress(input, 3,1)*
//       multiplyTress(input, 5,1)*
//        multiplyTress(input, 7, 1)*
//        multiplyTress(input, 1, 2);

    }

}
