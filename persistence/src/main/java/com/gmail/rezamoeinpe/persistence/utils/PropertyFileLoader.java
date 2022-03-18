package com.gmail.rezamoeinpe.persistence.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class PropertyFileLoader {
    private PropertyFileLoader() {
    }

    public static Properties loadProperty(URL propertyURL) {
        if (propertyURL == null)
            throw new NullPointerException("propertyURL is null");

        try (InputStream input = propertyURL.openStream()) {
            var properties = new Properties();
            properties.load(input);
            return properties;
        } catch (IOException e) {
            throw new NullPointerException("InputStream of property is wrong [" + e + "]");
        }
    }
}
