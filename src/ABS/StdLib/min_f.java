package ABS.StdLib;
// abslang.abs:18:1: 
public final class min_f implements abs.backend.java.lib.types.ABSFunction {
    private min_f() { }
    public static abs.backend.java.lib.types.ABSRational apply(abs.backend.java.lib.types.ABSRational a, abs.backend.java.lib.types.ABSRational b) {
        return a.lt(b).toBoolean() ? a : b;
    }
}
