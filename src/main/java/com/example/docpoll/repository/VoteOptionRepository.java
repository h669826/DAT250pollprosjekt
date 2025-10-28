package com.example.docpoll.repository;

import com.example.docpoll.domain.VoteOption;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VoteOptionRepository extends JpaRepository<VoteOption, UUID> {
}
