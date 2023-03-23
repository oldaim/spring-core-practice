package com.infrean.springcorepractice.order

import com.infrean.springcorepractice.AppConfig
import com.infrean.springcorepractice.member.Grade
import com.infrean.springcorepractice.member.Member
import com.infrean.springcorepractice.member.MemberServiceImpl
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class OrderServiceImplTest{

    private val memberService = AppConfig().memberService()
    private val orderService = AppConfig().orderService()

    @Test
    fun createOrder(){
        val memberId = 1L
        val member = Member(memberId, "memberA", Grade.VIP)

        memberService.join(member)

        Assertions.assertThat(memberService.findMember(memberId)).isNotNull

        val order = orderService.createOrder(memberId, "itemA", 20000)

        println(order)

        Assertions.assertThat(order.discountPrice).isEqualTo(2000)

    }


}