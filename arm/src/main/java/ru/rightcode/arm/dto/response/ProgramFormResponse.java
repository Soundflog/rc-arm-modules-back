package ru.rightcode.arm.dto.response;

import java.io.Serializable;
import java.time.Instant;

public record ProgramFormResponse(
        Long id,
        FormResponse form,
        Long typeId,
        Instant finishedAt
) implements Serializable {
}
