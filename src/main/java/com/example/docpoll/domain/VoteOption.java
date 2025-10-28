package com.example.docpoll.domain;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "vote_options")
public class VoteOption {
    @Id
    @GeneratedValue
    private UUID voteOptionId;
    private String caption;
    @ManyToOne
    private Poll poll;
    //Removeable
    private int voteCount;

    public VoteOption() {}

    public VoteOption(String caption, Poll poll, int voteCount) {
        this.caption = caption;
        this.poll = poll;
        this.voteCount = 0;
    }


    //GETTERS/SETTERS
    //-----------------------------------------------//
    public UUID getVoteOptionId() {
        return voteOptionId;
    }
    public void setVoteOptionId(UUID voteOptionId) {
        this.voteOptionId = voteOptionId;
    }
    public String getCaption() {
        return caption;
    }
    public void setCaption(String caption) {
        this.caption = caption;
    }
    public Poll getPoll() {
        return poll;
    }
    public void setPoll(Poll poll) {
        this.poll = poll;
    }
    //VOTECOUNT IF WANT DELETE FROM HERE
    public int getVoteCount() {
        return voteCount;
    }
    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }
    public void incrementVoteCount() {
        this.voteCount++;
    }
    //-------------------------------------------------//
}
