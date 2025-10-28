package com.example.docpoll.admin.api;

import com.example.docpoll.admin.dto.InsightView;
import com.example.docpoll.admin.dto.PollAdminView;
import com.example.docpoll.admin.service.AdminPollService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/admin/polls")
@RequiredArgsConstructor
public class AdminPollController {
    private final AdminPollService adminPollService;

    //Put in example for how keycloak is implemented on methods, maybe wait til later in project to touch?

    @PostMapping
    // KEYCLOAK @PreAuthorize("hasRole('ADMIN')")
    public PollAdminView createPoll(){
        //TODO
        return adminPollService.createPoll();
    }

    @GetMapping("/{pollId}/insights")
    // KEYCLOAK @PreAuthorize("hasRole('ADMIN')")
    public InsightView getInsights(@PathVariable UUID pollId) {
        return adminPollService.getInsights(pollId);
    }

    @PostMapping("/{pollId}/close")
    // KEYCLOAK @PreAuthorize("hasRole('ADMIN')")
    public void closePoll(@PathVariable("pollId") UUID pollId){
        adminPollService.closePoll(pollId);
    }
}
