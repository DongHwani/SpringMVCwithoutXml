package com.domain;

public interface MemberRepository {

    void addMemeber(Member member);

    void updateMember();

    Member getMember();

    void deleteMember();
}
