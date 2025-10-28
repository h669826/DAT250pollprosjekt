package com.example.docpoll.admin.dto;

import java.time.Instant;

public record PollAdminView(
        String id,
        String question,
        Instant createdAt
        //TODO: add/change parameters
) {
}
