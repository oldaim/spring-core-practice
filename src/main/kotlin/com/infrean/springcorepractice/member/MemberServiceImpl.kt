package com.infrean.springcorepractice.member

class MemberServiceImpl(): MemberService{

    private val memberRepository: MemberRepository = MemoryMemberReposiotry()

    override fun join(member: Member) {
        memberRepository.save(member)
    }

    override fun findMember(memberId: Long): Member? {
       return memberRepository.findById(memberId)
    }
}