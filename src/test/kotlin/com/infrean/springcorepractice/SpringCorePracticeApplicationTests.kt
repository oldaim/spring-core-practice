package com.infrean.springcorepractice

import com.infrean.springcorepractice.discount.DiscountPolicy
import com.infrean.springcorepractice.discount.FixDiscountPolicy
import com.infrean.springcorepractice.discount.RateDiscountPolicy
import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@SpringBootTest
class SpringCorePracticeApplicationTests {

   val ac = AnnotationConfigApplicationContext(TestConfig::class.java)

    @Configuration
    class TestConfig{

        @Bean
        fun rateDiscountPolicy(): DiscountPolicy = RateDiscountPolicy()

        @Bean
        fun fixDiscountPolicy(): DiscountPolicy = FixDiscountPolicy()

    }

    @Test
    fun findAllBeanByParentType(){
        val beansOfType = ac.getBeansOfType(DiscountPolicy::class.java)
        assertThat(beansOfType.size).isEqualTo(2)
    }

    @Test
    fun findAllBeanByObjectType(){
        val beansOfType = ac.getBeansOfType(Any::class.java)
        beansOfType.keys.forEach{
            println(it)
        }

    }


}
