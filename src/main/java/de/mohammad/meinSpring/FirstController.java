package de.mohammad.meinSpring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FirstController {
    @GetMapping("/Time")
    public  ResponseEntity<String> currentTime(){

        return ResponseEntity.ok("the current time is " + LocalDateTime.now().toString());
    }

}
