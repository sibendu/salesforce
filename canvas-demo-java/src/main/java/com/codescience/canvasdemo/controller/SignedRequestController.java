package com.codescience.canvasdemo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import canvas.SignedRequest;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/signedrequest")
@Slf4j
public class SignedRequestController {
    @PostMapping
    public String processSignedRequest(@RequestParam("signed_request") String signedRequest, Model model) {
    	System.out.println("Here in POST");
        log.debug("Processing Signed Request");
        log.debug(signedRequest);
        String consumerSecret = System.getenv("SIGNED_REQUEST_CONSUMER_SECRET");
        String signedRequestJson = SignedRequest.verifyAndDecodeAsJson(signedRequest, consumerSecret);
        log.debug("Verified Signed Request");
        System.out.println("Verified Signed Request:: "+signedRequestJson);
        log.debug(signedRequestJson);
        model.addAttribute("signedRequest", signedRequestJson);
        model.addAttribute("fullName", "Sibendu");
        return "index";
    }
    
    @GetMapping
    public String hello(Model model) {// HttpServletRequest request, HttpServletResponse response
    	System.out.println("Here in GET");
    	model.addAttribute("fullName", "Sibendu");
        return "index";
    }
}
