package uk.ac.aston.cs1260;

public class Euclidean {
	
    public static int extendedAlgorithm(int a, int b) {
        // to do
     	
     	int Modulus = b;
     	while (Modulus != 0)
     	{
    	 	Modulus = ((Modulus * a) % Modulus);
     	}
     	return Modulus;
    }
}
