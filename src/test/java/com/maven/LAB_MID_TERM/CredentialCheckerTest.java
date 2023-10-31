package com.maven.LAB_MID_TERM;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.maven.LAB_MID_TERM.CredentialChecker;


public class CredentialCheckerTest {
	
	@Test
    public void testValidCredentials() {
        CredentialChecker checker = new CredentialChecker();
        
        System.out.println("\n[TEST CASE 1]: TESTING WITH THE CORRECT NAME AND THE CORRECT ID !!");
        
        boolean result = checker.check("ram", "3025");
        
        Assert.assertEquals(result, true, "Expected TRUE but got FALSE");
    }

    @Test
    public void testInvalidCredentials() {
    	CredentialChecker checker = new CredentialChecker();
        
        System.out.println("\n[TEST CASE 2]: TESTING WITH THE INCORRECT NAME AND THE INCORRECT ID !!");
        
        boolean result = checker.check("abcd", "1234");
        
        Assert.assertEquals(result, false, "Expected FALSE but got TRUE");
    }
    
    @Test
    public void testMixedCredentials() {
    	CredentialChecker checker = new CredentialChecker();
        
        System.out.println("\n[TEST CASE 3]: TESTING WITH THE CORRECT NAME BUT THE INCORRECT ID !!");
        
        boolean result = checker.check("ram", "1234");
        
        Assert.assertEquals(result, false, "Expected FALSE but got TRUE");
    }
}
