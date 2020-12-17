package me.weekbelt.springbootcommunityweb.web.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BoardType {
    NOTICE("공지사항"),
    FREE("자유게시판");

    private final String value;
}
