public class PowerTable {
    public static void main(String[] args) {
        System.out.println("a\t\ta^2\t\ta^3");
        
        for (int a = 1; a <= 4; a++) {
            int aSquared = a * a;
            int aCubed = a * a * a;
            System.out.println(a + "\t\t" + aSquared + "\t\t" + aCubed);
        }
    }
}

output:-
----------
java -cp /tmp/6WUFTUmbqu/PowerTable
a		a^2		a^3
1		1		1
2		4		8
3		9		27
4		16		64

=== Code Execution Successful ===
