package zw.co.tjchidanika.maiitabot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import zw.co.tjchidanika.maiitabot.client.ChatGptClient;
import zw.co.tjchidanika.maiitabot.dto.ChatGptDto;
import zw.co.tjchidanika.maiitabot.dto.ChatGptMessage;
import zw.co.tjchidanika.maiitabot.dto.ChatGptResponse;
import zw.co.tjchidanika.maiitabot.exception.FeignClientExceptionHandler;

import static java.util.Objects.nonNull;

/**************************************
 ** @project maiita-bot
 ** @author Takunda Jimmy Chidanika
 ** @created 2024/03/13
 **************************************
 */
@Component
@RequiredArgsConstructor
public class ChatGptService {

    private final ChatGptClient chatGptClient;

    @Value("${chat.gpt.api-key}")
    private String apiKey;


    public ChatGptDto chat(ChatGptDto request) {
        request.setModel("gpt-3.5-turbo");
        String systemMessage = "Hello, I am Maiita, your personal assistant. How can I help you today?";
        ChatGptMessage message = ChatGptMessage.builder()
                .content(systemMessage)
                .role("system")
                .build();
        request.getMessages().addFirst(message);

        try {
            ChatGptResponse response = chatGptClient.getChatGptResponse(request, String.format("Bearer " + apiKey));
            request.setModel("gpt-3.5-turbo");
            if (nonNull(response) && response.getChoices().isEmpty()) {
                ChatGptMessage chatGptMessage = response.getChoices().getFirst().getMessage();

                request.getMessages().add(chatGptMessage);
            }
        }

        catch (Exception e) {
            throw new FeignClientExceptionHandler(e.getMessage());
        }

        return request;
    }
}
