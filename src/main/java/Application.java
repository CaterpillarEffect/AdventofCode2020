import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

//import javax.naming.Context;
import org.graalvm.polyglot.*;

public class Application {

    public static void main(String[] args) {
        Context jsContext = Context.create("js");
        runScript("console.log('Hello from the project')", jsContext);
        String Day1="var numbers = new Int8Array();\n" +
                "\n" +
                "function loadFile() {\n" +
                "    var fs = require(\"fs\");\n" +
                "    var text = fs.readFileSync(\"Day1_1.txt\").toString('utf-8');\n" +
                "    numbers = text.split(\"\\n\").map(Number);\n" +
                "}\n" +
                "\n" +
                "loadFile();\n" +
                "//var text = fs.readFileSync(\".src/main/resources/Day1_1.txt\", \"utf-8\");\n" +
                "twoSum(numbers,2020)\n" +
                "var twoSum = function(nums, target) {\n" +
                "    let  response =new Array();\n" +
                "\n" +
                "    for(var x =0; x<nums.length; x++){\n" +
                "\n" +
                "        var check= nums.slice(x+1);\n" +
                "\n" +
                "        if  (check.includes(target-nums[x])){\n" +
                "\n" +
                "             response.push(x);\n" +
                "            for (var y=x+1; y<nums.length; y++){\n" +
                "\n" +
                "                if(nums[y]+nums[x]=== target){\n" +
                "\n" +
                "                     response.push(y);\n" +
                "        break;\n" +
                "                }\n" +
                "            }\n" +
                "\n" +
                "\n" +
                "             }\n" +
                "\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "    console.log(response);\n" +
                "   return response;\n";
        runScript(Day1,jsContext);
    }
    private static Value runScript(String script, Context context) {
        return context.eval("js", script);
    }
}

