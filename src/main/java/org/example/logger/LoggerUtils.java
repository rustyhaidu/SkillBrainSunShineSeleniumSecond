package org.example.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtils {
    private static final Logger logger = LoggerFactory.getLogger(LoggerUtils.class);

    public static Logger getLogger() {
        return logger;
    }
}