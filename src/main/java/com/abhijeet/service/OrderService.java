package com.abhijeet.service;

import com.abhijeet.domain.OrderType;
import com.abhijeet.model.Coin;
import com.abhijeet.model.Order;
import com.abhijeet.model.OrderItem;
import com.abhijeet.model.User;

import java.util.List;

public interface OrderService {

    Order createOrder(User user, OrderItem orderItem, OrderType orderType);

    Order getOrderById(Long orderId) throws Exception;

    List<Order> getAllOrderOfUser(Long userId, OrderType orderType, String assetSymbol);

    Order processOrder(Coin coin, double quantity, OrderType orderType, User user) throws Exception;
}
