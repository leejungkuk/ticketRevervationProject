# 실시간 티켓 예매 시스템 (Real-Time Ticket Booking System)
# 🎫 실시간 티켓 예매 시스템 (Real-Time Ticket Booking System)

![Build Status](https://img.shields.io/badge/build-passing-brightgreen)
![Java Version](https://img.shields.io/badge/java-17-blue)
![Spring Boot](https://img.shields.io/badge/spring_boot-3.2.0-green)
![License](https://img.shields.io/badge/license-MIT-lightgrey)

## 📖 프로젝트 개요
실시간 공연/이벤트 티켓 예매 시스템으로, 사용자는 공연 정보를 확인하고, 좌석을 선택하여 예매할 수 있습니다.  
백엔드 중심으로 Spring Boot RESTful API로 구현되며, Redis, Kafka, Docker 등 다양한 기술을 적용해 대용량 트래픽에도 대응합니다.

## 🔑 주요 기능
- 공연 정보 조회
- 공연 일정 및 좌석 정보 관리
- 실시간 좌석 예매
- 예매 상태 관리 (PENDING, CONFIRMED, CANCELED)
- 사용자 권한(Role) 관리
- 대용량 트래픽 처리 및 동시성 관리

## 🛠️ 기술 스택
- **Backend:** Java 17, Spring Boot, Spring Security, JPA
- **Database:** MySQL
- **Cache / Messaging:** Redis, Kafka
- **Containerization:** Docker, Docker Compose
- **Testing / Load:** JMeter, Swagger

## 데이터베이스 설계
ERD : [Link](https://www.erdcloud.com/d/Wh8SZhQ6Q3KHrdmPj)

🔒 동시성 처리
•	비관적 락(Pessimistic Lock) 기반 좌석 예약 처리
•	Redis를 통한 캐싱 및 빠른 상태 확인
•	Kafka를 통한 이벤트 기반 처리