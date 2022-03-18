package com.gmail.rezamoeinpe.persistence.utils;

import lombok.SneakyThrows;

import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class PropertyFileLoader {
    private PropertyFileLoader() {
    }

    @SneakyThrows
    public static Properties loadProperty(URL propertyURL) {
        if (propertyURL == null)
            throw new NullPointerException("propertyURL is null");

        try (InputStream input = propertyURL.openStream()) {
            if (input == null)
                throw new NullPointerException("InputStream of property file is null");

            Properties properties = new Properties();
            properties.load(input);

            return properties;
        }
    }
}
