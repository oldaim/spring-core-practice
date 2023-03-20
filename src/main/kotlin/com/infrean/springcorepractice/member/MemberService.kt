package com.infrean.springcorepractice.member

interface MemberService {

    fun join(member: Member)

    fun findMember(memberId: Long): Member?
}