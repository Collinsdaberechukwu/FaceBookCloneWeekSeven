package com.example.facebookcloneweekseven.DTOs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String firstName;
    private String LastName;
    private String email;
    private String number;
    private String password;
}
