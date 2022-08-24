package hello.core2.discount;

import hello.core2.member.Grade;
import hello.core2.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용 되여야 함")
    void vipDiscountTest() {
        Member member = new Member(1L, "memberVIP", Grade.VIP);
        int discount = discountPolicy.discount(member, 10000);
        assertEquals(discount, 1000,
                () -> Grade.VIP + "는 1000원 할인되어야 한다.");
    }

    @Test
    @DisplayName("VIP가 아니면 할인이 적용되지 않아야 한다")
    void notVipDiscountTest() {
        Member member = new Member(2L, "memberBASIC", Grade.Basic);
        int discount = discountPolicy.discount(member, 10000);
        assertEquals(discount, 0,
                () -> Grade.Basic + "는 할인 되지 않아야 한다");
    }
}