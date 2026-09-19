public class JaggedArray{
    public static void main(String[] args){
        int [][] num = new int [4][];
        num[0] = new int[1];
        num[1] = new int[2];
        num[2] = new int[3];
        num[3] = new int[4];
        int i,j,k = 0;

        for(i = 0; i<4; i++)
            for(j = 0; j<i+1; j++){
                num[i][j] = k;
                k++;
            }

        for(i = 0; i<4; i++){
            for(j = 0; j<i+1; j++)
                System.out.print(num [i][j] + " ");
            System.out.println();
        }
    }
}
