package Utils;

import java.io.File;
import java.io.IOException; import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
public class ReUtils1 {





    public Integer[] main() throws IOException {





        String fileName = "src/main/resources/Day1_1.txt"; File file = new File(fileName);

        List<String> fileLinesList = Files.readAllLines(file.toPath());


        Integer [] fileLines = new Integer[fileLinesList.size()];


        int i=0;


        for(Object line : fileLinesList) { fileLines[i++] =  Integer.valueOf((String) line);




        }
       // System.out.println(Arrays.toString(fileLines));

        return fileLines;
    }}