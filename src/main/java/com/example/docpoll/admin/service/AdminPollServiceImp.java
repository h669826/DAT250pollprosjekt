package com.example.docpoll.admin.service;

import com.example.docpoll.admin.dto.InsightView;
import com.example.docpoll.admin.dto.PollAdminView;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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
    public void closePoll(UUID pollId) {
        //TODO
    }

    @Override
    public InsightView getInsights(UUID pollId) {
        //TODO
        return null;
    }
}
