import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

import java.io.File;
import java.io.IOException;


public class IntegerScript {

    public static void main(String[] args) throws IOException {
        Context c=Context.create();
        File file=new File("src\\main\\resources\\integerscript.js");
        c.eval(Source.newBuilder("js",file).build());
        Value res=c.getBindings("js").getMember("sumofnums");
        Value finalresult=res.execute(10,20);
        System.out.println(finalresult);
    }

    public static int sumoftwonums(int a,int b){
        return a+b;
    }
}
