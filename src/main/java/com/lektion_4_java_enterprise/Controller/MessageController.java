package com.lektion_4_java_enterprise.Controller;

import com.lektion_4_java_enterprise.Domain.Message;
import com.lektion_4_java_enterprise.Service.MessageService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }

    @PostMapping
    public Mono<ResponseEntity<Message>> createMessage(@Valid @RequestBody Message message) {
        return service.createMessage(message)
                .map(saved -> ResponseEntity.status(HttpStatus.CREATED).body(saved));
    }
}