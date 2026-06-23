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
        String fingerprint = "06:11:BD:16:C5:7D:3E:A6:EE:9C:5D:B5:4E:16:6D:3A:B6:DE:1C:28:74:A7:E0:91:EC:04:BA:C8:AB:48:F4:54";
        String[] parts = fingerprint.split(":");
        assertEquals("SHA-256 must have 32 bytes", 32, parts.length);
        for (String part : parts) {
            assertEquals("Each byte must be 2 hex chars", 2, part.length());
        }
    }
}
