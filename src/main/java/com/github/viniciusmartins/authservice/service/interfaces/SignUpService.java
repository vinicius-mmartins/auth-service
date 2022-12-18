package com.github.viniciusmartins.authservice.service.interfaces;

import com.github.viniciusmartins.authservice.model.dto.UserDTO;

public interface SignUpService {

    UserDTO signUp(String token, UserDTO userDTO);

    UserDTO updateUser(String token, UserDTO user);

    UserDTO getUser(String token);

}
