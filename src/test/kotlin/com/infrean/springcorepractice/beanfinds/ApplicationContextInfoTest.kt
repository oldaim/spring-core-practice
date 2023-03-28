package com.infrean.springcorepractice.beanfinds

import com.infrean.springcorepractice.AppConfig
import org.junit.jupiter.api.Test
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class ApplicationContextInfoTest {

    private val ac: ApplicationContext = AnnotationConfigApplicationContext(AppConfig::class.java)

    @Test
    fun findAllBean(){
        val beans = ac.beanDefinitionNames

        for (bean in beans) {
            val beanName = ac.getBean(bean)
            println("name = $beanName")
        }

    }

    @Test
    fun findMyAllBean(){
        val beans = ac.applicationName



            println("name = $beans")


    }

}