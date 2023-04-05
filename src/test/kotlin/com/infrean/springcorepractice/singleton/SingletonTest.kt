package com.infrean.springcorepractice.singleton

import com.infrean.springcorepractice.AppConfig
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class SingletonTest {

    @Test
    @DisplayName("스프링없는 순수한 DI 컨테이너")
    fun pureContainer(){
        val appConfig = AppConfig()

        val memberService1 = appConfig.memberService()

        val memberService2 = appConfig.memberService()

        println(memberService1)
        println(memberService2)

        assertThat(memberService1).isNotSameAs(memberService2)
    }

    @Test
    @DisplayName("싱글턴 패턴을 적용한 객체 사용")
    fun singletonServiceTest(){
        val single = SingletonService
        val single2 = SingletonService


        assertThat(single).isSameAs(single2)
    }

    @Test
    @DisplayName("스프링없는 순수한 DI 컨테이너")
    fun springContainer(){
        val applicationContext = AnnotationConfigApplicationContext()

        val memberService1 = applicationContext.getBean("memberService")

        val memberService2 = applicationContext.getBean("memberService")

        println(memberService1)
        println(memberService2)

        assertThat(memberService1).isSameAs(memberService2)
    }
}