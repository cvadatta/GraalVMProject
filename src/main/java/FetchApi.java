import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

import java.io.File;
import java.io.IOException;

public class FetchApi {

    public static void main(String[] args) throws IOException {

        Context c= Context.create();
        File file=new File("src\\main\\resources\\fetch.js");
        //c.eval(Source.newBuilder("js",file).build());
        c.getBindings("js").putMember ("fetch", new Fetch ());
        Value answer = c.eval(Source.newBuilder("js",file).build());
        System.out.println(answer);
        //Value result=c.getBindings("js").getMember("tch");
        //Value resf=c.getBindings("js").putMember ("fetch", new Fetch ());
        //resf.execute();
        //System.out.println(answer);

    }
}
