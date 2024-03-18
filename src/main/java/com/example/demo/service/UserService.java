package com.example.demo.service;

import com.example.demo.controller.responses.GetUserInformationResponse;
import com.example.demo.service.exceptions.UserServiceExceptions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@Slf4j//logs en consola
public class UserService implements IUserService{

    @Override
    public GetUserInformationResponse getUserInformation(String documentType, String documentNumber) {
        HashMap<String,String> userInformation = new HashMap<>();
        userInformation.put("primer_nombre","Juan");
        userInformation.put("segundo_nombre", "Antonio");
        userInformation.put("primer_apellido", "Perez");
        userInformation.put("segundo_apellido", "Barela");
        userInformation.put("telefono", "3001231234");
        userInformation.put("direccion", "calle falsa 123");
        userInformation.put("ciudad_residencia", "Avenida Siempreviva");
        userInformation.put("tipo_documento", "c");
        userInformation.put("numero_documento", "10121314");

        if (!documentType.equalsIgnoreCase("c")&&!documentType.equalsIgnoreCase("p")){
            throw new UserServiceExceptions.NotValidDocumentType("Tipo de docuemto Invalido");
        }

        if (!userInformation.get("tipo_documento").equalsIgnoreCase(documentType) || !userInformation.get("numero_documento").equals(documentNumber)){
            throw new UserServiceExceptions.NotFound("Usuario no encontrado");
        }


        GetUserInformationResponse response = GetUserInformationResponse.builder()
                .address(userInformation.get("direccion"))
                .city(userInformation.get("ciudad_residencia"))
                .phone(userInformation.get("telefono"))
                .firstLastName(userInformation.get("primer_apellido"))
                .secondLastName(userInformation.get("segundo_apellido"))
                .firstName(userInformation.get("primer_nombre"))
                .secondName(userInformation.get("segundo_nombre"))
                .build();

        return response;
    }
}
