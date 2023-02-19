package com.codestates.be.answer.entity;


import com.codestates.be.member.entity.Member;
import com.codestates.be.question.entity.Question;
import org.springframework.jmx.export.annotation.ManagedNotification;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long answerId;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "QUESTION_ID")
    private Question question;

    @Column(nullable = false)
    private long questionId;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Date createdAt;

    @Column
    private Date modifiedAt;
}
