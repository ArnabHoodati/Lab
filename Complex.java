/*
@author: Arnab Kumar Hoodati
*/


//Java Program to add two complex numbers
public class Complex {

    // variables to hold real and imaginary part of complex number
    double real;
    double imaginary;
    
    
    // Constructor which will be used while creating complex
    // number
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static void main(String[] args) {
        
        // creating two complex numbers
        Complex n1 = new Complex(4.5, 5.6),
                n2 = new Complex(5.0, 6.1),
                temp;
        
        // calling add() to perform addition
        temp = add(n1, n2);
        
        // printing addition
        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imaginary);
    }
    
    // calling add() to perform addition
    public static Complex add(Complex n1, Complex n2)
    {
        Complex temp = new Complex(0.0, 0.0);
        
         // function for addition
        temp.real = n1.real + n2.real;
        temp.imaginary = n1.imaginary + n2.imaginary;

        return(temp);
    }
}
