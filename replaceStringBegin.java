public class replaceStringBegin {

    public static void main(String[] arg) {
        String firstString = "HelloHe";
        String secaondString = "He";
        boolean doesContain = firstString.contains(secaondString);
        if(doesContain){
            firstString = firstString.replace("He","");
            System.out.println(firstString);
        }
    }
}
