package lop_StopWatch;

public class main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        double a = stopWatch.start();
        for(int i  = 0;i < 10000; i++) {
            System.out.println(i);
        }
        double b = stopWatch.stop();
        System.out.println(b-a);
    }
}