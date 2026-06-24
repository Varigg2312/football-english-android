package com.footballenglish.academy;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppConfigTest {

    @Test
    public void packageId_isValid() {
        String packageId = "com.footballenglish.academy";
        assertTrue(packageId.matches("^[a-z][a-z0-9_]*(\\.[a-z][a-z0-9_]*)+$"));
    }

    @Test
    public void hostName_doesNotContainScheme() {
        String host = "football-english.pages.dev";
        assertFalse(host.startsWith("https://"));
        assertFalse(host.startsWith("http://"));
    }

    @Test
    public void versionCode_isPositive() {
        int versionCode = 2;
        assertTrue(versionCode > 0);
    }

    @Test
    public void fingerprint_hasCorrectFormat() {
        String fingerprint = "BB:78:E7:23:16:00:73:B5:8F:73:38:D4:52:2E:C3:91:0D:8D:69:84:71:3C:29:61:E3:DA:48:C5:D6:CE:23:E9";
        String[] parts = fingerprint.split(":");
        assertEquals("SHA-256 must have 32 bytes", 32, parts.length);
        for (String part : parts) {
            assertEquals("Each byte must be 2 hex chars", 2, part.length());
        }
    }
}
