public class DefaultValuesStaticLocal {
    
    // ═════════════════════════════════════════════════════════════════
    // STATIC VARIABLES (Class Level)
    // These have DEFAULT VALUES
    // ═════════════════════════════════════════════════════════════════
    
    static byte staticByte;              // Default: 0
    static short staticShort;            // Default: 0
    static int staticInt;                // Default: 0
    static long staticLong;              // Default: 0L
    static float staticFloat;            // Default: 0.0f
    static double staticDouble;          // Default: 0.0d
    static boolean staticBoolean;        // Default: false
    static char staticChar;              // Default: '\u0000' (null character)
    static String staticString;          // Default: null
    static Object staticObject;          // Default: null
    
    
    public static void main(String[] args) {
        
        //System.out.println("════════════════════════════════════════════════════════════");
        System.out.println("       DEFAULT VALUES OF VARIABLES IN JAVA");
      //  System.out.println("════════════════════════════════════════════════════════════\n");
        
        
        // ─────────────────────────────────────────────────────────────
        // SECTION 1: STATIC VARIABLES
        // ─────────────────────────────────────────────────────────────
        
        System.out.println("1️⃣  STATIC VARIABLES (Class Level)");
        System.out.println("   ✓ Have DEFAULT VALUES (automatically initialized)");
        //System.out.println("─────────────────────────────────────────────────────────────\n");
        
        System.out.println("Primitive Types:");
        System.out.println("  static byte staticByte           = " + staticByte);
        System.out.println("  static short staticShort         = " + staticShort);
        System.out.println("  static int staticInt             = " + staticInt);
        System.out.println("  static long staticLong           = " + staticLong);
        System.out.println("  static float staticFloat         = " + staticFloat);
        System.out.println("  static double staticDouble       = " + staticDouble);
        System.out.println("  static boolean staticBoolean     = " + staticBoolean);
        System.out.println("  static char staticChar           = '" + staticChar + "' (null character)\n");
        
        System.out.println("Reference Types:");
        System.out.println("  static String staticString       = " + staticString);
        System.out.println("  static Object staticObject       = " + staticObject);
        System.out.println();
        
        
        // Show as ASCII value for char
        System.out.println("Details:");
        System.out.println("  Character code for staticChar: " + (int)staticChar);
        System.out.println("  (\\u0000 is the null character, code 0)\n");
        
        
        System.out.println("\n" + "═".repeat(61));
        System.out.println("2️⃣  LOCAL VARIABLES (Inside Methods)");
        System.out.println("   ✗ DO NOT have default values (must initialize manually)");
        System.out.println("═".repeat(61) + "\n");
        
        demonstrateLocalVariables();
        
        
        System.out.println("\n" + "═".repeat(61));
        System.out.println("3️⃣  INSTANCE VARIABLES (Object Level)");
        System.out.println("   ✓ Have DEFAULT VALUES (same as static)");
        System.out.println("═".repeat(61) + "\n");
        
        showInstanceVariableDefaults();
    }
    
    
    // Method to demonstrate LOCAL VARIABLES
    static void demonstrateLocalVariables() {
        
        System.out.println("Local Variables in a Method:");
        System.out.println("─────────────────────────────────────────────────────────────\n");
        
        // Example 1: Uninitialized local variable (COMPILE ERROR if used!)
        System.out.println("Example 1: Uninitialized Local Variables");
        System.out.println("─────────────────────────────────────────");
        
        int localInt;                    // Declared but NOT initialized
        double localDouble;              // Declared but NOT initialized
        String localString;              // Declared but NOT initialized
        
        System.out.println("  int localInt;          ← Declared but NOT initialized");
        System.out.println("  double localDouble;    ← Declared but NOT initialized");
        System.out.println("  String localString;    ← Declared but NOT initialized\n");
        
        System.out.println("❌ If you try to use them WITHOUT initialization:");
        System.out.println("   System.out.println(localInt);");
        System.out.println("   → COMPILE ERROR: variable might not have been initialized\n");
        
        
        // Example 2: Initialized local variables (WORKS!)
        System.out.println("Example 2: Initialized Local Variables");
        System.out.println("─────────────────────────────────────────");
        
        int initializedInt = 0;
        double initializedDouble = 0.0;
        String initializedString = null;
        boolean initializedBoolean = false;
        
        System.out.println("  int initializedInt = 0           = " + initializedInt);
        System.out.println("  double initializedDouble = 0.0   = " + initializedDouble);
        System.out.println("  String initializedString = null  = " + initializedString);
        System.out.println("  boolean initializedBoolean = false = " + initializedBoolean);
        System.out.println("\n✓ These work because they are EXPLICITLY initialized\n");
        
        
        // Example 3: Scope of local variables
        System.out.println("Example 3: Scope of Local Variables");
        System.out.println("─────────────────────────────────────────");
        
        {
            int blockVariable = 100;  // Local to this block
            System.out.println("  Inside block: blockVariable = " + blockVariable);
        }
        
        // System.out.println(blockVariable);  // ❌ COMPILE ERROR: out of scope
        System.out.println("  Outside block: blockVariable is OUT OF SCOPE\n");
    }
    
    
    // Method to show instance variable defaults
    static void showInstanceVariableDefaults() {
        
        DefaultValuesStaticLocal obj1 = new DefaultValuesStaticLocal();
        DefaultValuesStaticLocal obj2 = new DefaultValuesStaticLocal();
        
        System.out.println("Creating instance of DefaultValuesStaticLocal:");
        System.out.println("  DefaultValuesStaticLocal obj1 = new DefaultValuesStaticLocal();");
        System.out.println("  DefaultValuesStaticLocal obj2 = new DefaultValuesStaticLocal();\n");
        
        System.out.println("Instance Variables:");
        System.out.println("─────────────────────────────────────────────────────────────");
        System.out.println("  obj1.instByte      = " + obj1.instByte);
        System.out.println("  obj1.instInt       = " + obj1.instInt);
        System.out.println("  obj1.instDouble    = " + obj1.instDouble);
        System.out.println("  obj1.instBoolean   = " + obj1.instBoolean);
        System.out.println("  obj1.instString    = " + obj1.instString);
        System.out.println("  obj1.instArray     = " + obj1.instArray + "\n");
        
        System.out.println("  obj2.instByte      = " + obj2.instByte);
        System.out.println("  obj2.instInt       = " + obj2.instInt);
        System.out.println("  obj2.instDouble    = " + obj2.instDouble);
        System.out.println("  (Same defaults for all instances)\n");
        
        System.out.println("✓ Instance variables have DEFAULT VALUES:");
        System.out.println("  • Primitives → 0 (or false for boolean)");
        System.out.println("  • References → null\n");
    }
    
    
    // ═════════════════════════════════════════════════════════════════
    // INSTANCE VARIABLES (Object Level)
    // These also have DEFAULT VALUES (initialized when object is created)
    // ═════════════════════════════════════════════════════════════════
    
    byte instByte;              // Default: 0
    int instInt;                // Default: 0
    double instDouble;          // Default: 0.0
    boolean instBoolean;        // Default: false
    String instString;          // Default: null
    int[] instArray;            // Default: null
}