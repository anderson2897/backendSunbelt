package com.example.demo.controller;

import com.example.demo.controller.responses.GetUserInformationResponse;
import com.example.demo.model.ServiceUserParametres;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/document")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    private IUserService userService;
    @PostMapping
    public ResponseEntity<GetUserInformationResponse> getUserInformation(@RequestBody ServiceUserParametres bodyParams){
      GetUserInformationResponse response = userService.getUserInformation(bodyParams.getTipoDocumento(), bodyParams.getNumeroDocumento());
      return new ResponseEntity<>(response, HttpStatus.OK);
    }
}//class
