public class CheckNumberwithInstanceOf {

    public static void main(String[] args) {
        Integer i = 10;
        if( i instanceof Integer ){
            System.out.println("i is an Integer");
        }
        else{
            System.out.println("i is not an Integer");
        }
    }
}
