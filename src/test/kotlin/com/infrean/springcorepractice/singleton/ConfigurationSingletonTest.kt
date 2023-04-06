package com.infrean.springcorepractice.singleton

import com.infrean.springcorepractice.AppConfig
import com.infrean.springcorepractice.member.MemberServiceImpl
import com.infrean.springcorepractice.order.OrderServiceImpl
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.getBean
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class ConfigurationSingletonTest {

    @Test
    @DisplayName("테스트")
    fun configurationTest(){
        val ac = AnnotationConfigApplicationContext(AppConfig::class.java)

        val bean = ac.getBean(AppConfig::class.java)

        println(bean.javaClass.toString())



    }
}