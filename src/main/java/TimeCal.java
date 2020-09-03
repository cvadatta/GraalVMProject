import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

import java.io.File;
import java.io.IOException;

public class TimeCal {

    public static void main(String[] args) throws IOException {

        Context c=Context.create();
        File abracadabra=new File("src\\main\\resources\\TimeCal.js");
        c.eval(Source.newBuilder("js",abracadabra).build());
        Value res=c.getBindings("js").getMember("hello");
        int avgwithjs=0;
        for(int i=0;i<1000;i++){
            long starttime=System.nanoTime();

            Value resf=res.execute();

            long estimatedtime=System.nanoTime() -starttime;

            //System.out.println("Time taken for java and java script program  is:"+estimatedtime);

            avgwithjs+=estimatedtime/1000;
        }

        System.out.println(avgwithjs);

    }

}
