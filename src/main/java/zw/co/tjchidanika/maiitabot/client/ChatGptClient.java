package zw.co.tjchidanika.maiitabot.client;

/**************************************
 ** @project maiita-bot
 ** @author Takunda Jimmy Chidanika
 ** @created 2024/03/13
 **************************************
 */


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;
import zw.co.tjchidanika.maiitabot.dto.ChatGptDto;
import zw.co.tjchidanika.maiitabot.dto.ChatGptResponse;

@FeignClient(name = "chat-gpt-client", url = "https://api.openai.com/v1")
public interface ChatGptClient {

    @PostMapping("/chat/completions")
    @ResponseBody
    ChatGptResponse getChatGptResponse(@RequestBody ChatGptDto request, @RequestHeader("Authorization") String authorization);
}
