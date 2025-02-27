package com.abhijeet.request;

import com.abhijeet.domain.OrderType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class CreateOrderRequest {
    private String coinId;
    private double quantity;
    private OrderType orderType;
}
