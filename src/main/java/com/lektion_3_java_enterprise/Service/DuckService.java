package com.lektion_3_java_enterprise.Service;

import com.lektion_3_java_enterprise.model.Duck;
import reactor.core.publisher.Mono;

public interface DuckService {
    Mono<Duck> getRandomDuck();
}
