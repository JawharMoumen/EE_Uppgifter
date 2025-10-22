package com.lektion_3_java_enterprise.Controller;

import com.lektion_3_java_enterprise.Service.DuckService;
import com.lektion_3_java_enterprise.model.Duck;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/ducks")
public class DuckController {

    private final DuckService duckService;

    public DuckController(DuckService duckService) {
        this.duckService = duckService;
    }

    @GetMapping("/random")
    public Mono<ResponseEntity<Duck>> getRandomDuck() {
        return duckService.getRandomDuck().map(duck -> ResponseEntity.ok(duck));
    }
}
