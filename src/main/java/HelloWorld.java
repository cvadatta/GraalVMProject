public class HelloWorld {
    public static void main(String[] args){
        Context polyglot = Context.create();
        polyglot.eval("js", "print('Hello JavaScript!')");
    }
}
