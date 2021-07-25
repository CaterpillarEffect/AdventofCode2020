package Utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReUtils1 {


    public static void main(String[] args) throws IOException {
        skipEmptyLine(readFile("test"));
    }


    public static String[] readFile(String number) {
        String filepath = "src/main/resources/day";
        String fileName = filepath + number + ".txt";


        File file = new File(fileName);


        try {
            List<String> fileLinesList = Files.readAllLines(file.toPath());
            String[] fileLines = new String[fileLinesList.size()];


            int i = 0;


            for (Object line : fileLinesList) {
                fileLines[i++] = ((String) line);


            }


            return fileLines;

        } catch (Exception IOException) {
            System.out.println("could not read file ");

        }

        return new String[1];

    }

    public Integer[] getIntarray(String[] stringarr) {
       return Arrays.stream(stringarr).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

    }

    public static ArrayList<String> skipEmptyLine(String[] arrays) {

        ArrayList<String> source = new ArrayList<>();
        int count = 0;
        String y = null;
        String answer = "";
        int i = 0;

        for (String array : arrays) {


            if (array.isEmpty()) {


                source.add(answer);


                count++;
                answer = "";


            } else if (i + 1 == arrays.length) {
                answer = answer + " " + array;
                source.add(answer);
            } else {


                answer = answer + " " + array;


            }
            i++;

        }

        return source;

    }
}