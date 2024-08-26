package edu.wgu.d387_sample_code.timezone;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http/localhost:4200")
@RestController
public class TZController {

    @GetMapping("/presentation")
    public ResponseEntity<String> announcePresentation() {
        String announcement = "A presentation about our services will be hosted at: " + TZConverter.getTime();
        return new ResponseEntity(announcement, HttpStatus.OK);
    }
}
