package io.simondev.i18nDB;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@Configuration
public class AppConfig {

    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver localeResolver = new SessionLocaleResolver();

        // Force to change the default Locale
        //localeResolver.setDefaultLocale(Locale.ENGLISH); // English
        //localeResolver.setDefaultLocale(Locale.KOREAN); // Korean
        localeResolver.setDefaultLocale(Locale.JAPANESE); // Japanese

        return localeResolver;
    }
}
