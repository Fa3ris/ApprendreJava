package Exceptions;

public class TestMyException {


    public TestMyException(Object i) throws MyException {

        if (i.getClass() != Integer.class) {

            throw new MyException(i + " n'est pas un int");
        } else {

            System.out.println(i);
        }

    }
}
