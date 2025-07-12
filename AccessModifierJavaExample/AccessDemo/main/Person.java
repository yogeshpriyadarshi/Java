package main;

public class Person {
    public String publicName = "John";
    protected String protectedName = "John Protected";
    String defaultName = "John Default";
    private String privateName = "John Private";

    public void showAccess() {
        System.out.println("Inside Person class:");
        System.out.println(publicName);
        System.out.println(protectedName);
        System.out.println(defaultName);
        System.out.println(privateName);
    }
}
