package ABS.StdLib;
// abslang.abs:17:1: 
public final class max_f implements abs.backend.java.lib.types.ABSFunction {
    private max_f() { }
    public static abs.backend.java.lib.types.ABSRational apply(abs.backend.java.lib.types.ABSRational a, abs.backend.java.lib.types.ABSRational b) {
        return a.gt(b).toBoolean() ? a : b;
    }
}
