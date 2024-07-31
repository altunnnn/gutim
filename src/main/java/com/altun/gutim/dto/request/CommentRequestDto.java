package com.altun.gutim.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommentRequestDto {

    private String email;

    private String name;

    private String message;
}
