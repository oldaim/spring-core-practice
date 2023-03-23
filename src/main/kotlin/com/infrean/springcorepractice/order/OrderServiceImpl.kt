package com.infrean.springcorepractice.order

import com.infrean.springcorepractice.discount.DiscountPolicy
import com.infrean.springcorepractice.member.MemberRepository

class OrderServiceImpl(
    private val discountPolicy: DiscountPolicy,
    private val memberRepository: MemberRepository
) : OrderService{
    override fun createOrder(memberId: Long, itemName: String, itemPrice: Int): Order {
        val member = memberRepository.findById(memberId)

        val discount = discountPolicy.discount(member!!, itemPrice)

        return Order(memberId, itemName, itemPrice, discount)
    }
}