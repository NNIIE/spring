package hello.core2.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(long memberId);
}
