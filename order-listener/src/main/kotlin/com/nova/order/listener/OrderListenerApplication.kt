package com.nova.order.listener

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component


@EnableKafka
@SpringBootApplication
class OrderListenerApplication

fun main(args: Array<String>) {
    runApplication<OrderListenerApplication>(*args)
}

@Component
class OrderListener {

    @KafkaListener(topics = ["order-listener"], groupId = "order-listener")
    fun placeOrder(order: Order) {
        println(order)
    }
}

typealias Order = String
