public class replaceStringBegin {

    public static void main(String[] arg) {
        String firstString = "HelloHe";
        String newStr;

        if (firstString.substring(0, 2).equals(firstString.substring(firstString.length() - 2))) {
            newStr = firstString.substring(2);
            System.out.println(newStr);
        } else if (firstString.length() == 2) {
            System.out.println();
        } else {
            System.out.println(firstString);
        }
    }
}
