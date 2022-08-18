import java.util.*;
        class Singint2{
            public static void main(String[] args){
               
                Input ob=new Input();
                ob.series();
            }
        }
        class Input{
            
              ArrayList<Integer> list=new ArrayList<Integer>();
              void series(){
                int a;
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter input a-");
              int n=sc.nextInt();
              if(n%2==0){
                 a=n-1;
              }
              else{
                 a=n;
              }
              int c=1;
              for(int i=0;i<a;i++){
                 
                list.add(c);
                c=c+2;
              }
              System.out.print("then output : "+list);
            }
        }
