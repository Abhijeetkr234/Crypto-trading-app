package com.abhijeet.model;

import com.abhijeet.domain.OrderStatus;
import com.abhijeet.domain.OrderType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Setter
@Getter
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private User user;

    @Column(nullable = false)
    private OrderType orderType;

    @Column(nullable = false)
    private BigDecimal price;

    private LocalDateTime timestamp= LocalDateTime.now();

    @Column(nullable = false)
    private OrderStatus status;
    @OneToOne(mappedBy = "order",cascade = CascadeType.ALL)
    private OrderItem orderItem;

}
