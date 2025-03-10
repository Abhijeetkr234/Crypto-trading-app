package com.abhijeet.service;

import com.abhijeet.domain.VerificationType;
import com.abhijeet.model.ForgotPasswordToken;
import com.abhijeet.model.User;


public interface ForgotPasswordService {

    ForgotPasswordToken createToken(User user,
                                    String id, String otp,
                                    VerificationType verificationType,
                                    String sendTo);

    ForgotPasswordToken findById(String id);

    ForgotPasswordToken findByUser(Long userId);

    void deleteToken(ForgotPasswordToken token);
}
