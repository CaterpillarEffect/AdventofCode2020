package Day3;

import java.io.IOException;

import static Utils.ReUtils1.readFile;

public class Day3 {

    public static void main(String[] args) throws IOException {
        readFile("3");

        checkTree(readFile("3"));

    }

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

    public static int multiplyTress(String[] input, int shift, int row) {
        int answer = 0;
        int position = 0;
        int count = 0;

        for (int x = 1; x <= input.length; x += row) {



            String line = input[x - 1];

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

        return count;
    }


    public static void checkTree(String[] input){
        int no1 = multiplyTress(input, 1, 1);
        int no2 = multiplyTress(input, 3, 1);
        int no3 = multiplyTress(input, 5, 1);
        int no4 = multiplyTress(input, 7, 1);
        int no5 = multiplyTress(input, 1, 2);
        long solution = 70 * 240;
        solution = solution * 68 * 67 * 37;
        System.out.println(solution);
        double i = multiplyTress(input, 1, 1) * multiplyTress(input, 3, 1) * multiplyTress(input, 5, 1) * multiplyTress(input, 7, 1) * multiplyTress(input, 1, 2);
        System.out.println(i);


    }

}
