package asd;
public class HelloWorld{
    
    public static void main(String arg[])throws Exception{
    	String str = "DJJGKHG HBMBEBIBFBF HBMBQDK HBMBTDH HBMBEBIBFBF HBNGKHG";
        String ar[] = str.split("\\s+");
        int[] count = new int[ar.length]; 
        int[][] ascii = new int[ar.length][];
        char[] c_arr;
        int tempAdd = 0;
        for(int i = 0; i < ar.length; i++){
            c_arr = ar[i].toCharArray();
            count[i] = c_arr.length;
            ascii[i] = new int[count[i]];
            for(int j = 0; j < count[i]; j++){
         	   tempAdd += ascii[i][j] = ((int) c_arr[j]) - 64;
            }
            if(tempAdd != 57){
            	throw new Exception("It's not 57");
            }
            else{
            	tempAdd = 0;
            	for(int k = 0 ; k < count[i]; k++){
            		for(int x = 0; x < c_arr.length; x++)
            		{
            			if(x%2 == 0){
            				System.out.print(ascii[k][x]);
            			}
            			else{
            				System.out.print("!");
            			}
            		}
            	}
            	System.out.println("\n");
            }
        }
    }
}