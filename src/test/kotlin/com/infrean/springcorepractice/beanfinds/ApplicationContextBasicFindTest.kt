package com.infrean.springcorepractice.beanfinds

import com.infrean.springcorepractice.AppConfig
import com.infrean.springcorepractice.member.MemberService
import com.infrean.springcorepractice.member.MemberServiceImpl
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.junit.jupiter.api.assertThrows
import org.springframework.beans.factory.NoSuchBeanDefinitionException

class ApplicationContextBasicFindTest {

    val ac = AnnotationConfigApplicationContext(AppConfig::class.java)

    @Test
    fun findBeanByName(){
        val memberService = ac.getBean("memberService", MemberService::class)
        Assertions.assertThat(memberService).isInstanceOf(MemberServiceImpl::class.java)
    }

    @Test
    fun findBeanByNameConst(){
        val memberService = ac.getBean("memberService",MemberServiceImpl::class)
        Assertions.assertThat(memberService).isInstanceOf(MemberServiceImpl::class.java)
    }

    @Test
    fun findBeanByNameCon(){

        assertThrows<NoSuchBeanDefinitionException> {ac.getBean("xxxx",MemberServiceImpl::class.java)}
    }
}