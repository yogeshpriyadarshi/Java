
public class TowerOfHanoi {

    public static void hanoi(int n, String Source, String Helper, String Destination) {
        if (n == 1) {
            System.out.println("Transfer of " + n + "th Ring from " + Source + " to " + Destination);
            return;
        }

        hanoi(n - 1, Source, Destination, Helper);

        System.out.println("Transfer of " + n + "th Ring from " + Source + " to " + Destination);

        hanoi(n - 1, Helper, Source, Destination);

    }

    public static void main(String[] args) {
        int n = 3;
        hanoi(n, "source", "Helper", "Destination");

    }

}
