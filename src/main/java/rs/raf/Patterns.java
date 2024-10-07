package rs.raf;

public class Patterns {

    public static final PatternType MAIN = new PatternType("main", "main");
    public static final PatternType IDENTIFIER = new PatternType("name", "[a-zA-Z_][a-zA-Z0-9_]*");
    public static final PatternType BRACKET = new PatternType("bracket", "\\[");
    public static final PatternType SLASH = new PatternType("slash", "/");
    public static final PatternType BACKSLASH = new PatternType("backslash", "\\\\");
    public static final PatternType LESS = new PatternType("less", "<");
    public static final PatternType MINUS_OPTIONAL = new PatternType("minus_optional", "-?");
    public static final PatternType NUMBER = new PatternType("number", "[0-9]+");
    public static final PatternType DOT = new PatternType("dot", "\\.");
    public static final PatternType DOUBLE = new PatternType(
        "double",
        MINUS_OPTIONAL.regex() + NUMBER.regex() + "(" + DOT.regex() + NUMBER.regex() + ")?"
    );

    //DECIMAL_POINT
}
