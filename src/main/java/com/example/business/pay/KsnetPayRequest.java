package com.example.business.pay;

import lombok.Getter;
import lombok.Setter;

public class KsnetPayRequest {
    @Getter
    @Setter
    private String reWHCid;
    @Getter
    private String reWHCtype;
    @Getter
    private String reWHHash;

    @Getter
    private String reCommConId;
    @Getter
    private String reCommType;
    @Getter
    private String reHash;
    @Getter
    private String reCnclType;
}
