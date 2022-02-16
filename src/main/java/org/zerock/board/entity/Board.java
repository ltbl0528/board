package org.zerock.board.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "writer") //@ToString 은 항상 exclude
public class Board extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;

    private String title;

    private String content;

    //작성자 처리: 연관관계 지정
    @ManyToOne(fetch = FetchType.LAZY) // 명시적으로 지연 로딩(Lazy Loading) 지정
    private Member writer;
}
