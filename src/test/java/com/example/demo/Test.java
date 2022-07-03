package com.example.demo;

import com.example.business.Pay;
import com.example.business.pay.KsnetPayRequest;
import com.example.business.pay.PayInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class Test {

    @org.junit.jupiter.api.Test
    public void 테스트() {

        String type = "CARD";
        KsnetPayRequest ksnetPayRequest = new KsnetPayRequest();
        ksnetPayRequest.setReWHCid("성공");
        Pay.PayGroup payGroup = Pay.PayGroup.getType(type);
        PayInterface pay = (PayInterface) payGroup.getPayInterface().getDto(ksnetPayRequest);
        System.out.println("aaa");
    }
}
