package org.example.app.data;

import lombok.*;

@NoArgsConstructor
@Getter
@AllArgsConstructor
@Builder
@ToString
public class ItemDto {
    private long id;
    private String name;
    private long price;
}
