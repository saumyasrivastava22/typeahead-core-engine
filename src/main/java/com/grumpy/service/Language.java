package com.grumpy.service;

import java.util.Arrays;

public enum Language {

    MySql8,
    Java,
    Java8,
    Python,
    Python3;

    public static Language resolve(String name) {
        return Arrays.stream(Language.values()).filter(language -> language.name().equalsIgnoreCase(name)).findFirst().get();
    }
}
