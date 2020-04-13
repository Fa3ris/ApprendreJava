package Scope.Pkg2;

import Scope.Pkg1.A;

// B n'est pas une classe public, n'est accessible que dans son package
//import Scope.Pkg1.B;

public class Main2 {
    public static void main(String[] args) {
        A a = new A();
//        B b = new B();
    }
}
