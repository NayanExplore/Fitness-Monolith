package com.project.fitness.controller;

import com.project.fitness.dto.ActivityRequest;
import com.project.fitness.dto.ActivityResponse;
import com.project.fitness.service.ActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/activities")
@RequiredArgsConstructor
public class ActivityController {

    private final ActivityService activityService;

    @PostMapping
    public ResponseEntity<ActivityResponse> trackActivity(
            @RequestBody ActivityRequest request,
            Authentication authentication
    ) {
        // The authenticated user's id always wins over anything in the request body,
        // so one user can't write activity data as another user.
        request.setUserId(authentication.getName());
        return ResponseEntity.ok(activityService.trackActivity(request));
    }


    @GetMapping
    public ResponseEntity<List<ActivityResponse>> getUserActivities(Authentication authentication) {
        // Derived from the JWT, not a client-supplied header, so users can only read their own activities.
        return ResponseEntity.ok(activityService.getUserActivities(authentication.getName()));
    }
}
