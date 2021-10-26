package com.grumpy.service;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component("Python3")
public class Python3Service implements LanguageService {

    @Override
    public List<String> lookAhead(String input) {
        return Collections.emptyList();
    }
}
