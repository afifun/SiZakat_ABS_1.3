package ModProsesNama;
// ProsesNama.abs:8:1: 
public final class Nama_c extends abs.backend.java.lib.runtime.ABSObject implements abs.backend.java.lib.types.ABSClass, ModProsesNama.InterProsesNama_i {
    private static final java.lang.String[] __fieldNames = new java.lang.String[] { "iniNama" };
    public final java.util.List<java.lang.String> getFieldNames() { return java.util.Arrays.asList(__fieldNames); }
    // ProsesNama.abs:10:2: 
    private abs.backend.java.lib.types.ABSString iniNama;
    public Nama_c() {
        getCOG().objectCreated(this);
    }
    protected final void __ABS_init() {
        getCOG().objectInitialized(this);
    }
    protected final abs.backend.java.lib.types.ABSValue getFieldValue(java.lang.String __ABS_fieldName) throws java.lang.NoSuchFieldException {
        if ("iniNama".equals(__ABS_fieldName)) return iniNama;
        return super.getFieldValue(__ABS_fieldName);
    }
    public final java.lang.String getClassName() { return "Nama"; }
    public static final <T extends Nama_c> T createNewCOG() { return (T)Nama_c.__ABS_createNewCOG(null, null); }
    public static final <T extends Nama_c> T __ABS_createNewCOG(abs.backend.java.lib.runtime.ABSObject __ABS_source, abs.backend.java.scheduling.UserSchedulingStrategy strategy) {
        final abs.backend.java.lib.runtime.ABSRuntime __ABS_runtime = abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime();
        final abs.backend.java.lib.runtime.COG __ABS_cog = strategy == null ? __ABS_runtime.createCOG(Nama_c.class) : __ABS_runtime.createCOG(Nama_c.class, strategy);
        final abs.backend.java.lib.runtime.ABSThread __ABS_thread = abs.backend.java.lib.runtime.ABSRuntime.getCurrentThread();
        final abs.backend.java.lib.runtime.COG __ABS_oldCOG = abs.backend.java.lib.runtime.ABSRuntime.getCurrentCOG();
        final abs.backend.java.lib.runtime.Task __ABS_sendingTask = abs.backend.java.lib.runtime.ABSRuntime.getCurrentTask();
        __ABS_thread.setCOG(__ABS_cog);
        try {
            Nama_c __ABS_result = new Nama_c();
            ;
            __ABS_runtime.cogCreated(__ABS_result);
            __ABS_cog.getScheduler().addTask(new abs.backend.java.lib.runtime.Task(new abs.backend.java.lib.runtime.ABSInitObjectCall(__ABS_sendingTask,__ABS_source,__ABS_result)));
            return (T)__ABS_result;
        } finally {
            __ABS_thread.setCOG(__ABS_oldCOG);
        }
    }
    public static final <T extends Nama_c> T createNewObject() { return (T)Nama_c.__ABS_createNewObject(null); }
    public static final <T extends Nama_c> T __ABS_createNewObject(abs.backend.java.lib.runtime.ABSObject __ABS_source) {
        Nama_c __ABS_result = new Nama_c();
        __ABS_result.__ABS_init();
        return (T)__ABS_result;
    }
    // ProsesNama.abs:11:2: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setNama() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<ModProsesNama.Nama_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                    });
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init() {
                    return this;
                }
                public java.lang.String methodName() {
                    return "setNama";
                }
                public Object execute() {
                    return target.setNama();
                }
            }.init())
        ;
    }
    // ProsesNama.abs:11:2: 
    public final abs.backend.java.lib.types.ABSUnit setNama() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setNama");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\Kerjaan\\abs\\Zakat\\ABSJsp\\ProsesNama.abs",12);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\Kerjaan\\abs\\Zakat\\ABSJsp\\ProsesNama.abs",13);
            Nama_c.this.iniNama = abs.backend.java.lib.types.ABSString.fromString("nove");
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\Kerjaan\\abs\\Zakat\\ABSJsp\\ProsesNama.abs",14);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // ProsesNama.abs:15:2: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_getNama() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<ModProsesNama.Nama_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                    });
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init() {
                    return this;
                }
                public java.lang.String methodName() {
                    return "getNama";
                }
                public Object execute() {
                    return target.getNama();
                }
            }.init())
        ;
    }
    // ProsesNama.abs:15:2: 
    public final abs.backend.java.lib.types.ABSString getNama() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getNama");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\Kerjaan\\abs\\Zakat\\ABSJsp\\ProsesNama.abs",16);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\Kerjaan\\abs\\Zakat\\ABSJsp\\ProsesNama.abs",17);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return Nama_c.this.iniNama;
        }
    }
}
