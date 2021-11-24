package com.hacom.test.controller;

import com.hacom.test.model.TraceMsg;
import com.hacom.test.service.TraceMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class TraceMsgController {

    private static final Logger logger = LogManager.getLogger(TraceMsgController.class);

    @Autowired
    private TraceMsgService traceMsgService;

    @PostMapping("/tracemsg")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<TraceMsg> save(@RequestBody TraceMsg traceMsg){
        logger.info("Insertando...");
        logger.info(traceMsg.getTs());
        return this.traceMsgService.save(traceMsg);
    }

    @GetMapping("/tracemsg")
    private Flux<TraceMsg> findAll() {
        logger.info("Consultando...");
        return this.traceMsgService.findAll();
    }

}
