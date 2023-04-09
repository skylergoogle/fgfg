



public class Cc {

public static int Knapsack(int wt[],int val[],int w,int n,int t[][]){
if(n==0||w==0){
    return 0;
}
if(t[n][w]!=-1)
return t[n][w];

if(wt[n-1]<=w){
    int ans1= val[n-1]+Knapsack(wt,val,w-wt[n-1],n-1,t);
    int ans2=Knapsack(wt,val,w,n-1,t);
    t[n][w]=Math.max(ans1,ans2);
    return t[n][w];
}
else{
   t[n][w] = Knapsack(wt,val,w,n-1,t);
   return t[n][w];
}
}
    public static void main(String args[]){
        int val[]={2,3,4,5,6,};
        int wt[]={3,7,5,4,8,9,2};
        int w=8;
        int t[][]=new int[val.length+1][w+1];
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                t[i][j] =-1;
            }
        }
        System.out.println(Knapsack(val,wt,w,val.length,t));
    }
    }
    

