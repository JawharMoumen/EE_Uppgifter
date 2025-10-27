package com.lektion_4_java_enterprise.Repository;

import com.lektion_4_java_enterprise.Domain.Message;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MessageRepository extends ReactiveCrudRepository<Message, Long> {
    // Spring genererar automatiskt alla CRUD-metoder:
    // save(), findById(), findAll(), delete(), etc.

}
