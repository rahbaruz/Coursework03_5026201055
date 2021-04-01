import java.util.Random;

public class ComputeMethods5026201055 {

    public double fToC (double degreeF){
        double degreeC = 5.0/9*(degreeF-32);
        return degreeC;
    }
    public double hypotenuse(int a, int b){
	double c;
	c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
	return c;
    }
    public int roll (){
        Random rndm  = new Random();
        int dicetotal = rndm.nextInt(11) + 2;
        return dicetotal;
    }
}