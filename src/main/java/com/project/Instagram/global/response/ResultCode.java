package com.project.Instagram.global.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCode {

    //멤버
    UPDATE_PASSWORD_SUCCESS(200,"비밀번호 변경이 완료되었습니다."),
    SIGNUP_SUCCESS(200, "회원가입에 성공하였습니다."),
    DELETE_SUCCESS(200,"회원 탈퇴 완료되었습니다."),
    RESET_PASSWORD_SUCCESS(200, "비밀번호 리셋 완료되었습니다."),
    UPDATE_ACCOUNT_SUCCESS(200,"계정 정보 변경이 완료되었습니다."),
    SEND_EMAIL_SUCCESS(200,  "인증코드 이메일을 전송하였습니다."),
    EMAIL_VERIFICATION_FAIL(400, "이메일 인증에 실패했습니다."),
    LOOK_UP_MEMBER_LIST_SUCCESS(200, "계정 목록 조회가 완료되었습니다."),
    LOGOUT_SUCCESS(200, "로그아웃에 성공하였습니다."),
  
    //게시글
    GET_POST_PAGE_SUCCESS(200,"게시물 목록 조회가 완료되었습니다."),
    GET_POST_SUCCESS(200,"게시물 상세 조회가 완료되었습니다."),
    GET_POST_USER_PAGE_SUCCESS(200,"해당 유저 게시물 목록 조회가 완료되었습니다."),
    POST_CREATE_SUCCESS(200, "게시글 생성에 성공하였습니다."),
    DELETE_POST_SUCCESS(200, "게시물 삭제에 성공하였습니다."),
    UPDATE_POST_SUCCESS(200, "게시물 수정이 완료되었습니다."),
  
    // 팔로우
    FOLLOW_FAIL(400, "팔로우에 실패했습니다."),
    FOLLOW_SUCCESS(200, "팔로우에 성공했습니다."),
    UNFOLLOW_SUCCESS(200, "언팔로우에 성공했습니다."),
    FOLLOWINGS_LIST_SUCCESS(200, "팔로잉 목록 조회가 성공했습니다."),
    FOLLOWERS_LIST_SUCCESS(200, "팔로워 목록 조회가 성공했습니다.");

    private final int status;

    private final String message;
}
