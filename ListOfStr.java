import java.util.Arrays;
//for loop

public class ListOfStr {
    public static void main(String[] args) {
        String[] str={"apples","kiwi","watermelon","pineapple","guvava"};
        for(int i=0;i<str.length;i++){       //outer loop to traverse list of strings
            for(int j=i+1;j<str.length;j++){    //inner loop to compare each string with other strings
                if(str[i].length()>str[j].length()){  //if current string is greater than next string they will swap
                    String temp=str[i];   //store first string in temp
                    str[i]=str[j];      //assign next string
                    str[j]=temp;        //swap first string with next string
                }
            }
    }
    System.out.println(Arrays.toString(str));

}
}


