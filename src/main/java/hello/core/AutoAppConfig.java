package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

 // @Component는 빈에 등록 , AppConfig빼기위해 제외항목도 설정
@Configuration
@ComponentScan (
		basePackages = "hello.core.member",
		excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
	@Bean(name = "memoryMemberRepository")
	 MemberRepository memberRepository() {
		return new MemoryMemberRepository();
	}
}
