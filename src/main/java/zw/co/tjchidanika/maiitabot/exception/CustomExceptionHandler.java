package zw.co.tjchidanika.maiitabot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**************************************
 ** @project maiita-bot           
 ** @author Takunda Jimmy Chidanika    
 ** @created 2024/03/13                   
 **************************************
 */
@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(FeignClientExceptionHandler.class)
    public ProblemDetail handleFeignClientException(FeignClientExceptionHandler exception) {
        return ProblemDetail.forStatusAndDetail(HttpStatus.TOO_MANY_REQUESTS, exception.getMessage());
    }
}
