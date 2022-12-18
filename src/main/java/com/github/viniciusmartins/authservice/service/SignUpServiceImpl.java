package com.github.viniciusmartins.authservice.service;

import com.github.viniciusmartins.authservice.model.dto.UserDTO;
import com.github.viniciusmartins.authservice.service.interfaces.SignUpService;

public class SignUpServiceImpl implements SignUpService {

    @Override
    public UserDTO signUp(String token, UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO updateUser(String token, UserDTO user) {
        return null;
    }

    @Override
    public UserDTO getUser(String token) {

        //todo: extrair email do token e deixar visualizar somente os dele. é só fazer um find by email pelo email do token

        return null;
    }

}
