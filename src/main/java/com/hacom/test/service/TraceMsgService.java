package com.hacom.test.service;

import com.hacom.test.model.TraceMsg;
import com.hacom.test.repository.TraceMsgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TraceMsgService {

    @Autowired
    private TraceMsgRepository traceMsgRepository;

    public Mono<TraceMsg> save(TraceMsg traceMsg){
        return this.traceMsgRepository.save(traceMsg);
    }

    public Flux<TraceMsg> findAll() {
        return this.traceMsgRepository.findAll();
    }

}
