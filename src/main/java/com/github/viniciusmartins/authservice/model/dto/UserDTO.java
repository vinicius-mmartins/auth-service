package com.github.viniciusmartins.authservice.model.dto;

import com.github.viniciusmartins.authservice.model.groups.Group;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDate;


@Getter
@Setter
@ToString
public class UserDTO implements Serializable {
    private static final long serialVersionUID = 5898031875326592054L;
    @NotBlank(groups = {Group.SignUp.SignUpUser.class})
    private String name;
    @NotBlank(groups = {Group.SignUp.SignUpUser.class})
    private String password;
    @NotBlank(groups = {Group.SignUp.SignUpUser.class})
    @Email
    private String email;
    @NotBlank(groups = {Group.SignUp.SignUpUser.class})
    @Future
    private LocalDate birthDate;
    @NotBlank(groups = {Group.SignUp.SignUpUser.class})
    @CPF
    private String cpf;
    @NotBlank(groups = {Group.SignUp.SignUpUser.class})
    private String address;

}
