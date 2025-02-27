package com.abhijeet.model;

import com.abhijeet.domain.PaymentMethod;
import com.abhijeet.domain.PaymentOrderStatus;
import com.fasterxml.jackson.core.Base64Variant;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class PaymentOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long amount;

    private PaymentOrderStatus status;

    private PaymentMethod paymentMethod;

    @ManyToOne
    private User user;
}
