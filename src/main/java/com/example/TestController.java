package com.example;

import com.example.business.Pay;
import com.example.business.pay.KsnetPayRequest;
import com.example.business.pay.PayInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/demo")
public class TestController {

    @GetMapping("/test/{type}")
    public void test(@PathVariable String type) {

        KsnetPayRequest ksnetPayRequest = new KsnetPayRequest();
        Pay.PayGroup payGroup = Pay.PayGroup.getType(type);
        PayInterface pay = (PayInterface) payGroup.getPayInterface().getDto(ksnetPayRequest);
        System.out.println("aaa");
    }
}
