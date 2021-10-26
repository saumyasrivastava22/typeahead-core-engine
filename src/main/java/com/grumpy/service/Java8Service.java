package com.grumpy.service;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component("Java8")
public class Java8Service implements LanguageService {

    @Override
    public List<String> lookAhead(String input) {
        return Collections.emptyList();
    }
}
