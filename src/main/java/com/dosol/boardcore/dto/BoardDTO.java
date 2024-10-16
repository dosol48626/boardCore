package com.dosol.boardcore.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public class BoardDTO {
    private int bno;
    private String title;
    private String content;
    private String writer;
    private Date postDate;
    private int visitcount;
}
