package com.example.demo.controller.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ErrorResponse {

    @JsonProperty("mensaje_error")
    private String errorMessage;

}
