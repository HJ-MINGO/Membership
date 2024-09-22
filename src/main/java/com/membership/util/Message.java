package com.membership.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * packageName    : com.membership.entity
 * fileName       : Message
 * author         : NAHAEJUN
 * date           : 2024-09-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-22        NAHAEJUN              최초생성
 */
@AllArgsConstructor
@Getter
public enum Message {

    INFO_MSG_001("INFO","회원가입이 완료되었습니다."),
    INFO_MSG_002("INFO","회원정보 수정이 완료되었습니다."),
    INFO_MSG_003("INFO","회원 삭제가 완료되었습니다."),
    ERROR_MSG_001("ERROR","회원가입이 실패하였습니다."),
    ERROR_MSG_002("ERROR","회원정보 수정이 실패하였습니다."),
    ERROR_MSG_003("ERROR","회원 삭제가 완료되었습니다.");

    private final String type;
    private final String msg;
}
