package zw.co.tjchidanika.maiitabot.dto;

import lombok.Data;

/**************************************
 ** @project maiita-bot           
 ** @author Takunda Jimmy Chidanika    
 ** @created 2024/03/13                   
 **************************************
 */
@Data
public class ChatGptChoice {
    private ChatGptMessage message;
    private String logprobs;
    private String finish_reason;
    private String index;
}
