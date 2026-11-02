public class InstanceVariableDefaults {
    
    // ═════════════════════════════════════════════════════════════════
    // INSTANCE VARIABLES - Default Values
    // These are initialized to default values when object is created
    // ═════════════════════════════════════════════════════════════════
    
    // Primitive Types (Default to 0 or false)
    byte instanceByte;
    short instanceShort;
    int instanceInt;
    long instanceLong;
    float instanceFloat;
    double instanceDouble;
    boolean instanceBoolean;
    char instanceChar;
    
    // Reference Types (Default to null)
    String instanceString;
    Object instanceObject;
    int[] instanceArray;
    InstanceVariableDefaults instanceObject2;
    
    // Instance variables with explicit initialization (for comparison)
    int explicitInt = 100;
    String explicitString = "Initialized";
    
    
    public static void main(String[] args) {
        
        System.out.println("════════════════════════════════════════════════════════════");
        System.out.println("       INSTANCE VARIABLE DEFAULT VALUES");
        System.out.println("════════════════════════════════════════════════════════════\n");
        
        
        // Create first instance
        System.out.println("Creating Object 1:");
        System.out.println("─────────────────────────────────────────────────────────────");
        InstanceVariableDefaults obj1 = new InstanceVariableDefaults();
        
        System.out.println("InstanceVariableDefaults obj1 = new InstanceVariableDefaults();\n");
        
        System.out.println("Instance Variables in obj1 (After Creation):");
        System.out.println("─────────────────────────────────────────────────────────────\n");
        
        System.out.println("Primitive Types:");
        System.out.println("  obj1.instanceByte      = " + obj1.instanceByte + 
                          " (default for byte)");
        System.out.println("  obj1.instanceShort     = " + obj1.instanceShort + 
                          " (default for short)");
        System.out.println("  obj1.instanceInt       = " + obj1.instanceInt + 
                          " (default for int)");
        System.out.println("  obj1.instanceLong      = " + obj1.instanceLong + 
                          " (default for long)");
        System.out.println("  obj1.instanceFloat     = " + obj1.instanceFloat + 
                          " (default for float)");
        System.out.println("  obj1.instanceDouble    = " + obj1.instanceDouble + 
                          " (default for double)");
        System.out.println("  obj1.instanceBoolean   = " + obj1.instanceBoolean + 
                          " (default for boolean)");
        System.out.println("  obj1.instanceChar      = '" + obj1.instanceChar + 
                          "' (null character, code: " + (int)obj1.instanceChar + ")\n");
        
        System.out.println("Reference Types:");
        System.out.println("  obj1.instanceString    = " + obj1.instanceString + 
                          " (default for String)");
        System.out.println("  obj1.instanceObject    = " + obj1.instanceObject + 
                          " (default for Object)");
        System.out.println("  obj1.instanceArray     = " + obj1.instanceArray + 
                          " (default for array)");
        System.out.println("  obj1.instanceObject2   = " + obj1.instanceObject2 + 
                          " (default for custom object)\n");
        
        System.out.println("With Explicit Initialization:");
        System.out.println("  obj1.explicitInt       = " + obj1.explicitInt + 
                          " (explicitly initialized)");
        System.out.println("  obj1.explicitString    = " + obj1.explicitString + 
                          " (explicitly initialized)\n");
        
        
        // Create second instance
        System.out.println("\n" + "═".repeat(61));
        System.out.println("Creating Object 2:");
        System.out.println("─────────────────────────────────────────────────────────────");
        InstanceVariableDefaults obj2 = new InstanceVariableDefaults();
        
        System.out.println("InstanceVariableDefaults obj2 = new InstanceVariableDefaults();\n");
        
        System.out.println("Instance Variables in obj2 (After Creation):");
        System.out.println("─────────────────────────────────────────────────────────────\n");
        
        System.out.println("  obj2.instanceInt       = " + obj2.instanceInt);
        System.out.println("  obj2.instanceString    = " + obj2.instanceString);
        System.out.println("  obj2.explicitInt       = " + obj2.explicitInt);
        System.out.println("\n✓ Every object gets default values (same as obj1)\n");
        
        
        // Modify instance variables
        System.out.println("\n" + "═".repeat(61));
        System.out.println("Modifying Instance Variables:");
        System.out.println("─────────────────────────────────────────────────────────────\n");
        
        System.out.println("obj1.instanceInt = 50;");
        obj1.instanceInt = 50;
        
        System.out.println("obj1.instanceString = \"Hello\";");
        obj1.instanceString = "Hello";
        
        System.out.println("obj1.instanceArray = new int[5];");
        obj1.instanceArray = new int[5];
        
        System.out.println("obj1.instanceBoolean = true;\n");
        obj1.instanceBoolean = true;
        
        System.out.println("After modification:");
        System.out.println("  obj1.instanceInt       = " + obj1.instanceInt);
        System.out.println("  obj1.instanceString    = " + obj1.instanceString);
        System.out.println("  obj1.instanceArray     = " + obj1.instanceArray);
        System.out.println("  obj1.instanceBoolean   = " + obj1.instanceBoolean);
        System.out.println("  obj1.instanceArray[0]  = " + obj1.instanceArray[0] + 
                          " (array elements default to 0)\n");
        
        
        // Verify obj2 is unchanged
        System.out.println("obj2 remains unchanged:");
        System.out.println("  obj2.instanceInt       = " + obj2.instanceInt);
        System.out.println("  obj2.instanceString    = " + obj2.instanceString);
        System.out.println("  obj2.instanceArray     = " + obj2.instanceArray);
        System.out.println("  obj2.instanceBoolean   = " + obj2.instanceBoolean);
        System.out.println("\n✓ Each object has its own separate instance variables\n");
        
        
        // Summary table
        System.out.println("\n" + "═".repeat(61));
        System.out.println("DEFAULT VALUES SUMMARY");
        System.out.println("═".repeat(61) + "\n");
        
        System.out.println("INSTANCE VARIABLES:");
        System.out.println("─────────────────────────────────────────────────────────────");
        System.out.println("Type              | Default Value");
        System.out.println("──────────────────┼──────────────────────────");
        System.out.println("byte              | 0");
        System.out.println("short             | 0");
        System.out.println("int               | 0");
        System.out.println("long              | 0");
        System.out.println("float             | 0.0");
        System.out.println("double            | 0.0");
        System.out.println("boolean           | false");
        System.out.println("char              | '\\u0000' (null character)");
        System.out.println("String/Reference  | null");
        System.out.println("Array             | null (until initialized)");
        System.out.println();
        
        
        // Comparison with other variable types
        System.out.println("\n" + "═".repeat(61));
        System.out.println("COMPARISON: Different Variable Types");
        System.out.println("═".repeat(61) + "\n");
        
        System.out.println("Variable Type      | Has Default? | Auto-Initialized?");
        System.out.println("───────────────────┼──────────────┼──────────────────");
        System.out.println("Static             | ✓ YES        | ✓ YES");
        System.out.println("Instance           | ✓ YES        | ✓ YES");
        System.out.println("Local              | ✗ NO         | ✗ NO (must initialize)");
        System.out.println("Method Parameter   | ✗ NO         | ✓ YES (passed value)");
        System.out.println();
    }
}


// ═══════════════════════════════════════════════════════════════════════
// ADDITIONAL CLASS TO SHOW INHERITANCE OF DEFAULT VALUES
// ═══════════════════════════════════════════════════════════════════════

class ParentClass {
    int parentInt;           // Default: 0
    String parentString;     // Default: null
}


class ChildClass extends ParentClass {
    int childInt;            // Default: 0
    double childDouble;      // Default: 0.0
    
    void showInheritedDefaults() {
        System.out.println("\nInherited Instance Variables in Child:");
        System.out.println("  parentInt = " + parentInt + " (from parent)");
        System.out.println("  parentString = " + parentString + " (from parent)");
        System.out.println("  childInt = " + childInt + " (child's own)");
        System.out.println("  childDouble = " + childDouble + " (child's own)");
    }
}