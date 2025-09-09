public class Array3D {
    public static void main(String[] args) {
        // int[][][] a;//declare
        // a= new int[3][2][4];//creation
        //  a[0][1][0]=10;
        //  a[0][0][0]=5;
        //  a[1][1][1]=20;
        //  a[2][1][1]=40;
         int[][][] a= {{{10,5},{20},{40}}};
         for(int i=0; i<a.length;i++){
            for (int j=0;j<a[i].length;j++) {
                for(int k=0;k<a[i][j].length;k++){
                    System.out.print(a[i][j][k] +" ");
                }  
                System.out.println();
                
            } System.out.println();
         }
    }
    
}
