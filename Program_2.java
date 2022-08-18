import java.util.*;
class Program_2{
    public static void main(String[] args){
       
        Input ob=new Input();
        ob.series();
    }
}
class Input{
    
      ArrayList<Integer> list=new ArrayList<Integer>();
      void series(){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter input a-");
      int n=sc.nextInt();
      int c=1;
      for(int i=0;i<n;i++){
         
        list.add(c);
        c=c+2;
      }
      System.out.print("then output : "+list);
    }
}
