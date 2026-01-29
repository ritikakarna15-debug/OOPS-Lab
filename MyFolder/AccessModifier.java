

public class AccessModifier {

    public String publicVar = "Public Variable";
    private String privateVar = "Private Variable";
    protected String protectedVar = "Protected Variable";
    String defaultVar = "Default Variable";

    public void showAccessModifiers() {
        System.out.println(publicVar);
        System.out.println(privateVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
    }

    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        obj.showAccessModifiers();
    }
}

