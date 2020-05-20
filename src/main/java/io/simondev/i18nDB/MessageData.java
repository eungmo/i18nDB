package io.simondev.i18nDB;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Component
public class MessageData {

    private Map<String, Map<Locale, String>> messages = new HashMap<>();

    @PostConstruct
    private void CommonData() {
        Map<Locale, String> value1 = new HashMap<>();
        value1.put(Locale.KOREAN, "6월");
        value1.put(Locale.ENGLISH, "June");
        value1.put(Locale.JAPANESE, "6月");

        messages.put("6월", value1);
    }

    public Map<String, Map<Locale, String>> getMessages() {
        return messages;
    }
}
