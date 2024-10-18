// @Author: Kushal Raj Sharma
// @ID: C0940005

public class StringManipulation {
    public static void main(String[] args) {
        String firstname_005 = "Kushal";
        String lastname_005 = "Sharma";

        char firstchar_005 = firstname_005.charAt(0);
        char lastchar_005 = lastname_005.charAt(lastname_005.length() - 1);

        System.out.printf("My first name is %s, my last name is %s, " +
                        "first character in my first name is '%c' and " +
                        "last character in my last name is '%c'%n.",
                firstname_005, lastname_005, firstchar_005, lastchar_005);
    }
}