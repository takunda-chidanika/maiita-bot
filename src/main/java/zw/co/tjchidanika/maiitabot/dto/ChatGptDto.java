package zw.co.tjchidanika.maiitabot.dto;

import lombok.Data;

import java.util.List;

/**************************************
 ** @project maiita-bot           
 ** @author Takunda Jimmy Chidanika    
 ** @created 2024/03/13                   
 **************************************
 */
@Data
public class ChatGptDto {
    private String model;
    private List<ChatGptMessage> messages;
}
