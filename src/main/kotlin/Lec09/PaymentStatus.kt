package Lec09

enum class PaymentStatus(
    val label: String,
) : Payable {

    UNPAID("미지급") {
        override fun isPayable() = true
    },
    PAID("지급 완료") {
        override fun isPayable() = false
    },
    FAILED("지급 실패") {
        override fun isPayable() = false
    },
    REFUNDED("환불") {
        override fun isPayable() = false
    };

}