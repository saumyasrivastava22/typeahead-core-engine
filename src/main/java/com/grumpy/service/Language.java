package com.grumpy.service;

import java.util.Arrays;
import java.util.Optional;

public enum Language {

    MySql8,
    Java8,
    Python3;

    public static Language resolve(String name) {
        return Arrays.stream(Language.values()).filter(language -> language.name().equalsIgnoreCase(name)).findFirst().get();
    }
}
