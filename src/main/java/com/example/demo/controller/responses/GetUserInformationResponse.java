package com.example.demo.controller.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class GetUserInformationResponse {
        @JsonProperty("primer_nombre")
        private String firstName;
        @JsonProperty("segundo_nombre")
        private String secondName;
        @JsonProperty("primer_apellido")
        private String firstLastName;
        @JsonProperty("segundo_apellido")
        private String secondLastName;
        @JsonProperty("telefono")
        private String phone;
        @JsonProperty("direccion")
        private String address;
        @JsonProperty("ciudad_residencia")
        private String city;
}
