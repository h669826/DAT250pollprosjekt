package com.example.docpoll.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "polls")
public class Poll {
    @Id
    @GeneratedValue
    private UUID pollId;
    private String question;
    @OneToMany(cascade = CascadeType.ALL)
    private List<VoteOption> voteOptionList;
    @ManyToOne
    private User creator;

    public Poll(){}
    public Poll(String question, User creator){
        this.question = question;
        this.creator = creator;
        this.voteOptionList = new ArrayList<>();
    }


    //GETTERS/SETTERS
    //----------------------------------------------------------//
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public List<VoteOption> getVoteOptionList() {
        return voteOptionList;
    }
    public void setVoteOptionList(List<VoteOption> voteOptionList) {
        this.voteOptionList = voteOptionList;
    }
    public User getCreator() {
        return creator;
    }
    public void setCreator(User creator) {
        this.creator = creator;
    }
    public UUID getPollId() {
        return pollId;
    }
    public void setPollId(UUID pollId) {
        this.pollId = pollId;
    }
    //--------------------------------------------------//
}
