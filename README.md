김영한님의 [스프링 MVC 1편 - 백엔드 웹 개발 핵심 기술](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-mvc-1/dashboard) 실습 코드 아카이브

---

### 💻 Development Environment

* Java 21
* Spring Boot 4.0.1
* Gradle
* IDE: IntelliJ

### 🏆 실습 목표

* 웹 서버, 서블릿, JSP, MVC 패턴의 역사와 원리를 이해하고 직접 구현하며 발전 과정 습득
* 스프링 MVC의 내부 구조(Front Controller 패턴)를 직접 만들어보며 프레임워크의 동작 원리 파악
* 스프링 MVC가 제공하는 핵심 기능, 요청 매핑, HTTP 메시지 컨버터, 타임리프 연동 방법 숙달

### 📝 Curriculum

1. [**웹 애플리케이션 이해**](https://mxxikr.github.io/posts/spring-mvc-web-application/)
   - 웹 서버와 WAS의 차이, 서블릿 컨테이너의 역할
   - 동시 요청 처리와 멀티 쓰레드, HTML/HTTP API/CSR/SSR 개념 정립
   - 자바 백엔드 웹 기술의 변천사


2. [**서블릿**](https://mxxikr.github.io/posts/spring-mvc-servlet/)
  - 프로젝트 생성 및 서블릿 환경 설정
  - HttpServletRequest/Response 객체의 이해와 기본 사용법
  - HTTP 요청 데이터(GET, POST, API JSON) 파싱 및 응답 처리 실습


3. [**서블릿, JSP, MVC 패턴**](https://mxxikr.github.io/posts/spring-mvc-servlet-jsp-mvc/)
  - 순수 서블릿과 JSP로 회원 관리 웹 애플리케이션 구현
  - MVC 패턴의 등장 배경과 적용, 그리고 한계점 분석 (Model 1 vs Model 2)


4. [**MVC 프레임워크 만들기**](https://mxxikr.github.io/posts/spring-mvc-framework/)
   - 프론트 컨트롤러(Front Controller) 패턴 도입 (v1)
   - View 분리, Model 추가, 유연한 컨트롤러 구현 등 점진적 리팩토링 (v2~v5)
   - 스프링 MVC 구조와 유사한 나만의 MVC 프레임워크 직접 설계 및 구현


5. [**스프링 MVC - 구조 이해**](https://mxxikr.github.io/posts/spring-mvc-structure/)
   - 직접 만든 프레임워크와 스프링 MVC의 구조 비교
   - DispatcherServlet, 핸들러 매핑, 핸들러 어댑터, 뷰 리졸버의 동작 순서 이해
   - 스프링 MVC 시작 및 컨트롤러 통합 실습


6. [**스프링 MVC - 기본 기능**](https://mxxikr.github.io/posts/spring-mvc-basic-features/)
   - 로깅 라이브러리(SLF4J, Logback) 활용
   - 요청 매핑(@RequestMapping), HTTP 요청 파라미터(@RequestParam, @ModelAttribute)
   - HTTP 메시지 컨버터와 JSON 데이터 처리


7. [**스프링 MVC - 웹 페이지 만들기**](https://mxxikr.github.io/posts/spring-mvc-web-page-guide/)
   - 상품 관리 서비스 요구사항 분석 및 도메인 개발
   - 타임리프(Thymeleaf)를 활용한 SSR 구현
   - 상품 등록, 조회, 수정 기능 개발 및 PRG(Post/Redirect/Get) 패턴 적용
