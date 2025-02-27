package com.abhijeet.service;

import com.abhijeet.model.PaymentDetails;
import com.abhijeet.model.User;

public interface PaymentDetailsService {

    public PaymentDetails addPaymentDetails(String accountNumber,
                                                   String accountHolderName,
                                                   String ifsc,
                                                   String bankName,
                                                   User user);

    public PaymentDetails getUserPaymentDetails(User user);
}
