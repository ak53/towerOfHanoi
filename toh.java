public class toh {
    static stack t1=new stack(100);
    static stack t2=new stack(100);
    static stack t3=new stack(100);
    static stack hand=new stack(100);


    private static void func(int n,stack t1, stack t2,stack t3){
        if (n==1){
            int temp=t1.pop();
            t3.push(temp);
        }else{
            func(n-1,t1,t3,t2);
            int temp=t1.pop();
            t3.push(temp);
            func(n-1,t2,t1,t3);

        }
        System.out.println("A "+t1.printing());
        System.out.println("B "+t2.printing());
        System.out.println("C "+t3.printing());
        System.out.println("***************");
    }
    public static void main(String[] args){
        int n=2;

        for (int i=n;i>0;i--){
            t1.push(i);
        }
        func(n, t1, t2, t3);
    }
}

class stack{
    int top;
    int[] items;

    stack(int len){
        top=-1;
        items=new int[len];
    }
    void push(int data){
        items[++top]=data;
    }
    int pop(){
        int temp=items[top];
        items[top]=0;
        top--;
        return temp;
    }

    String printing(){
        String ans=new String();
        for (int f=0;f<this.items.length;f++){
            if (items[f]!=0){ans+=items[f];
            ans+=" ";}
        }
        return ans;
    }



}
