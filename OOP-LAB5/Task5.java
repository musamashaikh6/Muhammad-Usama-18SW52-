class Task5{
  int m1,m2,m3;
  public Task5(int m1,int m2,int m3){
      this.m1=m1;
      this.m2=m2;
      this.m3=m3;
   }
  public void Calculator(){
   int totalmarks=250;
   int obtainedmarks=(m1+m2+m3);
   double per=obtainedmarks*100/totalmarks;
   System.out.println("Obtained Marks="+obtainedmarks);
   System.out.println("Percentage="+per);
   if(per<50){
   System.out.println("Fail");
   }
   else if(per>=50 && per<60){
   System.out.println("C-Grade");
   }
   else if(per>=60 && per<70){
   System.out.println("B-Grade");
   }
   else if(per>=70 && per<80){
   System.out.println("A-Grade");
   }
   else {
   System.out.println("A+ Grade");
   }
  }
  public static void main(String[]args){
  Task5 marks=new Task5(44,87,90);
  marks.Calculator();
  }
}