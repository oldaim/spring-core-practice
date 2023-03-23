package com.infrean.springcorepractice

import com.infrean.springcorepractice.member.Grade
import com.infrean.springcorepractice.member.Member
import com.infrean.springcorepractice.member.MemberService
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class MemberApp {

    fun main(args: Array<String>){

        val applicationContext = AnnotationConfigApplicationContext(AppConfig::class.java)
        val memberService = applicationContext.getBean("memberService",MemberService::class.java)

        val member = Member(1L, "kim", Grade.BASIC)

        memberService.join(member)
        val findMember = memberService.findMember(1L)

        println("new Member = ${member.id}")
        println("new Member = ${findMember?.name}")

    }
}