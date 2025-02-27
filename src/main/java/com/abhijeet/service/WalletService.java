package com.abhijeet.service;

import com.abhijeet.model.Order;
import com.abhijeet.model.User;
import com.abhijeet.model.Wallet;

public interface WalletService {

    Wallet getUserWallet (User user);
    Wallet addBalance(Wallet wallet, Long money);
    Wallet findWalletById(Long id) throws Exception;
    Wallet walletToWalletTransfer(User sender, Wallet recieverWallet,Long amount) throws Exception;
    Wallet payOrderPayment(Order order, User user) throws Exception;

}
