


public class Tabulation {
public static int Knapsack (int val[],int wt[],int w){
int n= val.length;
int t[][]= new int[n+1][w+1];
for(int i=0;i<n+1;i++){
    for(int j=0;j<w+1;j++){
if(i==0||j==0){
    t[i][j]=0;
}
    }
}
for(int i=1;i<n+1;i++){
    for(int j=1;j<w+1;j++){
        int v=val[i-1];
        int W= wt[i-1];
        if(wt[i-1]<=j){
            int incprofit=v +t[i-1] [j-W];
            int excprofit=t[i-1][j];
            t[i][j]=Math.max(incprofit,excprofit);

        }
        else{
            int excprofit=t[i-1][j];
            t[i][j]=excprofit;
        }
    }
}
return t[n][w];
    }



    public static void main(String args[]){
        int wt[] = {15,14,10,45,30};
        int val[] = {2,5,1,3,4};
        int w=7;
        int t[][]=new int[val.length+1][w+1];
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                t[i][j] =-1;
            }
        }
        System.out.println(Knapsack(val ,wt,w));
    }
}
