package com.gmail.rezemoeinpe.persistence.test.unit;

import com.gmail.rezamoeinpe.persistence.utils.PropertyFileLoader;
import org.junit.jupiter.api.Test;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

public class PropertyFileLoaderTest {

    @Test
    public void loadedPropertyValueMustMatch() {
        URL resource = PropertyFileLoaderTest.class.getResource("/property-loader-test.properties");
        var property = PropertyFileLoader.loadProperty(resource);

        assertNotNull(property, "Loaded property not be null");
        assertEquals("-10", property.getProperty("id"));
        assertEquals("pl", property.getProperty("name"));
        assertNull(property.getProperty("no-key"));
    }
}