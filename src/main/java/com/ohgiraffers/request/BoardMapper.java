package com.ohgiraffers.request;


import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    List<BoardDTO> findAllPosts();
    void registNewPost(BoardDTO newBoardDTO);
}
