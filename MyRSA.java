package uk.ac.aston.cs1260;
import java.util.ArrayList;

/**
	Please note that no exceptions should be thrown, rather a null must be returned on error.
**/


public class MyRSA {

    public static String encrypt(int p, int q, int privateKey, String message) 
    {
        // to do
    	ArrayList<Integer> asciiCodes = convertToAscii(message);
    	String encrpyted= "";
    	
    	//int modulus = p * q; 
    	//int phi = (p - 1)*(q - 1);
    	
    	//int e = 0;
    	//int d = 0;
    	
    	//Euclidean.extendedAlgorithm(privateKey, phi);
    	//e = Euclidean.m;
    	//d = Euclidean.n;
    	
    	for (int encryptInt : asciiCodes)
    	{
    		int m = Euclidean.modExpo(encrpytInt, e modulus);
    		int c = Euclidean.modExpo(m, d, modulus);
    		
    		encrypted += Integer.toString(m) + " ";
    	}
    	
    	return encrypted;
    }
	
    public static String decrypt(int privateKey, String encryptedString, int p, int q)
    {
        // to do
    	int modulus = p * q;
    	int phi = (p-1)*(q-1);
    	String encSplit[] = encryptedString.split("");
    	String decrypted = "";
    	
    	for (String encAscii : encSplit)
    	{
    		int encCode = Integer.parseInt(encAscii);
    		int c = Euclidean.modExpo(encCode, privateKey, modulus);
    		decrypted += Character.toString(char)c);
    	}
    	return decrypted;
    }
    
    public static ArrayList<Integer> convertToAscii(String text)
    {
    	ArrayList<Integer> codes = new ArrayList<>();
    	for(int i = 0; i < text.length();i++)
    	{
    		int code = (int) text.charAt(i);
    		codes.add(code);
    	}
    	
    	return codes;
    }
}
