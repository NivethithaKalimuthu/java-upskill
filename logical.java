public class logical {
    public static void main(String[] args) {
        
        boolean z=true;
        boolean y=false;
        //not
        System.out.println(!z);
        //or atleat one must be true
        System.out.println(z||y);
        //and both should be true
        System.out.println(z&&y);

        //precedence
        System.out.println(z&y||z);

    }
    
}
