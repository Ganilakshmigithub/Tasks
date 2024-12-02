//while loop

import java.util.Arrays;

public class ListOfStr4 {
    public static void main(String[] args) {
        String[] str={"watermelon","apple","grapes","pineapple"};
        int i=0;
        while(i<str.length){
            int j=i+1;
            while(j<str.length){
                if(str[i].length()>str[j].length()){
                    String temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;

                }
                j++;

        }
        i++;
}
System.out.println(Arrays.toString(str));

}
}
