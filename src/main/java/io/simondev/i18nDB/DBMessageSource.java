package io.simondev.i18nDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractMessageSource;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.Map;

@Component("messageSource")
public class DBMessageSource extends AbstractMessageSource {

    private static final String DEFAULT_LOCALE_CODE = "en";

    @Autowired
    private MessageData messageData;

    @Override
    protected MessageFormat resolveCode(String code, Locale locale) {

        // 언어에 맞춰서 반환
        String message = null;

        Map<String, Map<Locale, String>> messages = this.messageData.getMessages();

        Map<Locale, String> value = messages.get(code);
        if (locale == Locale.KOREA) locale = Locale.KOREAN;
        if (value != null) message = value.get(locale);

        return new MessageFormat(message, locale);
    }
}
