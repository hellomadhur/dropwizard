package com.yammer.dropwizard.config.provider;

import java.io.*;

/**
 * An implementation of {@link ConfigurationSourceProvider} that reads the configuration from the
 * local file system.
 */
public class FileConfigurationSourceProvider implements ConfigurationSourceProvider {
    @Override
    public InputStream create(String path) throws IOException {
        final File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException("File " + file + " not found");
        }

        return new FileInputStream(file);
    }
}
