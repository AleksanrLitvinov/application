package lesson_20;

public class Signature {
    private static  Signature signature;
    private static String textOfSignature = "Iatsenko V.V czxklczkjlcxzkjlcxz";

    public static synchronized Signature getSignature() {
        if (signature == null) {
            signature = new Signature();
        }
        return signature;
    }
    public void showTextOfSignature() {
        System.out.println(textOfSignature);
    }


}
