package com.dosol.boardcore.service;

import com.dosol.boardcore.dto.BoardDTO;

import java.util.List;

public interface BoardService {
    List<BoardDTO> getAll();
    void register(BoardDTO boardDTO);
    BoardDTO getOne(int bno);
    void modify(BoardDTO boardDTO);

}
