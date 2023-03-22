package com.infrean.springcorepractice.discount

import com.infrean.springcorepractice.member.Member

interface DiscountPolicy {

    fun discount(member: Member, price: Int):Int
}