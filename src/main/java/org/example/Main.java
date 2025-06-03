package org.example;

import org.example.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 加载 Spring 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 获取 OrderService Bean
        OrderService orderService = context.getBean(OrderService.class);

        // 调用业务方法，触发 AOP 切面
        orderService.createOrder("ORDER_20240101");
    }
}