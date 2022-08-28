package Lec09

fun main() {
    println(PaymentStatus.PAID.label)

    if (PaymentStatus.UNPAID.isPayable()) {
        println("결제 가능 상태")
    }

    val paymentStatus = PaymentStatus.valueOf("PAID")
    println(paymentStatus.label)

    if (paymentStatus == PaymentStatus.PAID) {
        println("결제 완료 상태")
    }

    for (status in PaymentStatus.values()) {
        println("[$status] (${status.label})")
    }

    for (status in PaymentStatus.values()) {
        println("[${status.name}] (${status.label}) : ${status.ordinal}")
    }
}