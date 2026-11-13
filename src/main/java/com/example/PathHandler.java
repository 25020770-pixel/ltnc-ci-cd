package com.example;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PathHandler {
    private static final Logger logger = LoggerFactory.getLogger(PathHandler.class);

    /**
     * Resolves subpath using modern java.nio.file.Path for cross-platform compatibility.
     */
    public Path buildPath(String baseDir, String subDir, String filename) {
        Path path = Paths.get(baseDir, subDir, filename);
        logger.info("Resolved cross-platform path: {}", path);
        return path;
    }

    /**
     * Builds relative path string using File.separator.
     */
    public String buildRelativePath(String folder, String filename) {
        String relativePath = folder + File.separator + filename;
        logger.info("Constructed relative path using File.separator: {}", relativePath);
        return relativePath;
    }
}
