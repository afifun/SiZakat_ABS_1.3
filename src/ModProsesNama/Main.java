package ModProsesNama;

import abs.backend.java.lib.types.ABSString;

public class Main extends abs.backend.java.lib.runtime.ABSObject {
	public static String hasil = "";
    public static void main(java.lang.String[] args) throws Exception {
        abs.backend.java.lib.runtime.StartUp.startup(args,Main.class);
    }
    public java.lang.String getClassName() { return "Main"; }
    public java.util.List<java.lang.String> getFieldNames() { return java.util.Collections.EMPTY_LIST; }
    public Main(abs.backend.java.lib.runtime.COG cog) { super(cog); }
    public abs.backend.java.lib.types.ABSUnit run() {
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\Kerjaan\\abs\\Zakat\\ABSJsp\\ProsesNama.abs",20);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().newStackFrame(this,"main block");
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\Kerjaan\\abs\\Zakat\\ABSJsp\\ProsesNama.abs",21);
            ModProsesNama.InterProsesNama_i pn = ModProsesNama.Nama_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("pn",pn);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\Kerjaan\\abs\\Zakat\\ABSJsp\\ProsesNama.abs",22);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(pn).setNama();
            ABSString tmp = pn.getNama();
            hasil = tmp.getString();
        }
        return abs.backend.java.lib.types.ABSUnit.UNIT;
    }
    public String getNama()
    {
    	return hasil;
    }
}
