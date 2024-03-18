package com.example.demo.service;

import com.example.demo.controller.responses.GetUserInformationResponse;

public interface IUserService {
    public GetUserInformationResponse getUserInformation(String documentType, String documentNumber);
}
