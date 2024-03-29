package com.example.demo1.dto.member;

import jakarta.validation.constraints.Email;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@NoArgsConstructor
@Setter
public class LoginDTO {

    @Email(message = "이메일 형식으로 입력하세요")
    private String email;

    private String password;

    private Integer session_time;

    @Builder
    public LoginDTO(String email, String password){
        this.email = email;
        this.password = password;
    }

}
