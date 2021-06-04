package hello.hellospring.domain.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    //메소드 이름만으로 정해진 규칙에 따라 다르게 작동
    //JPQL select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
