package com.example.demo1.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "Like")
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="like_id")
    private Long likeId;

    @ManyToOne(targetEntity = Member.class, fetch = FetchType.EAGER) //Many = Posting, One = Member, 한 계정에 여러 개 글 작성
    @JoinColumn(name = "member_id")
    private Member member; // FK

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Posting posting; //FK

    @Builder
    public Like(Long likeId, Member member, Posting posting) {
        this.likeId = likeId;
        this.member = member;
        this.posting = posting;
    }
}
