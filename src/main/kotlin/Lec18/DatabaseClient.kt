package Lec18

class DatabaseClient(
    var url: String? = null,
    var username: String? = null,
    var password: String? = null,
) {

    fun connect(): Boolean {
        println("DB 접속중")
        Thread.sleep(1000)
        println("DB 접속 완료")
        return true
    }
}

fun main() {
    val config = DatabaseClient()
    config.url = "localhost:3306"
    config.username = "mysql"
    config.password = "1234"
    val connected = config.connect()

    val connected2 = DatabaseClient()
        .run {
            this.url = "localhost:3306"
            this.username = "mysql"
            this.password = "1234"
            connect()
        }
    println(connected2)

    val connected3 = with(DatabaseClient()) {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
        connect()
    }
    println(connected3)

    val client = DatabaseClient().apply {
        this.url = "localhost:3306"
        this.username = "mysql"
        this.password = "1234"
    }
    println(client.connect())

}