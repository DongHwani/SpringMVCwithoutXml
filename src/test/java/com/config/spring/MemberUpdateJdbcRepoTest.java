package com.config.spring;

import com.domain.member.entity.Member;
import com.domain.member.repository.MemberUpdateJdbcRepo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootAppConfig.class})
public class MemberUpdateJdbcRepoTest {

    @Autowired
    private MemberUpdateJdbcRepo memberUpdateJdbcRepo;

    @Test
    public void addMember() throws Exception {
        //Given
        Member member = Member.builder()
                .memberPassword("123")
                .memberName("dhk")
                .build();

        //When & Then
        Assert.assertEquals(1, memberUpdateJdbcRepo.addMemeber(member));
    }

    @Test
    public void getMember() throws Exception {

        Member member = memberUpdateJdbcRepo.getMember(6L);

        //When & Then
        Assert.assertEquals("dhk", member.getMemberName());
    }
}