package com.grumpy.controller;

import com.grumpy.service.Language;
import com.grumpy.service.LanguageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/lookahead/{name}")
public class TypeAheadController {

    @Autowired
    private LanguageFactory languageFactory;

    @GetMapping
    public List<String> lookahead(@PathVariable("name") String languageName, @RequestParam("input") String input) {
        Objects.requireNonNull(languageName, "Specify language name.");

        Language language = Language.resolve(languageName);
        Objects.requireNonNull(language, "Specify language from support set - Java8, MySql8 or Python3.");

        return languageFactory.get(language).lookAhead(input);
    }
}
