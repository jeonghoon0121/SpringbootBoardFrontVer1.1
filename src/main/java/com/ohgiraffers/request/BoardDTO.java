package com.ohgiraffers.request;

public class BoardDTO {
    private int boardCode;
    private String boardID;
    private String boardPW;
    private String boardTitle;
    private String boardContent;

    public BoardDTO(){};

    public BoardDTO(int boardCode, String boardID, String boardPW, String boardTitle, String boardContent) {
        this.boardCode = boardCode;
        this.boardID = boardID;
        this.boardPW = boardPW;
        this.boardTitle = boardTitle;
        this.boardContent = boardContent;
    }

    public int getBoardCode() {
        return boardCode;
    }

    public void setBoardCode(int boardCode) {
        this.boardCode = boardCode;
    }

    public String getBoardID() {
        return boardID;
    }

    public void setBoardID(String boardID) {
        this.boardID = boardID;
    }

    public String getBoardPW() {
        return boardPW;
    }

    public void setBoardPW(String boardPW) {
        this.boardPW = boardPW;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardContent() {
        return boardContent;
    }

    public void setBoardContent(String boardContent) {
        this.boardContent = boardContent;
    }

    @Override
    public String toString() {
        return "BoardDTO{" +
                "boardCode=" + boardCode +
                ", boardID='" + boardID + '\'' +
                ", boardPW='" + boardPW + '\'' +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardContent='" + boardContent + '\'' +
                '}';
    }
}
