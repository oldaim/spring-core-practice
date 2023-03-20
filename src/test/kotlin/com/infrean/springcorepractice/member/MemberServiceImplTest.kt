package com.infrean.springcorepractice.member


import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

 class MemberServiceImplTest {

     val memberService = MemberServiceImpl()

     @Test
     fun joinTest() {

         val member = Member(1L, "memberA", Grade.VIP)

         memberService.join(member)
         val findMember = memberService.findMember(1L)

         Assertions.assertThat(member).isEqualTo(findMember)

     }

 }