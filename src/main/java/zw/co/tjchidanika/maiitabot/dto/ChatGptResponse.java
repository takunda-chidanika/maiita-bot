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
public class ChatGptResponse {

    private String id;
    private String object;
    private Long created;
    private String model;
    private ChatGptUsage usage;
    private List<ChatGptChoice> choices;
}
