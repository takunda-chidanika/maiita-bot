package zw.co.tjchidanika.maiitabot.controller;

import org.springframework.web.bind.annotation.*;
import zw.co.tjchidanika.maiitabot.dto.ChatGptDto;
import zw.co.tjchidanika.maiitabot.service.ChatGptService;

/**************************************
 ** @project maiita-bot
 ** @author Takunda Jimmy Chidanika
 ** @created 2024/03/13
 **************************************
 */
@RestController
@RequestMapping("/chat-gpt")
public record ChatGptController(
        ChatGptService chatGptService
) {
    @PostMapping("/get-response")
    @ResponseBody
    public ChatGptDto getChatGptResponse(@RequestBody ChatGptDto request) {
        return chatGptService.chat(request);
    }
}
