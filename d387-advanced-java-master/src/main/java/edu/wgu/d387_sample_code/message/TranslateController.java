package edu.wgu.d387_sample_code.message;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TranslateController {

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome(@RequestParam("lang") String lang) {
        Locale locale = Locale.forLanguageTag(lang);
        TranslateMessage translateMessage = new TranslateMessage(locale);
        return new ResponseEntity<String>(translateMessage.getWelcomeMessage(), HttpStatus.OK);
    }
}
