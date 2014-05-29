package ABS.Meta;
// abslang.abs:598:1: 
public interface ProductLine_i extends abs.backend.java.lib.types.ABSInterface {
    // abslang.abs:599:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_applyDelta(abs.backend.java.lib.types.ABSString s);
    // abslang.abs:599:5: 
    public  abs.backend.java.lib.types.ABSUnit applyDelta(abs.backend.java.lib.types.ABSString s);
    // abslang.abs:600:5: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.Meta.Product_i> async_getCurrentProduct();
    // abslang.abs:600:5: 
    public  ABS.Meta.Product_i getCurrentProduct();
    // abslang.abs:601:5: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<ABS.Meta.Product_i>> async_getConfigurableProducts();
    // abslang.abs:601:5: 
    public  ABS.StdLib.List<ABS.Meta.Product_i> getConfigurableProducts();
    // abslang.abs:602:5: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.Meta.Product_i> async_getConfigurableProduct(abs.backend.java.lib.types.ABSString name);
    // abslang.abs:602:5: 
    public  ABS.Meta.Product_i getConfigurableProduct(abs.backend.java.lib.types.ABSString name);
    // abslang.abs:603:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_configureProduct(ABS.Meta.Product_i s);
    // abslang.abs:603:5: 
    public  abs.backend.java.lib.types.ABSUnit configureProduct(ABS.Meta.Product_i s);
}
