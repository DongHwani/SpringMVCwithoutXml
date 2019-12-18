package com.domain.member.entity;


import lombok.*;

import java.util.List;

@Getter @Setter @Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberDto {

    private String memberPassword;
    private String memberCheckPassword;

    private String memberName;
    private String memberEmail;
    private Integer memberAge;
    private String memberSex;
    private String memberAddress;
    private String memberPhoneNumber;
    private List<String> roles;
    private String memberGrade;
    private AccountEnable accountEnable;

}
