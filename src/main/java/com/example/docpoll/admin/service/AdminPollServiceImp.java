package com.example.docpoll.admin.service;

import com.example.docpoll.admin.dto.InsightView;
import com.example.docpoll.admin.dto.PollAdminView;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminPollServiceImp implements AdminPollService {
    @Override
    public PollAdminView createPoll() {
        //TODO
        return null;
    }

    @Override
    public PollAdminView getPoll() {
        //TODO
        return null;
    }

    @Override
    public List<PollAdminView> listPolls() {
        //TODO
        return List.of();
    }

    @Override
    public void closePoll(String pollId) {
        //TODO
    }

    @Override
    public InsightView getInsights(String pollId) {
        //TODO
        return null;
    }
}
