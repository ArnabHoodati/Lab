/*
@author: Arnab Kumar Hoodati
*/

class Arithmetic{       //super class
    int add(int a, int b)   //super class method
    {
         return(a+b);
    }
}
class Adder extends Arithmetic{     //sub class
    int Add(int a, int b) { //sub class method
        return add (a,b);
    }
    
}
public class Sum {
    public static void main(String []args){
        Adder a = new Adder();  //obj create

        System.out.println(a.add(18,36));
    }
}