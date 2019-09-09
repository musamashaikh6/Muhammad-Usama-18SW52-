class MyCalculator{
    long power(int num, int pow){
    long powe=1;
    if(num>0 && pow>0){
        for(int i=1; i<=pow; i++){
            powe*=num;
        }
    }
    else if(num<0 || pow<0){
        throw new ArithmeticException("Number or Power cannot be Negative");
    }
    else if(num==0 && pow==0){
        throw new ArithmeticException("Number and Power cannot be Zero");
    }
    return powe;
  }
}
class Calculate{
    public static void main(String[]args){
        MyCalculator c=new MyCalculator();
        try{
            long po=c.power(0,0);
            System.out.println("Power: "+po);
        }
        catch(ArithmeticException a){
            System.out.println("Exception:"+a.getMessage());
        }
    }
}