package com.github.viniciusmartins.authservice.controller;

import com.github.viniciusmartins.authservice.model.dto.UserDTO;
import com.github.viniciusmartins.authservice.service.interfaces.SignUpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;


@Slf4j
@RestController
@RequestMapping(value = "/auth/user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class SignUpController {

    private final SignUpService signUpService;

    @Autowired
    public SignUpController(final SignUpService signUpService) {
        this.signUpService = signUpService;
    }


    @PostMapping(value = "/sign-up")
    public ResponseEntity<UserDTO> signUp(String token, @Valid @RequestBody UserDTO user){
        log.info("Start of signUp. Request: {}", user.toString());
        UserDTO response = signUpService.signUp(token, user);
        URI uri = URI.create(ServletUriComponentsBuilder.fromPath("/auth/user").toUriString());
        log.info("End of SignUp");
        return ResponseEntity.created(uri).body(response);
    }

    @PatchMapping("/update-user")
    public ResponseEntity<UserDTO> updateUser(String token, @Valid @RequestBody UserDTO user){
        log.info("Start of updateUser");
        UserDTO response = signUpService.updateUser(token, user);
        log.info("End of updateUser");
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<UserDTO> getUser(String token){
        log.info("Start of getUser");
        UserDTO response = signUpService.getUser(token);
        log.info("End of updateUser");
        return ResponseEntity.ok(response);
    }

}
