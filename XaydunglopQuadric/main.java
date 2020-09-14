package PT_bac2;

public class main {
    public static void main(String[] args) {
        QuadraticEquation ptb2 = new QuadraticEquation();
        ptb2.setA(5);
        ptb2.setB(-2);
        ptb2.setC(8);
        System.out.println(ptb2.delta());
        System.out.println(ptb2.getRoot());


    }
}
