package Lec24.java;

import Lec24.MyExtensionKt;

public class ExtensionExample {

    public static void main(String[] args) {
        final char a = MyExtensionKt.first("ABCD");
        final String zabcd = MyExtensionKt.addFirst("ABCD", 'Z');

        System.out.println(a);
        System.out.println(zabcd);
    }
}
