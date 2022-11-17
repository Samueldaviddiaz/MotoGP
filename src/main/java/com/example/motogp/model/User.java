package com.example.motogp.model;

import com.example.motogp.model.dto.UserDTO;
import lombok.Data;

@Data
public class User {

    private String email;
    private String password;
    private Rol rol;

    public User (String email, String password, Rol rol) {
        this.email = email;
        this.password = password;
        this.rol = rol;
    }

    public UserDTO userToDTO() {
        UserDTO userDTO = new UserDTO(this.email, this.getRol().getDescription());
        return userDTO;
    }
}