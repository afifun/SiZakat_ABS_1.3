package ABS.StdLib;
// abslang.abs:73:1: 
public final class union_f implements abs.backend.java.lib.types.ABSFunction {
    private union_f() { }
    public static <A extends abs.backend.java.lib.types.ABSValue>ABS.StdLib.Set<A> apply(ABS.StdLib.Set<A> set1, ABS.StdLib.Set<A> set2) {
        return new abs.backend.java.lib.expr.Case() {
            public ABS.StdLib.Set<A> of(final ABS.StdLib.Set<A> set1, final ABS.StdLib.Set<A> set2, final ABS.StdLib.Set<A> __ABS_value) {
                final abs.backend.java.lib.expr.PatternBinding __ABS_binding0 = new abs.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Set_EmptySet.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.StdLib.Set<A> execute() { return set2; }
                }.execute();
                final abs.backend.java.lib.expr.PatternBinding __ABS_binding1 = new abs.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Set_Insert.class,new abs.backend.java.lib.expr.PatternVariable("a"),new abs.backend.java.lib.expr.PatternVariable("s")).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public ABS.StdLib.Set<A> execute(final A a, final ABS.StdLib.Set<A> s) { return ABS.StdLib.union_f.apply(s, ABS.StdLib.insertElement_f.apply(set2, a)); }
                }.execute((A) __ABS_binding1.getBinding(0),(ABS.StdLib.Set<A>) __ABS_binding1.getBinding(1));
                throw new abs.backend.java.lib.expr.UnmatchedCaseException("abslang.abs:74:4:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(set1, set2, set1);
    }
}
