package hello.core2.member;

import hello.core2.AppConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void joinTest() {
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        assertEquals(memberService.findMember(1L).getName(), "memberA");
    }



}