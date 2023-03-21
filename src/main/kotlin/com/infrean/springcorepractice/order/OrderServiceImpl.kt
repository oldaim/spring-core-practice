package com.infrean.springcorepractice.order

import com.infrean.springcorepractice.discount.FixDiscountPolicy
import com.infrean.springcorepractice.member.MemberService
import com.infrean.springcorepractice.member.MemoryMemberRepository

class OrderServiceImpl(
    var memberService: MemberService
) : OrderService {


    private val discountPolicy = FixDiscountPolicy()

    override fun createOrder(memberId: Long, itemName: String, itemPrice: Int): Order {
        val member = memberService.findMember(memberId)
        println(member!!.id)
        val discount = discountPolicy.discount(member, itemPrice)

        return Order(memberId, itemName, itemPrice, discount)
    }
}