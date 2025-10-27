package com.lektion_4_java_enterprise.Service;

import com.lektion_4_java_enterprise.Domain.Message;
import com.lektion_4_java_enterprise.Repository.MessageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import java.time.LocalDateTime;

@Service
public class MessageService {

    private static final Logger logger = LoggerFactory.getLogger(MessageService.class);
    private final MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public Mono<Message> createMessage(Message incoming) {
        logger.info("Skapar nytt meddelande");

        Message entity = new Message(
                null,
                incoming.message(),
                LocalDateTime.now(),
                incoming.pinned() != null ? incoming.pinned() : Boolean.FALSE
        );

        return repository.save(entity)
                .doOnSuccess(saved -> logger.info("Meddelande sparat med id: {}", saved.id()))
                .doOnError(error -> logger.error("Fel vid sparande: {}", error.getMessage()));
    }
}