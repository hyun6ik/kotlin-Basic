package Lec18

fun main() {

    val str: String? = "Hello"

    val result: Int? = str?.let {
        println(it)

        val abc: String? = "abc"
        val def: String? = "def"

//        abc?.let {
//            def?.let {
//                println("abcdef가 nulll아님")
//            }
//        }
        if (!abc.isNullOrEmpty() && !def.isNullOrEmpty()) {
            println("abcdef null 아님")
        }

        1234
    }
    println(result)
}