package ABS.DC;
// abslang.abs:457:19: 
public final class capacity_f implements abs.backend.java.lib.types.ABSFunction {
    private capacity_f() { }
    public static abs.backend.java.lib.types.ABSInteger apply(ABS.DC.DCData data) {
        return new abs.backend.java.lib.expr.Case() {
            public abs.backend.java.lib.types.ABSInteger of(final ABS.DC.DCData data, final ABS.DC.DCData __ABS_value) {
                final abs.backend.java.lib.expr.PatternBinding __ABS_binding0 = new abs.backend.java.lib.expr.PatternConstructor(ABS.DC.DCData_CPU.class,new abs.backend.java.lib.expr.PatternVariable("res")).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public abs.backend.java.lib.types.ABSInteger execute(final abs.backend.java.lib.types.ABSInteger res) { return res; }
                }.execute((abs.backend.java.lib.types.ABSInteger) __ABS_binding0.getBinding(0));
                throw new abs.backend.java.lib.expr.UnmatchedCaseException("abslang.abs:457:19:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(data, data);
    }
}
