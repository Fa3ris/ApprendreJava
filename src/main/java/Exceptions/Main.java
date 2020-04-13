package Exceptions;

public class Main {

    public static void main(String[] args) {
        int i = 20, j= 0;

        try {
            System.out.println(i / j);
        }

        catch (ArithmeticException e){
            System.out.println("on ne passe pas! ");
        }

        try {
            TestMyException t = new TestMyException(1);
            t = new TestMyException("a");

        } catch (MyException e) {
            e.printStackTrace();
        }


    }
}
