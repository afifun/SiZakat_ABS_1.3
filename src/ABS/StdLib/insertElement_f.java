package ABS.StdLib;
// abslang.abs:83:1: 
public final class insertElement_f implements abs.backend.java.lib.types.ABSFunction {
    private insertElement_f() { }
    public static <A extends abs.backend.java.lib.types.ABSValue>ABS.StdLib.Set<A> apply(ABS.StdLib.Set<A> xs, A e) {
        return new abs.backend.java.lib.expr.Case() {
            public ABS.StdLib.Set<A> of(final A e, final ABS.StdLib.Set<A> xs, final abs.backend.java.lib.types.ABSBool __ABS_value) {
                final abs.backend.java.lib.expr.PatternBinding __ABS_binding0 = new abs.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Bool_True.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.StdLib.Set<A> execute() { return xs; }
                }.execute();
                final abs.backend.java.lib.expr.PatternBinding __ABS_binding1 = new abs.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Bool_False.class).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public ABS.StdLib.Set<A> execute() { return new ABS.StdLib.Set_Insert(e, xs); }
                }.execute();
                throw new abs.backend.java.lib.expr.UnmatchedCaseException("abslang.abs:84:3:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(e, xs, ABS.StdLib.contains_f.apply(xs, e));
    }
}
