package com.abhijeet.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class PaymentResponse {
    private String payment_url;
}
