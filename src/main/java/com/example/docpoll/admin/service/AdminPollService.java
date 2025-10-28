package com.example.docpoll.admin.service;

import com.example.docpoll.admin.dto.InsightView;
import com.example.docpoll.admin.dto.PollAdminView;

import java.util.List;
//TODO: probably add a few as per necessity
public interface AdminPollService {
    PollAdminView createPoll();//TODO
    PollAdminView getPoll();//TODO
    List<PollAdminView> listPolls();//TODO
    void closePoll(String pollId);//TODO
    InsightView getInsights(String pollId);//TODO
}
