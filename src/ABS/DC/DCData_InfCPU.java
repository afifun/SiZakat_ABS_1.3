package ABS.DC;
// abslang.abs:456:15: 
public final class DCData_InfCPU extends DCData {
    public DCData_InfCPU() {
    }
    protected abs.backend.java.lib.types.ABSValue[] getArgs() { return new abs.backend.java.lib.types.ABSValue[] {  }; }
    public java.lang.String getConstructorName() { return "InfCPU";} 
    public abs.backend.java.lib.types.ABSBool eq(abs.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof DCData_InfCPU)) return abs.backend.java.lib.types.ABSBool.FALSE;
        DCData_InfCPU other = (DCData_InfCPU) o;
        return abs.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(abs.backend.java.lib.expr.PatternConstructor c, abs.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        return true;
    }
}
