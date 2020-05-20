package io.simondev.i18nDB;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class I18nController {

    @GetMapping
    public String index() {

        return "index";
    }
}

