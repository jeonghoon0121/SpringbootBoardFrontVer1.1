package com.ohgiraffers.request;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BoardService {
    private final BoardMapper boardMapper;

    public BoardService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

//    @Transactional
//    public void registNewPost(BoardDTO boardDTO) {
//        boardMapper.registNewPost(boardDTO);
//    }

    public List<BoardDTO> findAllPosts() {
//        System.out.println(boardMapper.findAllPosts());
        return boardMapper.findAllPosts();

    }
    @Transactional
    public void registNewPost(BoardDTO newBoardDTO) {
        System.out.println("registNewPost 서비스1");
        boardMapper.registNewPost(newBoardDTO);
        System.out.println("registNewPost 서비스2");
    }

}
