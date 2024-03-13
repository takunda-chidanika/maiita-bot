package zw.co.tjchidanika.maiitabot.exception;

/**************************************
 ** @project maiita-bot           
 ** @author Takunda Jimmy Chidanika    
 ** @created 2024/03/13                   
 **************************************
 */
public class FeignClientExceptionHandler extends RuntimeException {
    public FeignClientExceptionHandler(String message) {
        super(message);
    }
}
