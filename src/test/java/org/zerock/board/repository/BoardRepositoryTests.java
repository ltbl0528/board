package org.zerock.board.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.board.entity.Board;
import org.zerock.board.entity.Member;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class BoardRepositoryTests {

    @Autowired
    private BoardRepository boardRepository;

//    @Test
//    public void insertBoard() {
//        IntStream.rangeClosed(1, 100).forEach( i -> {
//            Member member = Member.builder().email("user" + i + "@aaa.com").build();
//
//            Board board = Board.builder()
//                    .title("Title...." + i)
//                    .content("Content...." +i)
//                    .writer(member)
//                    .build();
//
//            boardRepository.save(board);
//        });
//    }

    @Transactional
    @Test
    public void testRead1() {

        //DB에 존재하는 번호로 board 찾기
        Optional<Board> result = boardRepository.findById(100L);

        Board board = result.get();

        System.out.println(board);
        System.out.println(board.getWriter());
    }
}