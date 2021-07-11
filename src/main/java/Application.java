import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

//import javax.naming.Context;
import org.graalvm.polyglot.*;

public class Application {

    public static void main(String[] args) {
        Context jsContext = Context.create("js");
        runScript("console.log('Hello from the project')", jsContext);

       // runScript(Day1,jsContext);
    }
    private static Value runScript(String script, Context context) {
        return context.eval("js", script);
    }
}

