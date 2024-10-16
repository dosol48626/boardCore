package com.dosol.boardcore.service;

import com.dosol.boardcore.dto.BoardDTO;
import com.dosol.boardcore.mapper.BoardMapper;
import com.dosol.boardcore.vo.BoardVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final ModelMapper modelMapper;
    private final BoardMapper boardMapper;

    @Override
    public List<BoardDTO> getAll() {
        log.info("getAll");
        List<BoardDTO> dtoList = boardMapper.getList().stream()
                .map(vo->modelMapper.map(vo, BoardDTO.class))
                .collect(Collectors.toUnmodifiableList());
        return dtoList;
    }

    @Override
    public void register(BoardDTO boardDTO) {
        log.info("register");
        BoardVO boardVO = modelMapper.map(boardDTO, BoardVO.class);
        boardMapper.insert(boardVO);
    }

    @Override
    public BoardDTO getOne(int bno) {
        BoardVO boardVO = boardMapper.selectOne(bno);
        BoardDTO boardDTO = modelMapper.map(boardVO, BoardDTO.class);
        return boardDTO;
    }

    @Override
    public void modify(BoardDTO boardDTO) {
        BoardVO boardVO = modelMapper.map(boardDTO, BoardVO.class);
        boardMapper.update(boardVO);
    }


}
