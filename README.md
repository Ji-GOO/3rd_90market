![90market](https://user-images.githubusercontent.com/48228245/80719018-d6b5fd00-8b35-11ea-9edc-627a5660cc03.png)

## 프로젝트 주제
판매자가 등록한 상품을 구매할 수 있도록 중개해주는 중고 거래 사이트
사용자가 물품을 사고 팔 수 있는 [번개장터](https://m.bunjang.co.kr/) 서비스 클론 제작

## 개발 인원
총 3명. (백엔드 2명, 프론트엔드 1명)

## 기술 스택
Back-end : Java 11, Spring 5, Tomcat 8.5, MySQL, MyBatis, JSP
Front-end : HTML, CSS, JavaScript, JQuery
개발 툴 : Eclipse

## 개발 기간
2020년 3월 30일 ~ 4월 17일 (3주)

## 설계
### 백로그
<img src="https://user-images.githubusercontent.com/63104048/87004437-5debb500-c1f8-11ea-9f4e-7d2b0900fd88.png" width="100%">

### JIRA 로드맵
<img src="https://user-images.githubusercontent.com/63104048/87004366-43194080-c1f8-11ea-9d32-e884d46df734.png" width="100%">

### 아키텍처
<img src="https://user-images.githubusercontent.com/63104048/87004116-e158d680-c1f7-11ea-828b-d5bd14510b34.png" width="100%">

### 데이터베이스
<img src="https://user-images.githubusercontent.com/63104048/87004659-c044b580-c1f8-11ea-9c65-6a20f7b3ef2e.png" width="65%">
<img src="https://user-images.githubusercontent.com/63104048/87004591-9db29c80-c1f8-11ea-97e0-a35bfab91560.png" width="65%">
  
## 기능
- 회원 기능
  - 회원가입, 회원 정보수정, 회원탈퇴
  - 이메일 인증, 패스워드 암호화
- 로그인 기능
  - 로그인아웃, 소셜 로그인
- 상품 기능
  - 상품 등록(이미지 포함), 상품 상세정보 표시
  - 상품 썸네일 표시

## 컨트롤러
- Auth Controller : 소셜 로그인(네이버) 관련 인증 및 DB 저장, 로그인한 이메일이 DB에 존재하는지 체크 기능
- Category Controller : 카테고리별로 페이지를 이동시켜주는 기능
- Home Controller : 메인 화면에서 이용할 수 있는 카테고리, 상품 관련 이동 기능
- Login Controller : 로그인, 로그아웃 등 인증 관련 기능
- Member Controller : 회원가입, 이메일 인증, 회원정보 수정, 회원 탈퇴 등 회원 관련 기능
- Product Controller : 상품 등록, 업로드한 상품 원본 이미지 및 썸네일 저장, 상품 수정, 상품 상세정보 등 상품 관련 기능
- RestApi Controller : 회원가입 시 이메일 란에 입력한 이메일 중복 여부 체크 기능
- Search Controller : 등록되어 있는 상품 상세정보의 제목으로 검색할 수 있는 기능
  
## 실행 화면
![RunProject](https://user-images.githubusercontent.com/48228245/80821377-8c0ab280-8c13-11ea-8224-a201b6046a42.png)
