package edu.wgu.d387_sample_code.message;

import java.util.Locale;
import java.util.ResourceBundle;

public class TranslateMessage implements Runnable{
    Locale locale;

    public TranslateMessage(Locale locale) {
        this.locale = locale;
    }

    public String getWelcomeMessage() {
        ResourceBundle bundle = ResourceBundle.getBundle("translation", locale);
        return bundle.getString("welcome");
    }

    @Override
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getId() + " " + getWelcomeMessage());
    }
}
