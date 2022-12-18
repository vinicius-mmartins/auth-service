package com.github.viniciusmartins.authservice.model.groups;


import com.github.viniciusmartins.authservice.model.dto.UserDTO;

/**
 * I thought that I'd have to remove the @NotBlank annotation from
 * {@link UserDTO}, or to create another DTO for just update, because
 * on the update, not all fields would be filled. Then I remembered the
 * possibility of validating by groups and tried to implement for the first time
 * to test this feature.
 */


public interface Group {

    interface SignUp {

        interface SignUpUser {};

        interface UpdateUser {};

    };

}
