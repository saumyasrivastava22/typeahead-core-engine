package com.grumpy.service;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component("MySql8")
public class MySql8Service implements LanguageService {

    @Override
    public List<String> lookAhead(String input) {
        return Collections.emptyList();
    }
}
