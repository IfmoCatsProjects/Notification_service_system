package ru.ifmo.userapi.responses;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonView implements Serializable {
  private String username;

  private String email;

  private Long telegramChatId;

  private Integer vkId;
}
