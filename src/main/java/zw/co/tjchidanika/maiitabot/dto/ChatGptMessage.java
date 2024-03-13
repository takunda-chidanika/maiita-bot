package zw.co.tjchidanika.maiitabot.dto;

import lombok.*;

/**************************************
 ** @project maiita-bot           
 ** @author Takunda Jimmy Chidanika    
 ** @created 2024/03/13                   
 **************************************
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ChatGptMessage {
    private String content;
    private String role;
}
