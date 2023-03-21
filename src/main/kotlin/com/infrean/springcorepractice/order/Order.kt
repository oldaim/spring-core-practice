package com.infrean.springcorepractice.order

class Order(
    var memberId: Long,
    var itemName: String,
    var itemPrice: Int,
    var discountPrice: Int
) {

    fun calculatePrice() = itemPrice - discountPrice

    override fun toString(): String {
        return "Order(" +
                "memberId=$memberId, " +
                "itemName='$itemName', " +
                "itemPrice=$itemPrice, " +
                "discountPrice=$discountPrice" +
                ")"
    }
}