package com.github.viniciusmartins.authservice.model.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;


@Getter
@Setter
public class LoginDTO implements Serializable {
    private static final long serialVersionUID = -4384906939623520565L;

    @NotBlank
    private String user;
    @NotBlank
    private String password;

}
