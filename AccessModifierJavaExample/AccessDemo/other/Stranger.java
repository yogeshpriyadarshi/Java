package other;

import main.Person;

public class Stranger extends Person {
    public void testAccess() {
        System.out.println("Access from subclass in different package:");
        System.out.println(publicName);         // ✅ public
        System.out.println(protectedName);      // ✅ protected (subclass)
        // System.out.println(defaultName);     // ❌ Error: default
        // System.out.println(privateName);     // ❌ Error: private
    }

    public static void main(String[] args) {
        Stranger s = new Stranger();
        s.testAccess();
    }
}
