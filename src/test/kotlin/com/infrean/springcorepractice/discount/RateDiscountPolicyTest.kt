package com.infrean.springcorepractice.discount

import com.infrean.springcorepractice.member.Grade
import com.infrean.springcorepractice.member.Member
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class RateDiscountPolicyTest{

    private val rateDiscountPolicy = RateDiscountPolicy()

    @Test
    fun vip_o(){
        val member =  Member(2L, "memberBASIC", Grade.VIP)
        val discount = rateDiscountPolicy.discount(member, 10000)
        Assertions.assertThat(discount).isEqualTo(1000)
    }

    @Test
    fun vip_x(){
        val member =  Member(2L, "memberBASIC", Grade.BASIC)
        val discount = rateDiscountPolicy.discount(member, 10000)
        Assertions.assertThat(discount).isNotEqualTo(1000)
    }
}