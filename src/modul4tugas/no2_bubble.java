package modul4tugas;

public class no2_bubble {
    
    public  static  void bubbleSort(int []A){
        int i=1,j,n = A.length;
        int temp;
        while(i<n){
        j=n-1;
        while(j>=i){
        if(A[j-1]>A[j]){
        temp = A[j];
        A[j] = A[j-1];
        A[j-1]= temp;
        }
        j = j-1;
        }
        i=i+1;
        }    
    }
     public  static  void tampil(int []data){
     for(int i=0; i<data.length; i++){
                System.out.print(data[i]+ " ");
     }
     System.out.println();
     }
    
    public static void main(String[] args) {
         System.out.println("Pengurutan Menggunakan BubbleSort");
          int data[] = {25,7,9,13,3};
        System.out.println("Data Sebelum Diurutkan : ");
           no2_bubble.tampil(data);
           no2_bubble.bubbleSort(data);
           System.out.println("Data Sesudah Diurutkan : ");
           no2_bubble.tampil(data);
           System.out.println();
           System.out.print("faisal ali m");
          
           

    }
}

