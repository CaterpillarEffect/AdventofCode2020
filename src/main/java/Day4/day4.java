package Day4;

import Utils.ReUtils1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static Utils.ReUtils1.readFile;


public class day4 {
    public static void main(String[] args) {
        checkPassport(ReUtils1.skipEmptyLine(readFile("4")));


    }

    public static void checkPassport(ArrayList<String> e) {


        int correctPASSPORT = 0;
        for (String strings : e) {

            String[] str = strings.trim().split(":|\\s");

            Map<String, String> map = new HashMap<>();
            int forms = 0;
            for (int i = 0; i < str.length; i++) {

                map.put(str[i], str[i + 1]);


                i++;


            }
            for (String ss : map.keySet()) {
                //                    //byr (Birth Year)
                //                    //iyr (Issue Year)
                //                    //eyr (Expiration Year)
                //                    //hgt (Height)
                //                    //hcl (Hair Color)
                //                    //ecl (Eye Color)
                //                    //pid (Passport ID)
                //                    //cid (Country ID)
                if (ss.matches("eyr|hgt|iyr|ecl|pid|byr|hcl")) {
                    forms++;
                    if (forms >= 7) {

                        correctPASSPORT++;
                        System.out.println(correctPASSPORT);
                        forms = 0;

                    }

                }
                System.out.println(correctPASSPORT + "correct");

            }


        }

    }

//public static boolean checkcorrectformat(Map<String, String> map ){
//    Matcher hcl;
//    hcl = new Matcher();
//
//
//    if (map.containsKey("hcl") && map.containsKey("byr")&& map.containsKey("iyr")&&map.containsKey("hgt")&&map.containsKey("pid") )
//        return false;
//}
//
}