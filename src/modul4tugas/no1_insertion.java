package modul4tugas;

public class no1_insertion {

    public static void insertionShort(int[] A) {
           
       for(int i=1; i<A.length; i++){
          int key = A[i];
          int j = i-1;
          while ((j>= 0) &&  (A[j]>key)){
          A[j +1] = A[j];
          j--;
          }
          A[j + 1]= key;
          }
        
    }
     public  static  void tampil(int []data){
         
     for(int i=0; i<data.length; i++){
                System.out.print(data[i]+ " ");
     }
     System.out.println();
     }
    
    public static void main(String[] args) {
        System.out.println("Pengurutan Menggunakan InsertionSort");
        int data[] = {25,7,9,13,3};
        System.out.println("Data Sebelum Diurutkan : "); 
           no1_insertion.tampil(data);
           no1_insertion.insertionShort(data);
           System.out.println("Data Sesudah Diurutkan : ");
           no1_insertion.tampil(data);
           System.out.println();
           System.out.println("faisal ali m");
           

    }
    
}
