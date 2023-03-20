package com.infrean.springcorepractice

import com.infrean.springcorepractice.member.Grade
import com.infrean.springcorepractice.member.Member
import com.infrean.springcorepractice.member.MemberServiceImpl

class MemberApp {

    fun main(args: Array<String>){
        val memberService = MemberServiceImpl()
        val member = Member(1L, "kim", Grade.BASIC)

        memberService.join(member)
        val findMember = memberService.findMember(1L)

        println("new Member = ${member.id}")
        println("new Member = ${findMember?.name}")

    }
}