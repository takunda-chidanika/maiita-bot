package zw.co.tjchidanika.maiitabot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MaiitaBotApplication {
    public static void main(String[] args) {
        SpringApplication.run(MaiitaBotApplication.class, args);
    }

}
