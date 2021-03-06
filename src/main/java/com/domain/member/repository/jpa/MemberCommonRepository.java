package com.domain.member.repository.jpa;

import com.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberCommonRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByMemberEmail(String email);

    Optional<Member> findByMemberPhoneNumber(String phoneNumber);
}
