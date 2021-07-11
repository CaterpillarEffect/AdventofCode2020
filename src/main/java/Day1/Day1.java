package Day1;

import Utils.ReUtils1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Day1 {


    public static void main(String[] args) throws IOException {

        ReUtils1 utils = new ReUtils1();
        System.out.println("this is answer! " + addsum2020(utils.getIntarray(utils.readFile("1"))));
        System.out.println("this is answer! " + addthree20201(utils.getIntarray(utils.readFile("1"))));
    }

    public static int addsum2020(Integer[] arr) {

        int answer = 0;

        ArrayList<Integer> y;
        ArrayList e = new ArrayList<>(Arrays.asList(arr));

        List<Integer> integers = Arrays.stream(arr)
                .collect(Collectors.toList());

        for (Integer integer : integers) {
            OptionalInt any =
                    integers.stream()
                            .filter(x -> integer + x == 2020)
                            .mapToInt(x -> integer * x).findFirst();

            if (any.isPresent()) {
                int result = any.getAsInt();
                answer = result;
                break;
            }

        }




        return answer;
    }


    public static int addthree20201(Integer[] arr) {

        int answer = 0;
        List<Integer> integers = Arrays.stream(arr) //Int str
                .collect(Collectors.toList());

       outer: for (Integer x : integers) {


            for (Integer y: integers){

                OptionalInt any =integers.stream()
                        .filter(z->x+y+z==2020)
                        .distinct()
                        .mapToInt(z ->z*y*x)
                        .findAny();


                if (any.isPresent()) {
                    int result = any.getAsInt();
                    answer = result;
                    break outer;
                }
            }
        }


        return answer;
    }

}

