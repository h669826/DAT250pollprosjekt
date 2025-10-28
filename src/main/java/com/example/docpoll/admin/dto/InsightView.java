package com.example.docpoll.admin.dto;

import java.util.List;

//TODO: tuning/can maybe decide to extend for user-specific details/create a dto for it
public record InsightView(
        String pollId,
        String title,
        List<QuestionInsight> questions
) {
    public record QuestionInsight(
            String questionId,
            String caption,
            List<OptionCount> options
    ){}
    public record OptionCount(
            String optionId,
            String label,
            int count
    ){}
}
