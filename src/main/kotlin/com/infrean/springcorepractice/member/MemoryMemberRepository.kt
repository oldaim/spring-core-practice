package com.infrean.springcorepractice.member

import java.util.concurrent.ConcurrentHashMap

class MemoryMemberRepository : MemberRepository {

    private var store = HashMap<Long,Member>()

    override fun save(member: Member) {
        store[member.id] = member
        println(member.name)
    }

    override fun findById(memberId: Long): Member? {
        store.forEach{
            println(it.key)
            println(it.value)
        }
        return store[memberId]
    }
}