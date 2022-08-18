import java.util.*;
class Program_4{
    public static void main(String[] args){
        Input ob=new Input();
        ob.output();
    }
} 
class Input{
    ArrayList<Integer> list=new ArrayList<Integer>();
    ArrayList<Integer> list1=new ArrayList<Integer>();
   void output(){
    int i;
         Scanner sc=new Scanner(System.in);
         System.out.print(" Input : ");
         String[] n=sc.nextLine().split(" ");
         for(String p:n){
            int t=Integer.parseInt(p);
            list.add(t);
         } 
        
         System.out.print("output : ");
         for(int j=1;j<10;j++){
            int count=0;
            for(int k =0; k<list.size();k++){
                if(list.get(k)%j==0)
                    count++;
            }
            System.out.print(j+":"+count+" ");
         } 
   }
}
