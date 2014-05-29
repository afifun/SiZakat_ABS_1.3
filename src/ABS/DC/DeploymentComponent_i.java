package ABS.DC;
// abslang.abs:470:1: 
public interface DeploymentComponent_i extends abs.backend.java.lib.types.ABSInterface {
    // abslang.abs:471:5: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.DC.DCData> async_available();
    // abslang.abs:471:5: 
    public  ABS.DC.DCData available();
    // abslang.abs:472:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSRational> async_load(abs.backend.java.lib.types.ABSInteger periods);
    // abslang.abs:472:5: 
    public  abs.backend.java.lib.types.ABSRational load(abs.backend.java.lib.types.ABSInteger periods);
    // abslang.abs:473:5: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.DC.DCData> async_total();
    // abslang.abs:473:5: 
    public  ABS.DC.DCData total();
    // abslang.abs:474:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_transfer(ABS.DC.DeploymentComponent_i target, abs.backend.java.lib.types.ABSInteger amount);
    // abslang.abs:474:5: 
    public  abs.backend.java.lib.types.ABSUnit transfer(ABS.DC.DeploymentComponent_i target, abs.backend.java.lib.types.ABSInteger amount);
    // abslang.abs:475:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_decrementResources(abs.backend.java.lib.types.ABSInteger amount);
    // abslang.abs:475:5: 
    public  abs.backend.java.lib.types.ABSUnit decrementResources(abs.backend.java.lib.types.ABSInteger amount);
    // abslang.abs:476:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_incrementResources(abs.backend.java.lib.types.ABSInteger amount);
    // abslang.abs:476:5: 
    public  abs.backend.java.lib.types.ABSUnit incrementResources(abs.backend.java.lib.types.ABSInteger amount);
}
