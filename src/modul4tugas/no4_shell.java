package modul4tugas;

public class no4_shell {
     public static void shellsort(int[] arr){
                int n = arr.length;
                int C,M;
                int jarak,i,j,kondisi;
                boolean sudah = true;
                int temp;
                C=0;
                M=0;jarak = n;
   while (jarak >= 1){
   jarak = jarak/2;
   sudah = true;
   while (sudah){
       sudah = false;
       for (j=0; j<n-jarak; j++){
           i=j+jarak;
           C++;
           if(arr[j]>arr[i]){
               temp=arr[j];
               arr[j]=arr[i];
               arr[i]=temp;
               sudah = true;
       }}
   }
   
   }
   }
   public static void tampil(int data[]){
   for (int i =0;i<data.length;i++){
   System.out.print(data[i]+ " ");
   }
   System.out.println();
   }
    public static void main(String[] args) {
     System.out.println("Pengurutan Menggunakan ShellSort");
          int data[] = {25,7,9,13,3};
        System.out.println("Data Sebelum Diurutkan : ");
           no4_shell.tampil(data);
           no4_shell.shellsort(data);
         System.out.println("Data Sesudah Diurutkan : ");
           no4_shell.tampil(data);
        
           System.out.println();
            System.out.print("faisal ali m");
           
    }
}
