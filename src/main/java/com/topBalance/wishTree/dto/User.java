package com.topBalance.wishTree.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor //필수생성자
@NoArgsConstructor // 기본생성자
@Getter //getter 줄임말로 사용
@Setter //setter 줄임말로 사용
@ToString //toString 줄임말로 사용


public class User {

    @Id //primary key 표기로 id는 맨 위에 작성
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment 숫자 자동 증가임을 설정
    private int userId;
    private String username;
    private String email;
    private String birthday;
    private String accountbalance;
    private String gender;
    private String hobbies;

}