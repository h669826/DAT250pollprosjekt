package com.example.docpoll.repository;

import com.example.docpoll.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VoteReporistory extends JpaRepository<Vote, UUID> {
}
