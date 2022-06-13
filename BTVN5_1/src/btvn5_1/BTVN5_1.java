
package btvn5_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BTVN5_1 {

    
    public static void main(String[] args) {
        Dieuhoa dieuHoa = new Dieuhoa();
        Scanner sc = new Scanner(System.in);            
       ArrayList<Dieuhoa> danhSach = new ArrayList<>();
        System.out.println("Nhap n ; ");
       int n =sc.nextInt();
     // Dieuhoa []danhSach = new Dieuhoa[n];
       for(int i = 0; i<n;i++){
//           danhSach[i] = new Dieuhoa();
//           danhSach[i].nhap();     
          Dieuhoa dh = new Dieuhoa();    
          dh.nhap();
          danhSach.add(dh);         
    }
        Dieuhoa min = danhSach.get(n);
     for(int i= 0 ; i<danhSach.size();i++)      {
         if(danhSach.get(i).compareTo(min)<500){
             min = danhSach.get(i);
         }
         
     }
      System.out.println(min);
            
       }
}
            
        
    
       
               
           
           
           
       
    


       
    
    

