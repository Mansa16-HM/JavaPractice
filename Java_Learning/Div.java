public class DivisionDemo {
    
    public static void main(String[] args) {
        
        System.out.println("═══════════════════════════════════════════════════");
        System.out.println("  INTEGER DIVISION vs FLOATING DIVISION");
        System.out.println("═══════════════════════════════════════════════════\n");
        
        // ──────────────────────────────────────────────────────────────
        // 1. WITHOUT USING VARIABLES (Direct Literal Values)
        // ──────────────────────────────────────────────────────────────
        
        System.out.println("1️⃣  WITHOUT USING VARIABLES (Direct Literals)");
        System.out.println("─────────────────────────────────────────────────\n");
        
        // Integer Division (both operands are int)
        System.out.println("Integer Division (int / int):");
        System.out.println("  10 / 3 = " + (10 / 3));
        System.out.println("  Explanation: Result is 3 (decimal part 0.333... is TRUNCATED)\n");
        
        System.out.println("Integer Division with Negative:");
        System.out.println("  -10 / 3 = " + (-10 / 3));
        System.out.println("  Explanation: Result is -3 (truncates towards zero)\n");
        
        // Floating Division (at least one operand is float/double)
        System.out.println("Floating Division (double / double):");
        System.out.println("  10.0 / 3.0 = " + (10.0 / 3.0));
        System.out.println("  Explanation: Result is 3.333... (decimal part PRESERVED)\n");
        
        System.out.println("Floating Division (int / double):");
        System.out.println("  10 / 3.0 = " + (10 / 3.0));
        System.out.println("  Explanation: int is converted to double automatically\n");
        
        System.out.println("Floating Division (double / int):");
        System.out.println("  10.0 / 3 = " + (10.0 / 3));
        System.out.println("  Explanation: int is converted to double automatically\n");
        
        
        // ──────────────────────────────────────────────────────────────
        // 2. USING VARIABLES
        // ──────────────────────────────────────────────────────────────
        
        System.out.println("\n" + "═".repeat(53));
        System.out.println("2️⃣  USING VARIABLES");
        System.out.println("═".repeat(53) + "\n");
        
        // Integer Variables
        int intA = 10;
        int intB = 3;
        
        System.out.println("Integer Variables:");
        System.out.println("  int intA = " + intA);
        System.out.println("  int intB = " + intB);
        System.out.println("  intA / intB = " + (intA / intB));
        System.out.println("  Result: " + (intA / intB) + " (decimal part truncated)\n");
        
        
        // Floating Variables
        double doubleA = 10.0;
        double doubleB = 3.0;
        
        System.out.println("Double Variables:");
        System.out.println("  double doubleA = " + doubleA);
        System.out.println("  double doubleB = " + doubleB);
        System.out.println("  doubleA / doubleB = " + (doubleA / doubleB));
        System.out.println("  Result: " + (doubleA / doubleB) + " (decimal part preserved)\n");
        
        
        // Float Variables
        float floatA = 10.0f;
        float floatB = 3.0f;
        
        System.out.println("Float Variables:");
        System.out.println("  float floatA = " + floatA);
        System.out.println("  float floatB = " + floatB);
        System.out.println("  floatA / floatB = " + (floatA / floatB));
        System.out.println("  Result: " + (floatA / floatB) + " (decimal part preserved)\n");
        
        
        // Mixed Type Variables (int and double)
        int num1 = 15;
        double num2 = 4.0;
        
        System.out.println("Mixed Variables (int and double):");
        System.out.println("  int num1 = " + num1);
        System.out.println("  double num2 = " + num2);
        System.out.println("  num1 / num2 = " + (num1 / num2));
        System.out.println("  Result: " + (num1 / num2));
        System.out.println("  Explanation: int is auto-converted to double\n");
        
        
        // ──────────────────────────────────────────────────────────────
        // IMPORTANT COMPARISON
        // ──────────────────────────────────────────────────────────────
        
        System.out.println("\n" + "═".repeat(53));
        System.out.println("⚠️  COMMON MISTAKE - Integer Division with int Variables");
        System.out.println("═".repeat(53) + "\n");
        
        int x = 10;
        int y = 3;
        int intResult = x / y;  // Integer division
        double wrongResult = x / y;  // STILL integer division!
        
        System.out.println("  int x = " + x);
        System.out.println("  int y = " + y);
        System.out.println("  int intResult = x / y = " + intResult);
        System.out.println("  double wrongResult = x / y = " + wrongResult);
        System.out.println("  ❌ WRONG: Both give 3 (integer division)\n");
        
        System.out.println("  ✅ CORRECT WAYS:");
        double correctResult1 = (double) x / y;  // Explicit casting
        double correctResult2 = x / (double) y;  // Cast one operand
        double correctResult3 = 1.0 * x / y;    // Multiply by 1.0
        
        System.out.println("  double correctResult1 = (double) x / y = " + correctResult1);
        System.out.println("  double correctResult2 = x / (double) y = " + correctResult2);
        System.out.println("  double correctResult3 = 1.0 * x / y = " + correctResult3);
        System.out.println("  ✓ All give 3.333... (floating division)\n");
        
        
        // ──────────────────────────────────────────────────────────────
        // SUMMARY TABLE
        // ──────────────────────────────────────────────────────────────
        
        System.out.println("\n" + "═".repeat(53));
        System.out.println("📊 SUMMARY TABLE");
        System.out.println("═".repeat(53) + "\n");
        
        System.out.println("Division Type          | Operands        | Result");
        System.out.println("─────────────────────────────────────────────────────");
        System.out.println("Integer Division       | 10 / 3 (int)    | " + (10 / 3));
        System.out.println("Floating Division      | 10.0 / 3.0      | " + (10.0 / 3.0));
        System.out.println("Mixed (int / double)   | 10 / 3.0        | " + (10 / 3.0));
        System.out.println("Cast to double         | (double)10 / 3  | " + ((double)10 / 3));
        System.out.println();
    }
}