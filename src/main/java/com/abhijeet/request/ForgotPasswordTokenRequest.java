package com.abhijeet.request;

import com.abhijeet.domain.VerificationType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ForgotPasswordTokenRequest {
    private String sentTo;
    private VerificationType verificationType;
}
