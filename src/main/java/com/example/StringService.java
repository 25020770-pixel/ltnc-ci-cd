package com.example;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringService {
    private static final Logger logger = LoggerFactory.getLogger(StringService.class);

    public String reverseAndUpper(String input) {
        logger.info("Processing input string: {}", input);
        if (input == null) {
            return null;
        }
        String reversed = StringUtils.reverse(input);
        return StringUtils.upperCase(reversed);
    }
}
