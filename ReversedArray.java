import java.util.Arrays;

public class Qayb {
    public static void main(String[] args) {
        int [] myarray={10,20,30,40,50};


        array(myarray);
    }

    public  static  void array(int [] myarray){
        System.out.println("not reversed = "+Arrays.toString(myarray));
        for (int i=0; i<myarray.length; i++ ){
            int tem=0;
            for (int j=i+1; j<myarray.length; j++){
                if (myarray[i]<myarray[j]){
                    tem=myarray[i];
                    myarray[i]=myarray[j];
                    myarray[j]=tem;
                }
            }
        }
        System.out.println(Arrays.toString(myarray));

    }
}
