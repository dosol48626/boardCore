package com.dosol.boardcore.mapper;

import com.dosol.boardcore.vo.BoardVO;

import java.util.List;

public interface BoardMapper {
    List<BoardVO> getList();
    void insert(BoardVO boardVO);
    BoardVO selectOne(int bno);
    void update(BoardVO boardVO);
}
