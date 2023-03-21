package com.nshellb.springstudyapp.frontend.webservice.pc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PcFrontMainController {
    // route url
    @GetMapping("/")
    public ModelAndView main() {
        return new ModelAndView("front/pc/main");
    }
}
