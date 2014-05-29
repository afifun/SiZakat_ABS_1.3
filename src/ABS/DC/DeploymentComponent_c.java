package ABS.DC;
// abslang.abs:479:1: 
public final class DeploymentComponent_c extends abs.backend.java.lib.runtime.ABSObject implements abs.backend.java.lib.types.ABSClass, ABS.DC.DeploymentComponent_i {
    private static final java.lang.String[] __fieldNames = new java.lang.String[] { "description", "cpu", "creationTime", "history", "totalhistory", "internalState", "initialized", "nextcpu" };
    public final java.util.List<java.lang.String> getFieldNames() { return java.util.Arrays.asList(__fieldNames); }
    private abs.backend.java.lib.types.ABSString description;
    private ABS.DC.DCData cpu;
    // abslang.abs:481:5: 
    private ABS.StdLib.Time creationTime;
    // abslang.abs:482:5: 
    private ABS.StdLib.List<abs.backend.java.lib.types.ABSInteger> history;
    // abslang.abs:483:5: 
    private ABS.StdLib.List<abs.backend.java.lib.types.ABSInteger> totalhistory;
    // abslang.abs:484:5: 
    private abs.backend.java.lib.types.ABSInteger internalState;
    // abslang.abs:485:5: 
    private abs.backend.java.lib.types.ABSBool initialized;
    // abslang.abs:486:5: 
    private ABS.DC.DCData nextcpu;
    public DeploymentComponent_c(abs.backend.java.lib.types.ABSString description, ABS.DC.DCData cpu) {
        this.description = description;
        this.cpu = cpu;
        getCOG().objectCreated(this);
    }
    protected final void __ABS_init() {
        this.creationTime = ABS.StdLib.now_f.apply();this.history = new ABS.StdLib.List_Nil();this.totalhistory = new ABS.StdLib.List_Nil();this.internalState = abs.backend.java.lib.types.ABSInteger.fromString("0");this.initialized = abs.backend.java.lib.types.ABSBool.FALSE;this.nextcpu = DeploymentComponent_c.this.cpu; {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",487);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().newStackFrame(this,"init block");
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",488);
            DeploymentComponent_c.this.initialized = abs.backend.java.lib.types.ABSBool.TRUE;
        }
        getCOG().objectInitialized(this);
    }
    protected final abs.backend.java.lib.types.ABSValue getFieldValue(java.lang.String __ABS_fieldName) throws java.lang.NoSuchFieldException {
        if ("description".equals(__ABS_fieldName)) return description;
        if ("cpu".equals(__ABS_fieldName)) return cpu;
        if ("creationTime".equals(__ABS_fieldName)) return creationTime;
        if ("history".equals(__ABS_fieldName)) return history;
        if ("totalhistory".equals(__ABS_fieldName)) return totalhistory;
        if ("internalState".equals(__ABS_fieldName)) return internalState;
        if ("initialized".equals(__ABS_fieldName)) return initialized;
        if ("nextcpu".equals(__ABS_fieldName)) return nextcpu;
        return super.getFieldValue(__ABS_fieldName);
    }
    public final java.lang.String getClassName() { return "DeploymentComponent"; }
    public static final <T extends DeploymentComponent_c> T createNewCOG(abs.backend.java.lib.types.ABSString description, ABS.DC.DCData cpu) { return (T)DeploymentComponent_c.__ABS_createNewCOG(null, null, description, cpu); }
    public static final <T extends DeploymentComponent_c> T __ABS_createNewCOG(abs.backend.java.lib.runtime.ABSObject __ABS_source, abs.backend.java.scheduling.UserSchedulingStrategy strategy, abs.backend.java.lib.types.ABSString description, ABS.DC.DCData cpu) {
        final abs.backend.java.lib.runtime.ABSRuntime __ABS_runtime = abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime();
        final abs.backend.java.lib.runtime.COG __ABS_cog = strategy == null ? __ABS_runtime.createCOG(DeploymentComponent_c.class) : __ABS_runtime.createCOG(DeploymentComponent_c.class, strategy);
        final abs.backend.java.lib.runtime.ABSThread __ABS_thread = abs.backend.java.lib.runtime.ABSRuntime.getCurrentThread();
        final abs.backend.java.lib.runtime.COG __ABS_oldCOG = abs.backend.java.lib.runtime.ABSRuntime.getCurrentCOG();
        final abs.backend.java.lib.runtime.Task __ABS_sendingTask = abs.backend.java.lib.runtime.ABSRuntime.getCurrentTask();
        __ABS_thread.setCOG(__ABS_cog);
        try {
            DeploymentComponent_c __ABS_result = new DeploymentComponent_c(description, cpu);
            ;
            __ABS_runtime.cogCreated(__ABS_result);
            __ABS_cog.getScheduler().addTask(new abs.backend.java.lib.runtime.Task(new abs.backend.java.lib.runtime.ABSInitObjectCall(__ABS_sendingTask,__ABS_source,__ABS_result)));
            return (T)__ABS_result;
        } finally {
            __ABS_thread.setCOG(__ABS_oldCOG);
        }
    }
    public static final <T extends DeploymentComponent_c> T createNewObject(abs.backend.java.lib.types.ABSString description, ABS.DC.DCData cpu) { return (T)DeploymentComponent_c.__ABS_createNewObject(null, description, cpu); }
    public static final <T extends DeploymentComponent_c> T __ABS_createNewObject(abs.backend.java.lib.runtime.ABSObject __ABS_source, abs.backend.java.lib.types.ABSString description, ABS.DC.DCData cpu) {
        DeploymentComponent_c __ABS_result = new DeploymentComponent_c(description, cpu);
        __ABS_result.__ABS_init();
        return (T)__ABS_result;
    }
    // abslang.abs:490:5: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.DC.DCData> async_available() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
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
                    return "available";
                }
                public Object execute() {
                    return target.available();
                }
            }.init())
        ;
    }
    // abslang.abs:490:5: 
    public final ABS.DC.DCData available() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "available");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",490);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",491);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.expr.BinOp.eq(DeploymentComponent_c.this.cpu,new ABS.DC.DCData_InfCPU()).toBoolean() ? new ABS.DC.DCData_InfCPU() : new ABS.DC.DCData_CPU(ABS.DC.capacity_f.apply(DeploymentComponent_c.this.cpu).subtract(DeploymentComponent_c.this.internalState));
        }
    }
    // abslang.abs:493:5: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSRational> async_load(abs.backend.java.lib.types.ABSInteger periods) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSInteger arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSInteger _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "load";
                }
                public Object execute() {
                    return target.load(arg0
                    .truncate());
                }
            }.init(periods))
        ;
    }
    // abslang.abs:493:5: 
    public final abs.backend.java.lib.types.ABSRational load(abs.backend.java.lib.types.ABSInteger periods) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "load");
            __ABS_currentTask.setLocalVariable("periods",periods);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",493);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",494);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.expr.BinOp.eq(DeploymentComponent_c.this.cpu,new ABS.DC.DCData_InfCPU()).toBoolean() ? abs.backend.java.lib.types.ABSInteger.fromString("0") : ABS.DC.averageDivsN_f.apply(DeploymentComponent_c.this.history, DeploymentComponent_c.this.totalhistory, periods);
        }
    }
    // abslang.abs:497:5: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.DC.DCData> async_total() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
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
                    return "total";
                }
                public Object execute() {
                    return target.total();
                }
            }.init())
        ;
    }
    // abslang.abs:497:5: 
    public final ABS.DC.DCData total() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "total");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",497);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",498);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return DeploymentComponent_c.this.cpu;
        }
    }
    // abslang.abs:504:5: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_transfer(ABS.DC.DeploymentComponent_i target, abs.backend.java.lib.types.ABSInteger amount) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                ABS.DC.DeploymentComponent_i arg0;
                abs.backend.java.lib.types.ABSInteger arg1;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0,arg1});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(ABS.DC.DeploymentComponent_i _arg0,abs.backend.java.lib.types.ABSInteger _arg1) {
                    arg0 = _arg0;
                    arg1 = _arg1;
                    return this;
                }
                public java.lang.String methodName() {
                    return "transfer";
                }
                public Object execute() {
                    return target.transfer(arg0
                    ,arg1
                    .truncate());
                }
            }.init(target, amount))
        ;
    }
    // abslang.abs:504:5: 
    public final abs.backend.java.lib.types.ABSUnit transfer(ABS.DC.DeploymentComponent_i target, abs.backend.java.lib.types.ABSInteger amount) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "transfer");
            __ABS_currentTask.setLocalVariable("target",target);
            __ABS_currentTask.setLocalVariable("amount",amount);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",504);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",505);
            decrementResources(amount);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",506);
            abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_i>(
                this,
                abs.backend.java.lib.runtime.ABSRuntime.checkForNull(target),
                new ABS.StdLib.Duration_InfDuration(),
                new ABS.StdLib.Duration_InfDuration(),
                abs.backend.java.lib.types.ABSBool.FALSE) {
                    abs.backend.java.lib.types.ABSInteger arg0;
                    public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                        return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                            arg0});
                    }
                    public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSInteger _arg0) {
                        arg0 = _arg0;
                        return this;
                    }
                    public java.lang.String methodName() {
                        return "incrementResources";
                    }
                    public Object execute() {
                        return target.incrementResources(arg0
                        .truncate());
                    }
                }.init(amount))
            ;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",507);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // abslang.abs:509:5: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_decrementResources(abs.backend.java.lib.types.ABSInteger amount) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSInteger arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSInteger _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "decrementResources";
                }
                public Object execute() {
                    return target.decrementResources(arg0
                    .truncate());
                }
            }.init(amount))
        ;
    }
    // abslang.abs:509:5: 
    public final abs.backend.java.lib.types.ABSUnit decrementResources(abs.backend.java.lib.types.ABSInteger amount) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "decrementResources");
            __ABS_currentTask.setLocalVariable("amount",amount);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",509);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",510);
            if (abs.backend.java.lib.expr.BinOp.eq(DeploymentComponent_c.this.nextcpu,new ABS.DC.DCData_InfCPU()).toBoolean()) {
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",511);
                ;
            }
            else {
                 {
                    if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",512);
                    if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",513);
                    abs.backend.java.lib.types.ABSInteger capacity = ABS.DC.capacity_f.apply(DeploymentComponent_c.this.cpu);
                    if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("capacity",capacity);
                    if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",514);
                    if (!capacity.gtEq(amount).toBoolean()) throw new abs.backend.java.lib.runtime.ABSAssertException("abslang.abs:514:13:  Assertion failed");
                    if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",515);
                    DeploymentComponent_c.this.nextcpu = new ABS.DC.DCData_CPU(capacity.subtract(amount));
                }
            }
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",517);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // abslang.abs:518:5: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_incrementResources(abs.backend.java.lib.types.ABSInteger amount) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSInteger arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSInteger _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "incrementResources";
                }
                public Object execute() {
                    return target.incrementResources(arg0
                    .truncate());
                }
            }.init(amount))
        ;
    }
    // abslang.abs:518:5: 
    public final abs.backend.java.lib.types.ABSUnit incrementResources(abs.backend.java.lib.types.ABSInteger amount) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "incrementResources");
            __ABS_currentTask.setLocalVariable("amount",amount);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",518);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",519);
            if (abs.backend.java.lib.expr.BinOp.eq(DeploymentComponent_c.this.nextcpu,new ABS.DC.DCData_InfCPU()).toBoolean()) {
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",520);
                ;
            }
            else {
                 {
                    if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",521);
                    if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",522);
                    DeploymentComponent_c.this.nextcpu = new ABS.DC.DCData_CPU(ABS.DC.capacity_f.apply(DeploymentComponent_c.this.cpu).add(amount));
                }
            }
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\nope\\eclipse-EE\\plugins\\eu.hatsproject.abs.compiler_1.2.3.201304251222-svn19898\\abs\\lang\\abslang.abs",524);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
}
