package com.hacom.test.repository;

import com.hacom.test.model.TraceMsg;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TraceMsgRepository extends ReactiveMongoRepository<TraceMsg, String> {
}
