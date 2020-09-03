import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

import java.io.File;
import java.io.IOException;

public class HelloWorld {
    public static void main(String[] args) throws IOException {

        Context c = Context.create();
        File file=new File("src\\main\\resources\\TimeCal.js");
        c.eval(Source.newBuilder("js",file).build());
        Value answer=c.getBindings("js").getMember("fibonacci");
        Value result=answer.execute(12);
        System.out.println("Saying Hello World for "+result+" times");


    }



}
