package com.passamv.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class LogoutResponse {

    private String message;

}
