package org.zerock.controller;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.zerock.mapper.TimeMapper;

@Controller
@Log4j
public class SampleController {

    @Setter(onMethod = @__(@Autowired))
    private TimeMapper mapper;

    @GetMapping("/hello")
    public void hello(){

        log.info("/hello............called");

        String now = mapper.getTime();

        log.info("NOW: " +now);

    }

}
