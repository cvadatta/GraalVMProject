public class TimeCalwithonlyJava {

    public static void main(String[] args){
        long avgonlyjava=0;
        for (int i=0;i<1000;i++){
            long starttime=System.nanoTime();
            System.out.println("Hello World!! Using only JAVA!!");
            long estimatedtime=System.nanoTime() -starttime;
            //System.out.println("Time taken for simple java program is:"+estimatedtime);
            avgonlyjava+=estimatedtime/1000;
        }
        System.out.println(avgonlyjava);
    }
}
