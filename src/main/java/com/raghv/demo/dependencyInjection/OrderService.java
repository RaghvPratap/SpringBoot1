package com.raghv.demo.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
//    @Autowired
    PaymentService paymentService;

    //constructor injection
    OrderService(PaymentService paymentService){
        this.paymentService=paymentService;
    }

    //Setter injection
    public void setPaymentService(PaymentService paymentService){
        this.paymentService=paymentService;
    }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order Placed");
    }
}
