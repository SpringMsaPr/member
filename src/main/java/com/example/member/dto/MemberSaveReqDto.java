package com.example.member.dto;

import com.example.member.domain.Member;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MemberSaveReqDto {
    private String name;
    private String email;
    private String password;

    public Member toEntity(String encodedPassword){
        return Member.builder()
                .name(this.name)
                .email(this.email)
                .password(encodedPassword)
                .build();
    }
}
