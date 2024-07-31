package com.altun.gutim.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommentRequestDto {

    @NotNull(message = "Email must not be null")
    private String email;


    @NotNull(message = "Name must not be null")
    private String name;

    @NotNull(message = "Message must not be null")
    private String message;
}
