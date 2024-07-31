package ru.rightcode.anketi.dto;

import jakarta.annotation.Nullable;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ScaleDto {
    @Nullable
    private Long id;
    private String name;
    private String description;
}
