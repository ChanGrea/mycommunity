# Spring Boot + JPA BoilerPlate (작성 중)

## 목표

1. Spring Boot의 Web 서비스용 보일러 플레이트를 완성

2. 기본적인 CRUD 기능 제공과 공통 개발 부분(Controller, Request/Response, Entity 등) 추상화

3. 이후 개발 템플릿으로 이용 시 용이하도록 Logging, Security, Filter, AOP 등 공통 기능 분리

## 기술 스택

- Gradle 5.6.4
- Spring Boot 2.1.7 RELEASE
- JPA
- MySQL (:arrow_right: Postgresql로 전환 예정)
- Handlebars (UI :arrow_right: Component화 필요)
- Spring Security (적용 예정)

## 폴더 구조 (2020.07.20 기준)

### Root Project

```$xslt
.
├── README.md
├── build
├── build.gradle
├── gradle
├── gradlew
├── gradlew.bat
└── src
    ├── main
    │   ├── java
    │   └── resources
    └── test
        └── java
```

### Source (`src-main-java`)

```$xslt
.
└── com
    └── chanyoung
        └── mycommunity
            ├── Application.java
            ├── domain
            │   ├── BaseTimeEntity.java
            │   ├── posts
            │   └── user
            ├── dto
            │   ├── posts
            │   └── user
            ├── service
            │   ├── PostsService.java
            │   └── RegistService.java
            └── web
                ├── WebController.java
                └── WebRestController.java
```

- DDD(Domain Driven Design) 방식으로 설계되었음
  - domain 폴더 안에 도메인 별로 나눠져 있고, **Entity**와 **Repository**가 함께 있다.
  - dto 폴더에 request/response 용 **DTO**를 따로 분리
  - 그 외 service 폴더와 web 폴더에 **Service**와 **Controller**를 분리
  
> :exclamation: web 폴더에 webRestcontroller 하나에 모든 api를 만들었지만, 도메인 별로 네이밍하여 분리 필요해 보임
