package ABS.DC;
// abslang.abs:456:1: 
public abstract class DCData extends abs.backend.java.lib.types.ABSDataType {
    public final boolean isInfCPU() { return this instanceof DCData_InfCPU; }
    public final DCData_InfCPU toInfCPU() { return (DCData_InfCPU) this; }
    public final boolean isCPU() { return this instanceof DCData_CPU; }
    public final DCData_CPU toCPU() { return (DCData_CPU) this; }
}
