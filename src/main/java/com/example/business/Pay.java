package com.example.business;

import com.example.business.pay.KsnetPayRequest;
import com.example.business.pay.NaverPayRequest;
import com.example.business.pay.PayInterface;
import lombok.Getter;

public class Pay {

    public enum PayGroup {
        CARD("CARD", new KsnetPay())
        , KAKAO("KAKAO", new NaverPay())
        , EMPTY("EMPTY", new KsnetPay());

        @Getter
        private PayInterface payInterface;
        private final String payType;

        PayGroup(String payType, PayInterface payInterface) {
            this.payType = payType;
            this.payInterface = payInterface;
        }

        public static PayGroup getType(String strType) {
            for (PayGroup pay : PayGroup.values()) {
                if (pay.payType.equals(strType)) {
                    return pay;
                }
            }
            return EMPTY;
        }



        public static class KsnetPay implements PayInterface<KsnetPay, KsnetPayRequest> {

            public String reWHCid;
            public String reWHCtype;
            public String reWHHash;

            public String reCommConId;
            public String reCommType;
            public String reHash;
            public String reCnclType;

            public KsnetPay() {
            }

            @Override
            public KsnetPay getDto(KsnetPayRequest value) {
                this.reWHCid = value.getReWHCid();
                return this;
            }
        }

        public static class NaverPay implements PayInterface<NaverPay, NaverPayRequest> {

            public String naverCid;

            public NaverPay() {
            }

            @Override
            public NaverPay getDto(NaverPayRequest value) {
                this.naverCid = value.getNaverCid();
                return this;
            }
        }
    }

}
