public class MoveElements {
    
    public static void me(int [] a){
        int temp=a[0];
        for(int i=1;i<a.length;i++){
            a[i-1]=a[i];
        }
        a[(a.length)-1]=temp;
    }
    public static void mme(int [] a,int k){
        k=k%(a.length);
        int temp=a[0];
        for(int i=1;i<a.length;i++){
            a[i-1]=a[i];
        }
        a[(a.length)-1]=temp;

    }
    public static void lm(int[] a,int k){
        int n=a.length;
        k=k%n;
        int [] result=new int[n];
        for(int i=0;i<n;i++){
            result[(i+k)%n]=a[i];
        }
        for(int i=0;i<n;i++){
            a[i]=result[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter number of elements to be moved:");
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            lm(a,k);
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        //another way to do so
       // System.out.println("Enter number of elements to be moved:");
       // int k=sc.nextInt();
       // for(int i=0;i<k;i++){
       //     me(a);
       // }
       // for(int i=0;i<a.length;i++){
       //     System.out.print(a[i]+" ");
       //}
       // me(a);
       // System.out.println("After moving 1 element:");
       // for(int i=0;i<a.length;i++){
       //     System.out.print(a[i]+" ");
       // }
       // System.out.println("After moving m elements:");
       // mme(a);
       // for(int i=0;i<a.length;i++){
       //     System.out.print(a[i]+" ");
       // }
    }
}

