package laitinenm;

public class Sqrt {

    public static void printIfZeroModSqrt(double root)
    {
       if((Math.sqrt(root)*10)%10 == 0)
       {
           System.out.println((int)root);
       }
    }
    
    public static void main(String[] args) {
        // tehtavat1.md, Lämmittelyt, Kokonaislukuja
        double root;
        System.out.println("The following sqrts have no remainder:");
        for(root=0;root<=1000;root++)
        {
            printIfZeroModSqrt(root);
        }

    }

}
