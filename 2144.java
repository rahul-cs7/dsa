import  java.util.*;
 class Solution{
    public void minCost(int[] cost){
        Arrays.sort(cost);
        int total=0;
        int n= cost.length;
        for(int i=n-1;i>=0;i--){
            if((n-1-i)%3 !=2){
                total += cost[i];
            }
        }
        System.out.println(total);
    
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] cost = new int[n];

        System.out.println("Enter costs:");
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        obj.minCost(cost);

        sc.close();
    }

 }
