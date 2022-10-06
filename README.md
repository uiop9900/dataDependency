# Description
- 목적: data를 계층 간 이동할때 mapper, dto를 사용하는데 그 사용법을 이해하고 손에 익히고자 작게 프로젝트를 생성
- 계층: Controller - Service - Repository
- 설명: user:lecture=1:n으로 이루어져 있는 형태, 간단하게 insert/select 만 구현 예정
- 추후 계획: jooq 혹은 queryDsl을 활용해서 db단을 연동하고 postman으로 값을 넣어보는 것까지 구현 예정

# mapper와 dto
### dto(Data Transfer Object):  *계층간 데이터 전송을 위해 도메인 모델 대신 사용되는 계층
- dto는 @Getter, @Setter만 가져야 하며 어떠한 로직도 가져서는 안된다.
### mapper: dto -> Entity로 변환해주는 과정


<img width="792" alt="스크린샷 2022-10-06 오전 9 57 22" src="https://user-images.githubusercontent.com/96981475/194190037-8b87a09c-3fc8-4219-b422-9df59f4e4553.png">
