import java.util.Scanner;

public class MergeTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the index of the first Array: ");
        int m = sc.nextInt();
        int a[] = new int[m];
        System.out.println(" Enter the Elements of the first Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println("Enter the index of the Second Array:");
        int n = sc.nextInt();
        int b[]= new int[n];
        System.out.println("Enter elements in the Second Array");
        for (int j=0;j<b.length;j++){

            b[j]=sc.nextInt();
        }
        int z=m+n;
        int c[]= new int[z];
        // Merger

        for (int i=0;i<a.length;i++){
            c[i]=a[i];

        }
        for (int j=0;j<b.length;j++){
            c[a.length+j]=b[j];
        }
        // Printing Merger Array
        System.out.println(" After Merging");
        for (int k=0;k<c.length;k++){
            System.out.println(c[k]);
        }


    }
}