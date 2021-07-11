package Utils;

import java.io.File;
import java.io.IOException; import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
public class ReUtils1 {





    public String[] readFile(String number) throws IOException {
        String filepath = "src/main/resources/day";
        String fileName= filepath+number+".txt";





        //String fileName = "src/main/resources/Day1.txt";
        File file = new File(fileName);

        List<String> fileLinesList = Files.readAllLines(file.toPath());


        String [] fileLines = new String[fileLinesList.size()];


        int i=0;


        for(Object line : fileLinesList) { fileLines[i++] =  ((String) line);




        }
       // System.out.println(Arrays.toString(fileLines));

        return fileLines;
    }

 public Integer[] getIntarray(String[] stringarr){
      Integer[] arr = Arrays.stream(stringarr).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
      return arr;
 }
}