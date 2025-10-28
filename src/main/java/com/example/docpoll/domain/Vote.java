package com.example.docpoll.domain;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "votes")
public class Vote {

    @Id
    @GeneratedValue
    private UUID voteId;

    @ManyToOne
    private VoteOption chosenOption;

    @ManyToOne
    private User user;

    public Vote(){}
    public Vote(VoteOption chosenOption, User user) {
        this.chosenOption = chosenOption;
        this.user = user;
    }


    //GETTERS/SETTERS
    //-------------------------------//
    public UUID getVoteId() {
        return voteId;
    }
    public void setVoteId(UUID voteId) {
        this.voteId = voteId;
    }
    public VoteOption getChosenOption() {
        return chosenOption;
    }
    public void setChosenOption(VoteOption chosenOption) {
        this.chosenOption = chosenOption;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    //------------------------------//
}
