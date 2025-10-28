package com.example.docpoll.patient.service;

import com.example.docpoll.domain.Vote;

public interface PatientPollService {
    boolean castVote(Vote vote);
}
