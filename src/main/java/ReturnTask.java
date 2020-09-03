import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

import java.io.File;
import java.io.IOException;

public class ReturnTask {
    public static void main(String[] args){
        Context c= Context.create();
        try {
            File Jsonjs=new File("src\\main\\resources\\Json.js");
            c.eval(Source.newBuilder("js",Jsonjs).build());
            ObjectNode data = createJsonNode();
            Value res=c.getBindings("js").getMember("returnsJson");
            Value resf=res.execute(data);
            System.out.println(resf);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static ObjectNode createJsonNode() {
        ObjectMapper objectMapper = new ObjectMapper(new JsonFactory());
        ObjectNode objectNode = objectMapper.createObjectNode();

        objectNode.put("firstName", "Siva");
        objectNode.put("lastName", "Datta");

        return objectNode;
    }

}
