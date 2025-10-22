package com.lektion_3_java_enterprise.Service;

import com.lektion_3_java_enterprise.model.Duck;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
@Service
public class DeafultDuckService implements DuckService {
    private final WebClient webClient;

    public DeafultDuckService(WebClient webClient) {
        this.webClient = webClient;
    }
    @Override
    public Mono<Duck> getRandomDuck() {
        return webClient.
                get().
                uri("").
                retrieve().
                bodyToMono(Duck.class);
    }
}
