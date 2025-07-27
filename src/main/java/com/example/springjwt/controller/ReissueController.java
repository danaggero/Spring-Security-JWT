package com.example.springjwt.controller;

import com.example.springjwt.jwt.JWTUtil;
import com.example.springjwt.service.ReissueService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ReissueController {

    private final JWTUtil jwtUtil;
    private final ReissueService reissueService;

    public ReissueController(JWTUtil jwtUtil, ReissueService reissueService) {
        this.jwtUtil = jwtUtil;
        this.reissueService = reissueService;
    }

    @PostMapping("/reissue")
    public ResponseEntity<?> reissue(HttpServletRequest request, HttpServletResponse response) {
        return reissueService.reissue(request, response);
    }
}
