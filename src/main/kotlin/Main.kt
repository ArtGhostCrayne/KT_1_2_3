fun main() {
    val audiophile = true
    var totalPrice: Double = 15505.0

    println("������� $totalPrice")

    var discount: Double = if (totalPrice > 1000 && totalPrice <= 10000) {
        100.0
    } else (if (totalPrice > 10000) {
        totalPrice * 0.05
    } else 0) as Double

    println("������ �� ����� �������: $discount")

    totalPrice -= (discount);

    if (audiophile) {
        totalPrice = totalPrice * 0.99
        discount = totalPrice * 0.01
        println("������ ��������: $discount")
    }

    println("��������� ������� � ������ ������ $totalPrice")


}