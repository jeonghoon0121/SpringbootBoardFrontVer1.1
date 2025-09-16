package com.ohgiraffers.request;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/board/*")
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService){
        this.boardService =boardService;
    }

    @GetMapping("/list")
    public String findPostList(Model model){

        List<BoardDTO> boardDTOList = boardService.findAllPosts();
        for(BoardDTO boards : boardDTOList){
            System.out.println("boards = " + boards);
        }
        model.addAttribute("boardDTOList",boardDTOList);
        return "board/list";
    }
    @GetMapping("/write")
    public void registPost() {}
    @PostMapping("/write")
    public String registPost(BoardDTO newBoardDTO, RedirectAttributes rttr) {
        boardService.registNewPost(newBoardDTO);
        rttr.addFlashAttribute("successMessage", "글등록에 성공하셨습니다.");
        return "redirect:/board/list";
    }
//    @GetMapping("/update")
//    public void updatePost() {}
    @GetMapping("/update")
    public String updateForm(Model model) {
        model.addAttribute("board", new BoardDTO()); // 빈 객체 전달
        return "board/update";
    }


    @PostMapping("/update")
    public String updatePost(BoardDTO newBoardDTO, RedirectAttributes rttr) {
        boardService.registNewPost(newBoardDTO);
        rttr.addFlashAttribute("successMessage", "글등록에 성공하셨습니다.");
        return "redirect:/board/list";
    }
    @GetMapping("/delete")
    public void deletePost() {}
    @PostMapping("/delete")
    public String deletePost(BoardDTO newBoardDTO, RedirectAttributes rttr) {
        boardService.registNewPost(newBoardDTO);
        rttr.addFlashAttribute("successMessage", "글등록에 성공하셨습니다.");
        return "redirect:/board/list";
    }
}
