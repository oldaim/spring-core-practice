package com.infrean.springcorepractice

import com.infrean.springcorepractice.discount.DiscountPolicy
import com.infrean.springcorepractice.discount.RateDiscountPolicy
import com.infrean.springcorepractice.member.MemberRepository
import com.infrean.springcorepractice.member.MemberServiceImpl
import com.infrean.springcorepractice.member.MemoryMemberRepository
import com.infrean.springcorepractice.order.OrderServiceImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AppConfig {
    @Bean
    fun memberService() = MemberServiceImpl(memberRepository())
    @Bean
    fun orderService() = OrderServiceImpl(discountPolicy(), memberRepository())
    @Bean
    fun discountPolicy(): DiscountPolicy = RateDiscountPolicy()
    @Bean
    fun memberRepository(): MemberRepository = MemoryMemberRepository()
}