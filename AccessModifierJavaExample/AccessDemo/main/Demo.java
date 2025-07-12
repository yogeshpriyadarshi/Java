package main;

public class Demo {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Access from same package:");
        System.out.println(p.publicName);       // ✅
        System.out.println(p.protectedName);    // ✅
        System.out.println(p.defaultName);      // ✅
        // System.out.println(p.privateName);   // ❌ Error: private
    }
}
