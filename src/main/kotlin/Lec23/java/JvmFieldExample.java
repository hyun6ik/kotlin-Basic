package Lec23.java;

import Lec23.JvmFieldClass;
import Lec23.JvmFieldObject;

public class JvmFieldExample {

    public static void main(String[] args) {
        final int id = JvmFieldClass.id;
        final String name = JvmFieldObject.name;

        final int code = JvmFieldClass.CODE;

        final String familyName = JvmFieldObject.FAMILY_NAME;
    }
}
