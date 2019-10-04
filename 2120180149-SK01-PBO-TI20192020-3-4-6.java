package pkg2120180149.sk01.pbo.ti20192020.pkg3.pkg4.pkg06;
public class SK01PBOTI201920203406 {
    public static void main(String[] args) {
        // TODO code application logic here
                int j,p,q,r,s,t;
        int n =10;
        int e = n-1;
        for(j=0; j<n; j++){
            for(p=0; p<e; p++){
                System.out.print(" ");
            }
            for(q=0; q<=j; q++){
                System.out.print("6 ");
            }
            e--;
            System.out.println();
        }
        e = 0;
        for(r=(n); r>0; r--){
            for(s=0; s<e; s++){
               System.out.print(" ");
            }
            for (t=0; t<r; t++){
                System.out.print("6 ");
            }
            System.out.println();
            e++;
        }
    }
}
