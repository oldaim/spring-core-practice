package com.infrean.springcorepractice.beanfinds

import com.infrean.springcorepractice.member.MemberRepository
import com.infrean.springcorepractice.member.MemoryMemberRepository
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.beans.factory.NoUniqueBeanDefinitionException
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat

class ApplicationContextTwoName {

    val ac =  AnnotationConfigApplicationContext(SameBeanConfig::class.java)

    @Test
    fun findBeansDuplicate(){
        assertThrows<NoUniqueBeanDefinitionException> {ac.getBean(MemberRepository::class.java)}
    }

    @Test
    fun findBeansDuplicateByName(){
        val bean = ac.getBean("mem1", MemberRepository::class.java)
        assertThat(bean).isInstanceOf(MemberRepository::class.java)

    }

    @Test
    fun findBeansDuplicateByName2(){
        val bean = ac.getBeansOfType(MemberRepository::class.java)
        assertThat(bean.keys.size).isEqualTo(2)

    }


    @Configuration
    class SameBeanConfig{

        @Bean
        fun mem1(): MemberRepository{
            return MemoryMemberRepository()
        }

        @Bean
        fun mem2(): MemberRepository{
            return MemoryMemberRepository()
        }

    }
}