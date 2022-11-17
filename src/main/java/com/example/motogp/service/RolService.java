package com.example.motogp.service;

import com.example.motogp.model.Rol;
import com.example.motogp.model.User;

import java.util.ArrayList;
import java.util.List;

public class RolService {

    private List<Rol> roles;
    private List<User> users;

    public RolService(){
        roles = new ArrayList<>();
        roles.add(new Rol("3152", "Administrador"));
        roles.add(new Rol("4535", "Usuario"));
        roles.add(new Rol("2467", "Usuario"));
        roles.add(new Rol("9672", "Usuario"));
    }
    public List<Rol> getRoles(){return roles;}
}
