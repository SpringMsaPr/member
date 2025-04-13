package com.example.member.dto;

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


}
