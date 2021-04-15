package modul4tugas;

public class no3_selection {
    public  static  void selectionsort(int []A){
          int smallindex;
          int pass,j, n = A.length;
          int temp;
          for(pass=0; pass< n-1; pass++){
          smallindex = pass;
          for(j=pass+1;j<n; j++){
          if(A[j]<A[smallindex]){
              smallindex=j;
          }
          
          }
          temp =A[pass];
          A[pass] =A[smallindex];
          A[smallindex] = temp;
          
          }
        
    }
     public  static  void tampil(int []data){
     for(int i=0; i<data.length; i++){
                System.out.print(data[i]+ " ");
     }
     System.out.println();
     }
    
    public static void main(String[] args) {
        System.out.println("Pengurutan Menggunakan SelectionSort");
          int data[] = {25,7,9,13,3};
        System.out.println("Data Sebelum Diurutkan : ");
           no3_selection.tampil(data);
           no3_selection.selectionsort(data);
           System.out.println("Data Sesudah Diurutkan : ");
           no3_selection.tampil(data);
           
           System.out.println();
            System.out.print("faisal ali m");
           
    }    
}
