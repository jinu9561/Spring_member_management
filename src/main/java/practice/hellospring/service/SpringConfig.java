package practice.hellospring.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import practice.hellospring.domain.Member;
import practice.hellospring.repository.*;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

//    @Bean
//    public MemberRepository memberRepository() {
//       return new MemoryMemberRepository();
//       return new JdbcMemberRepository(dataSource);
//       return new JdbcTemplateMemberRepository(dataSource);
//       return new JpaMemberRepository(em);
//    }

}
