package com.infrean.springcorepractice

import com.infrean.springcorepractice.discount.RateDiscountPolicy
import com.infrean.springcorepractice.member.MemberServiceImpl
import com.infrean.springcorepractice.member.MemoryMemberRepository
import com.infrean.springcorepractice.order.OrderServiceImpl

class AppConfig {

    fun memberService() = MemberServiceImpl(MemoryMemberRepository())

    fun orderService() = OrderServiceImpl(RateDiscountPolicy(),MemoryMemberRepository())
}