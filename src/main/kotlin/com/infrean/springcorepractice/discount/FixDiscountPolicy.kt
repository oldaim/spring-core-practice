package com.infrean.springcorepractice.discount

import com.infrean.springcorepractice.member.Grade
import com.infrean.springcorepractice.member.Member

class FixDiscountPolicy : DiscountPolicy {

    private val discountFixAmount = 1000

    override fun discount(member: Member, price: Int): Int {
        return if (member.grade == Grade.VIP){
            discountFixAmount
        } else 0
    }
}