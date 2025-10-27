package com.lektion_4_java_enterprise.Domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;


@Table("messages")
public record Message(
        @Id Long id,

        @NotBlank(message = "Meddelandet får inte vara tomt")
        @Size(max = 255, message = "Meddelandet får max vara 255 tecken")
        String message,

        @Column("created_at")
        LocalDateTime createdAt,

        Boolean pinned

) {
}

