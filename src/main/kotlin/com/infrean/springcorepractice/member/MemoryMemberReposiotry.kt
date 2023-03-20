package com.infrean.springcorepractice.member

import java.util.concurrent.ConcurrentHashMap

class MemoryMemberReposiotry(): MemberRepository {

    private var store = ConcurrentHashMap<Long,Member>()

    override fun save(member: Member) {
        store[member.id] = member
    }

    override fun findById(memberId: Long): Member? {
        return store[memberId];
    }
}