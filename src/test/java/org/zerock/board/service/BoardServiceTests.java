package org.zerock.board.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.board.dto.BoardDTO;
import org.zerock.board.dto.PageRequestDTO;
import org.zerock.board.dto.PageResultDTO;

@SpringBootTest
public class BoardServiceTests {

    @Autowired
    private BoardService boardService;

//    @Test
//    public void testRegister() {
//        BoardDTO dto = BoardDTO.builder()
//                .title("Test.")
//                .content("Test...")
//                .writerEmail("user55@aaa.com") // 현재 db에 존재하는 이메일
//                .build();
//
//        Long bno = boardService.register(dto);
//    }

    //목록 처리 테스트
//    @Test
//    public void testList() {
//        PageRequestDTO pageRequestDTO = new PageRequestDTO();
//
//        PageResultDTO<BoardDTO, Object[]> result = boardService.getList(pageRequestDTO);
//
//        for(BoardDTO boardDTO : result.getDtoList()) {
//            System.out.println(boardDTO);
//        }
//    }
    //게시물 조회 테스트
//    @Test
//    public void testGet() {
//        Long bno = 100L;
//
//        BoardDTO boardDTO = boardService.get(bno);
//
//        System.out.println(boardDTO);
//    }
    //게시물 삭제 테스트
//    @Test
//    public void testDelete() {
//        Long bno = 1L;
//
//        boardService.removeWithReplies(bno);
//    }

    //게시글 수정 테스트
    @Test
    public void testModify() {
        BoardDTO boardDTO = BoardDTO.builder()
                .bno(2L)
                .title("제목 변경")
                .content("내용 변경")
                .build();

        boardService.modify(boardDTO);
    }
}
