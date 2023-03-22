package com.infrean.springcorepractice.discount

import com.infrean.springcorepractice.member.Grade
import com.infrean.springcorepractice.member.Member

class RateDiscountPolicy: DiscountPolicy {

    private val discountPercent = 10

    override fun discount(member: Member, price: Int): Int =
        if(member.grade == Grade.VIP) price * discountPercent / 100 else price

}