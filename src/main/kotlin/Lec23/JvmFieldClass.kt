package Lec23

class JvmFieldClass {

    companion object {

        @JvmField
        val id = 1234

        const val CODE = 1234
    }
}

object JvmFieldObject {

    @JvmField
    val name = "hyun6ik"

    const val FAMILY_NAME = "hyun6k"
}

fun main() {
    val id = JvmFieldClass.id
    val name = JvmFieldObject.name
}