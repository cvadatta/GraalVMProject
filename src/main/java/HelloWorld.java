
import org.graalvm.polyglot.*;


public class HelloWorld {

    context polyglot=context.create();
    polyglot.eval("js","print ('Hello JS from Graalvm!');");
}
