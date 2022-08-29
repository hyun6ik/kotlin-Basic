package Lec13

sealed class Developer {

    abstract val name: String
    abstract fun code(language: String)
}

data class BackendDeveloper(
    override val name: String,
) : Developer() {
    override fun code(language: String) {
        println("저는 백엔드 개발자 입니다. 저는 ${language}를 사용합니다.")
    }
}

data class FrontEndDeveloper(
    override val name: String,
) : Developer() {

    override fun code(language: String) {
        println("저는 프론트엔드 개발자 입니다. 저는 ${language}를 사용합니다.")
    }
}

data class DevOpsDeveloper(
    override val name: String,
) : Developer() {
    override fun code(language: String) {
        println("저는 데브옵스 개발자 입니다. 저는 ${language}를 사용합니다.")
    }
}

object DeveloperPool {
   val pool = mutableMapOf<String, Developer>()

    fun add(developer: Developer) = when (developer) {
        is BackendDeveloper -> pool[developer.name] = developer
        is FrontEndDeveloper -> pool[developer.name] = developer
        is DevOpsDeveloper -> pool[developer.name] = developer
    }

    fun get(name: String) = pool[name]
}

fun main() {
    val backendDeveloper = BackendDeveloper(name = "hyun6ik")
    DeveloperPool.add(backendDeveloper)

    val frontEndDeveloper = FrontEndDeveloper(name = "dongdu")
    DeveloperPool.add(frontEndDeveloper)

    println(DeveloperPool.get("hyun6ik"))
    println(DeveloperPool.get("dongdu"))
}