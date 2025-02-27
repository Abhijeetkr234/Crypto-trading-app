package com.abhijeet.service;

import com.abhijeet.domain.VerificationType;
import com.abhijeet.model.User;
import com.abhijeet.model.VerificationCode;

public interface VerificationCodeService {

    VerificationCode sendVerificationCode(User user, VerificationType verificationType);

    VerificationCode getVerificationCodeById(Long id) throws Exception;

    VerificationCode getVerificationCodeByUser(Long userId);

    

    void deleteVerificationCodeById(VerificationCode verificationCode);
}
