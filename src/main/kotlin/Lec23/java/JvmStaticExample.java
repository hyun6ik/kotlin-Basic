package Lec23.java;

import Lec23.HelloClass;
import Lec23.HiObject;

public class JvmStaticExample {

    public static void main(String[] args) {
        final String hello = HelloClass.hello();

        final String hi = HiObject.hi();
    }
}
