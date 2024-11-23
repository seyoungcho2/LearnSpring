## 스프링 의존성 주입 시리즈를 만들며

스프링에서의 의존성 주입은 스프링의 기초가 되는 기술 중 하나로, 스프링 애플리케이션을 제대로 만들기 위해서는 의존성 주입에 대한 적절한 이해가 필요하다. 하지만 내가 스프링을 공부하면서 느낀 점은 의존성 주입과 관련된 내용을 체계적으로 정리한 자료를 찾기가 않다는 점이었다. 나는 이미 안드로이드 개발을 하면서 Koin, Dagger, Dagger-Hilt 등의 의존성 주입 프레임워크를 경험한 적이 있기 때문에 내가 알고 있던 다양한 키워드를 동원해 내가 아는 지식들을 찾았지만, 스프링에서 의존성 주입에 대해 처음 접한다면 의존성 주입에 대한 지식을 체계적으로 정리하기 힘들 것 같다 느꼈다. 이에 스프링 의존성 주입에 대한 내용들이 한 번에 쭉 정리할 수 있는 자료가 있으면 좋겠다는 생각을 했고, 그 자료를 내가 만들어보자는 생각을 했다.

이 시리즈에서는 의존성 주입이 무엇인지 부터 시작해, 스프링에서는 의존성 주입을 위해 컨테이너를 어떻게 만들고, 그 내부에 객체를 어떻게 저장하는지, 객체가 생성되고 파괴되는 범위를 어떻게 관리하는지 등을 단계적으로 다룬다. 이를 통해 의존성 주입의 기초를 탄탄히 다질 수 있도록 한다.  

이 자료가 많은 분들께 도움이 되기를 바란다.

> 전체 코드: [GitHub](https://github.com/seyoungcho2/LearnSpringKotlin/tree/main/di)  
> 이 프로젝트가 도움이 되셨다면 [저장소](https://github.com/seyoungcho2/LearnSpringKotlin)에 Star⭐️를 눌러주세요! [Stargazers](https://github.com/seyoungcho2/LearnSpringKotlin/stargazers)는 다음 페이지에서 확인할 수 있습니다.

> 이 시리즈에서는 특정 모듈(MVC 등)과 관련된 의존성 주입의 범위와 관련된 내용은 다루지 않는다. 이와 관련된 내용은 각 모듈을 다루면서 별도로 다룰 것이다.

## 글 목록

1\. [\[Kotlin\] 의존성이란 무엇인가? 강한 결합과 느슨한 결합을 통해 이해하는 의존성](https://kotlinworld.com/565)

2\. [\[](https://kotlinworld.com/566)[Kotlin](https://kotlinworld.com/565)[\] 느슨한 결합의 장점과 한계 자세히 알아보기](https://kotlinworld.com/566)

3\. [\[Spring\] 의존성 주입이란 무엇인가? IOC Container과 Bean으로 알아보는 의존성 주입](https://kotlinworld.com/567)

4\. [\[Spring\] IOC Container에 등록된 모든 Bean의 이름 가져와 출력하는 방법 알아보기](https://kotlinworld.com/581)

5\. [\[Spring\] @Bean의 name 프로퍼티 사용해 Bean의 이름 커스텀하게 설정하기](https://kotlinworld.com/580)

6\. [\[Spring\] @Bean 사용해 클래스 초기화 시 의존성 주입하기](https://kotlinworld.com/582)

7\. [\[Spring\] @Primary와 @Qualifier 사용해 하나의 인터페이스에 둘 이상의 구현체가 있을 때 의존성 주입 우선 순위 관리하기](https://kotlinworld.com/569)

8\. [\[Spring\] @Component와 @ComponentScan 사용해 자동으로 의존성 주입하기](https://kotlinworld.com/570)

9\. [\[Spring\] @Component와 @Bean의 차이는 무엇이고 언제 사용해야 할까?](https://kotlinworld.com/573)

10\. [\[Spring\]@ComponentScan 사용해 특정 패키지 하위의 의존성을 스캔하는 방법 알아보기](https://kotlinworld.com/571)

11\. [\[Spring\] @Lazy 사용해 의존성 주입 시 Bean 지연 초기화 설정하기](https://kotlinworld.com/574)

12\. [\[Spring\] @Autowired를 사용해 의존성 주입하기 : 생성자 주입, 필드 주입, 세터 주입](https://kotlinworld.com/572)

13\. [\[Spring\] @Scope 사용해 Bean을 싱글톤일지 필요할 때마다 새로 만들지 결정하기](https://kotlinworld.com/575)

14\. [\[Spring\] ObjectProvider 사용해 Bean 생성하고 언제 사용돼야 하는지 알아보기](https://kotlinworld.com/584)

15\. [\[Spring\] @PostContruct 사용해 Bean이 초기화된 이후에 특정 작업 하도록 만들기](https://kotlinworld.com/577)

16\. [\[Spring\] @PreDestroy 사용해 Bean이 파괴되기 직전에 할 작업 설정하기](https://kotlinworld.com/578)