package com.maven.LAB_MID_TERM;

import java.util.ResourceBundle;

public class CredentialChecker {
	private ResourceBundle resourceBundle;

    public CredentialChecker() {
        resourceBundle = ResourceBundle.getBundle("config");
    }

    public boolean check(String name, String id) {
        String correctName = resourceBundle.getString("name");
        String correctID = resourceBundle.getString("id");
        
        boolean result = (name.equals(correctName) && id.equals(correctID));
        
        return result;
    }
}