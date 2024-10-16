package com.dosol.boardcore.vo;

import lombok.*;

import java.util.Date;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardVO {
    private int bno;
    private String title;
    private String content;
    private String writer;
    private Date postDate;
    private int visitcount;
}
