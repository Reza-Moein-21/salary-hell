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

    @Test
    public void shouldThrowNullExceptionWhenInputParamBeenNull() {
        assertThrows(NullPointerException.class,
                () -> PropertyFileLoader.loadProperty(null),
                "property url is null. so should throw null pointer exception");
    }


    @Test
    public void shouldThrowNullExceptionWhenPassingWrongPropertyURL() {
        assertThrows(NullPointerException.class,
                () -> PropertyFileLoader.loadProperty(new URL("file://")),
                "property url is wrong. so should throw null pointer exception");
    }
}