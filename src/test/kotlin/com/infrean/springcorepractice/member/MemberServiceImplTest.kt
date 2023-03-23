package com.infrean.springcorepractice.member


import com.infrean.springcorepractice.AppConfig
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

 class MemberServiceImplTest {

     private val memberService = AppConfig().memberService()

     @Test
     fun joinTest() {

         val member = Member(1L, "memberA", Grade.VIP)

         memberService.join(member)
         val findMember = memberService.findMember(1L)

         Assertions.assertThat(member).isEqualTo(findMember)

     }

 }