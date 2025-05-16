package com.artify.security;

import io.jmix.security.role.annotation.ResourceRole;

@ResourceRole(name = "User1", code = User1Role.CODE)
public interface User1Role {
    String CODE = "user1";
}