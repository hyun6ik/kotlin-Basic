package Lec22.java;

import Lec22.kotlin.KotlinThrow;

import java.io.IOException;

public class JavaThrow {

    public void throwIoException() throws IOException {
        throw new IOException("Checked Exception인 IOException 발생");
    }

    public static void main(String[] args) {
        final JavaThrow javaThrow = new JavaThrow();
        try {
            javaThrow.throwIoException();
        } catch (IOException e) {
            e.printStackTrace();
        }

        final KotlinThrow kotlinThrow = new KotlinThrow();
        try {
            kotlinThrow.throwIOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
