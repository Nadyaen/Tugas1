/*nadya mahza khairani
227064516102
*/
package tugas1;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        double rata = 0, total = 0, uts = 0, uas = 0; 

        System.out.print("a. Jumlah Data ? "); 
        int n = input.nextInt();
        String[] nama = new String[n];
        
        int[][] d = new int[n][5]; 
        
        for(int i=0; i<n; i++){ 
            System.out.print("b. Nama ? "); 
            nama[i] = input.next(); 
            System.out.print("c. Nilai UTS ? ");
            d[i][0] = input.nextInt(); 
            System.out.print("d. Nilai UAS ? "); 
            d[i][1] = input.nextInt(); 
            d[i][2] = d[i][0] + d[i][1]; 
            System.out.println(); 
        }
        System.out.println();
        System.out.println("No\tNama\tUTS\tUAS\tTotal\tRata-Rata"); 
        System.out.println("================================================="); 
        
        for(int i=0; i<d.length; i++){ 
            System.out.print((i+1)+"."+"\t"+nama[i]+"\t"); 
            for(int j=0; j<3; j++){
                System.out.print(d[i][j]+"\t"); 
            }
            uts=d[i][0]; 
            uas=d[i][1]; 
            total=d[i][2]; 
            total=uts+uas;
            rata=total/2; 
            System.out.println(rata+"\t");
}
        }
    }
