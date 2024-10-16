package com.dosol.boardcore.controller;

import com.dosol.boardcore.dto.BoardDTO;
import com.dosol.boardcore.service.BoardService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/list")
    public void list(Model model) {
        log.info("list");
        List<BoardDTO> boardList = boardService.getAll();
        model.addAttribute("boardList", boardList);
    }

    @GetMapping("/register")
    public void registerGet() {
        log.info("registerGet");
    }

    @PostMapping("/register")
    public String register(BoardDTO boardDTO, RedirectAttributes redirectAttributes) {
        boardService.register(boardDTO);
        return "redirect:/board/list";
    }

    @GetMapping({"/read", "/modify"})
    public void read(@RequestParam("bno") int bno, Model model) {
        BoardDTO boardDTO = boardService.getOne(bno);
        model.addAttribute("boardDTO", boardDTO);
    }
    
    @PostMapping("/modify")
    public String modify(BoardDTO boardDTO, RedirectAttributes redirectAttributes) {
        boardService.modify(boardDTO);
        return "redirect:/board/read";
    }

}
