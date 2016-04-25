package uk.ac.aston.cs1260;

public class PublicKey {
    public int a;
    public int n;
    public int m;

    public PublicKey(int p, int q, int k) {
        // to do
    	n=p*q;
    	m=(p-1)*(q-1);
    }
    
    public int getMod()
    {
    	int a = Euclidean.extendedAlgorithm(k, m);
    	return a;
    }
}
