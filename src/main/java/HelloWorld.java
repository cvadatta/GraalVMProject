import org.graalvm.polyglot.Context;

public class HelloWorld {
    public static void main(String[] args){

        Context c = Context.create();
        c.eval("js", "print('Hello JavaScript!')");
    }



}
