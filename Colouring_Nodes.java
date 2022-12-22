import java.util.*;
class Colouring_Nodes{
    int n,n1,n2,len1,len2,len3,len4,len5,len6,cnt,cnt1,max;
    String s,s1;
    int arr1[],arr2[],arr3[],arr4[],arr5[],arr6[];
    int arr[];
    ArrayList<Integer> count=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    void input(){
        System.out.println("Enter the no of nodes");
        n=sc.nextInt();
        System.out.println("Enter the number of adjacent to each nodes ");
        for(int i=0;i<n;i++){
            if(i==0){
                System.out.println("Enter the no of nodes adjacent to node "+ i+1 );
                int one=sc.nextInt();
                arr1 =new int[one];
                System.out.println("Enter the nodes which are  adjacent to node "+ i+1 );
                for(int j=0;j<one;j++){
                    arr1[j]=sc.nextInt();
                }
            }
            if(i==1){
                System.out.println("Enter the no of nodes adjacent to node "+ (i+1) );
                int two=sc.nextInt();
                arr2=new int[two];
                System.out.println("Enter the nodes which are  adjacent to node "+ (i+1) );
                for(int j=0;j<two;j++){
                    arr2[j]=sc.nextInt();
                }
            } 
            if(i==2){
                System.out.println("Enter the no of nodes adjacent to node "+ (i+1) );
                int three=sc.nextInt();
                arr3=new int[three];
                System.out.println("Enter the nodes which are  adjacent to node "+ (i+1) );
                for(int j=0;j<three;j++){
                    arr3[j]=sc.nextInt();
                }
            } 
            if(i==3){
                System.out.println("Enter the no of nodes adjacent to node "+ (i+1) );
                int four=sc.nextInt();
                arr4=new int[four];
                System.out.println("Enter the nodes which are  adjacent to node "+ (i+1) );
                for(int j=0;j<four;j++){
                    arr4[j]=sc.nextInt();
                }
            } 
            if(i==4){
                System.out.println("Enter the no of nodes adjacent to node "+ (i+1) );
                int five=sc.nextInt();
                arr5=new int[five];
                System.out.println("Enter the nodes which are  adjacent to node "+ (i+1) );
                for(int j=0;j<five;j++){
                    arr5[j]=sc.nextInt();
                }
            } 
            if(i==5){
                System.out.println("Enter the no of nodes adjacent to node "+ (i+1) );
                int six=sc.nextInt();
                arr6=new int[six];
                System.out.println("Enter the nodes which are  adjacent to node "+ (i+1) );
                for(int j=0;j<six;j++){
                    arr6[j]=sc.nextInt();
                }
            }  
        }
    }
    void calc(){
        if(n==6){
        len1=arr1.length;
        len2=arr2.length;
        len3=arr3.length;
        len4=arr4.length;
        len5=arr5.length;
        len6=arr6.length;
        }
        if(n==4){
            len1=arr1.length;
            len2=arr2.length;
            len3=arr3.length;
            len4=arr4.length;
            }
        int len=0;
        for(int i=0;i<n;i++){
            n1=i+1;
            cnt=0;
            for(int j=0;j<n;j++){
                if(j==0){
                    len=len1;
                    arr=arr1;
                }
                if(j==1){
                    len=len2;
                    arr=arr2;
                }
                if(j==2){
                    len=len3;
                    arr=arr3;
                }
                if(j==3){
                    len=len4;
                    arr=arr4;
                }
                if(j==4){
                    len=len5;
                    arr=arr5;
                }
                if(j==5){
                    len=len6;
                    arr=arr6;
                }
                for(int k=0;k<len;k++){
                    if(n1==arr[k]){
                        cnt=cnt+1;
                    }
                }
            }
            count.add(cnt);
            }
        }
        void find(){
            max=0;
            cnt1=0;
            System.out.println(count);
            for(int i=0;i<n;i++){
                if(max<count.get(i)){
                    max=count.get(i);
                }
            }
            for(int i=0;i<n;i++){
                if(max==count.get(i)){
                    cnt1=cnt1+1;
                }
            }
            if(cnt1==n){
                System.out.println("The minimum colors used for colouring thr nodes are " + (max-1));
            }
            else{
                System.out.println("The minimum colors used for colouring thr nodes are " + (max));
            }
        }
        public static void main(String[] args) {
            Colouring_Nodes obj=new Colouring_Nodes();
            obj.input();
            obj.calc();
            obj.find();

        }
    }
