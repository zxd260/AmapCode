package defpackage;

import java.util.HashMap;

/* renamed from: cwb reason: default package */
/* compiled from: ProtocolConstants */
public final class cwb {
    public static short A = 776;
    public static short B = 777;
    public static short C = 778;
    public static short D = 779;
    public static short E = 780;
    public static short F = 781;
    public static short G = 1025;
    public static short H = 1026;
    public static short I = 1027;
    public static short J = 1028;
    public static short K = 1029;
    public static short L = 1030;
    public static short M = 1031;
    public static short N = 1032;
    public static short O = 1033;
    public static short P = 1034;
    public static short Q = 1035;
    public static short R = 1036;
    public static short S = 1037;
    public static short T = 1038;
    public static String U = "startupBegin";
    public static String V = "startupEnd time:u8,bootType:u1,startTimeStamp:u8,boot1Duration:u8,totalPss:u4,nativePss:u4,dalvikPss:u4,cpuUsageOfApp:u2,cpuUsageOfDevice:u2";
    public static String W = "foreground";
    public static String X = "background";
    public static String Y = "runtimeTaskBegin taskName:u4:u1*";
    public static String Z = "runtimeTaskEnd taskName:u4:u1*";
    public static short a = 1;
    public static String aA = "activityLeak activityName:u4:u1*,chain:u4:u1*,leakSize:u8";
    public static String aB = "BlockOrCloseGuard activityName:u4:u1*,threadName:u4:u1*,typeString:u4:u1*,stacks:u4:u1*,type:u8,size:u8";
    public static String aC = "activityload activityName:u4:u1*,CpuCore:u4:u1*,APILevel:u4:u1*,IsLowMemroy:u4:u1*,MemoryLevel:u4:u1*,onCreate:u4:u1*,firstCreate:u4:u1*,isHotLauncher:u4:u1*,Info:u4:u1*,StayTime:u8,JankTime:u8,IdleTime:u8,FrameTime:u8,JankCount:u8,FrameCount:u8,DeviceMem:u8,BadCountOne:u8,BadCountTwo:u8,BadCountThree:u8,BadCountFour:u8,BadCountFive:u8,BadCountSix:u8,BadCountSeven:u8,BadCountEight:u8,BadCountNine:u8,BadCountTen:u8,BadCountEleven:u8,BadCountTwelve:u8,loadTime:u8,EnterIdleTime:u8,CpuMaxFreq:u8,DeviceAvailMem:u8,TotalUsedMem:u8,RemainMem:u8,NativeHeapSize:u8,JavaHeapSize:u8,SysCpuPercent:u8,PidCpuPercent:u8,SysLoadAvg:u8,RuntimeThread:u8,RunningThread:u8,ActivityScore:u8,DeviceScore:u8,SysScore:u8,PidScore:u8,RunningProgress:u8,RunningService:u8,StartActivityTime:u8,LoadSmUsedTime:u8,LoadSmCount:u8,LoadBadSmCount:u8,LoadBadSmUsedTime:u8,OpenFileCount:u8,TotalTx:u8,TotalRx:u8";
    public static String aD = "BitmapStatic APILevel:u4:u1*,activityName:u4:u1*,Info:u4:u1*,DeviceMem:u8,DeviceTotalAvailMem:u8,DeviceAvailMem:u8,TotalUsedMem:u8,RemainMem:u8,NativeHeapSize:u8,JavaHeapSize:u8,DeviceScore:u8,SysScore:u8,PidScore:u8,BitmapCount:u8,Bitmap565Count:u8,Bitmap8888Count:u8,BitmapByte:u8,Bitmap1M:u8,Bitmap2M:u8,Bitmap4M:u8,Bitmap6M:u8,Bitmap8M:u8,Bitmap10M:u8,Bitmap12M:u8,Bitmap15M:u8,Bitmap20M:u8,SizeScreen:u8,Size2Screen:u8,SizeHashScreen:u8,Size14Screen:u8";
    public static String aE = "CleanerStatic APILevel:u4:u1*,activityName:u4:u1*,Info:u4:u1*,ClassName:u4:u1*,DeviceMem:u8,DeviceTotalAvailMem:u8,DeviceAvailMem:u8,TotalUsedMem:u8,RemainMem:u8,NativeHeapSize:u8,JavaHeapSize:u8,DeviceScore:u8,SysScore:u8,PidScore:u8,ClassCount:u8";
    public static String aF = "OnGotoSleep CpuCore:u4:u1*,APILevel:u4:u1*,CpuUser:u4:u1*,Info:u4:u1*,DeviceTotalAvailMem:u8,DeviceMem:u8,CpuMaxFreq:u8,DeviceAvailMem:u8,TotalUsedMem:u8,RemainMem:u8,NativeHeapSize:u8,JavaHeapSize:u8,DeviceScore:u8,SysScore:u8,PidScore:u8,MaxCpuSys:u8,MaxCpuDev:u8,CpuSys:u8,CpuDev:u8,IsThread:u8";
    public static String aG = "ThreadIoTimes Thread:u4:u1*,Info:u4:u1*,DeviceScore:u8,SysScore:u8,PidScore:u8,RWTimes:u8,RTimes:u8,WTimes:u8,NetTimes:u8,nice:u8,ioWaitCount:u8,ioWaitTime:u8";
    public static String aH = "OnMemoryProblem APILevel:u4:u1*,ActivityName:u4:u1*,Info:u4:u1*,MemoryLevel:u4:u1*,Activitys:u4:u1*,Threads:u4:u1*,MemoryType:u4:u1*,DeviceMem:u8,TotalUsedMem:u8,DeviceScore:u8,SysScore:u8,PidScore:u8,RuntimeThread:u8,RunningThread:u8,OtherSo:u8,OtherJar:u8,OtherApk:u8,OtherTtf:u8,OtherDex:u8,OtherOat:u8,OtherArt:u8,OtherMap:u8,OtherAshmem:u8";
    public static String aI = "anr fileName:u4:u1*,stack:u4:u1*,activityname:u4:u1*,CpuCore:u4:u1*,APILevel:u4:u1*,IsLowMemroy:u4:u1*,MemoryLevel:u4:u1*,Info:u4:u1*,DeviceMem:u8,CpuMaxFreq:u8,TotalUsedMem:u8,SysCpuPercent:u8,PidCpuPercent:u8,SysLoadAvg:u8,RuntimeThread:u8,RunningThread:u8,DeviceScore:u8,SysScore:u8,PidScore:u8,RunningProgress:u8,RunningService:u8";
    public static String aJ = "ThreadPoolProblem activityName:u4:u1*,CpuCore:u4:u1*,APILevel:u4:u1*,IsLowMemroy:u4:u1*,MemoryLevel:u4:u1*,Info:u4:u1*,QueueThread:u4:u1*,PoolThread:u4:u1*,PoolThreadDetail:u4:u1*,QueueSize:u8,CoreSize:u8,MaxSize:u8,ActiveCount:u8,CompletedCount:u8,ThreadSize:u8,DeviceMem:u8,CpuMaxFreq:u8,DeviceAvailMem:u8,DeviceTotalAvailMem:u8,TotalUsedMem:u8,RemainMem:u8,NativeHeapSize:u8,JavaHeapSize:u8,SysCpuPercent:u8,PidCpuPercent:u8,SysLoadAvg:u8,RuntimeThread:u8,RunningThread:u8,DeviceScore:u8,SysScore:u8,PidScore:u8,RunningProgress:u8,RunningService:u8";
    public static String aK = "WhiteScreen activityName:u4:u1*,CpuCore:u4:u1*,APILevel:u4:u1*,IsLowMemroy:u4:u1*,MemoryLevel:u4:u1*,WidthPercent:u8,HeightPercent:u8,UseTime:u8,DeviceMem:u8,CpuMaxFreq:u8,DeviceAvailMem:u8,TotalUsedMem:u8,RemainMem:u8,NativeHeapSize:u8,JavaHeapSize:u8,SysCpuPercent:u8,PidCpuPercent:u8,SysLoadAvg:u8,RuntimeThread:u8,RunningThread:u8,DeviceScore:u8,SysScore:u8,PidScore:u8,RunningProgress:u8,RunningService:u8";
    public static String aL = "BootPerformance MemoryLevel:u4:u1*,BootType:u4:u1*,InBootStep:u4:u1*,TaskName:u4:u1*,DeviceMem:u8,DeviceAvailMem:u8,TotalUsedMem:u8,RemainMem:u8,NativeHeapSize:u8,JavaHeapSize:u8,SysCpuPercent:u8,PidCpuPercent:u8,SysLoadAvg:u8,ThreadCount:u8,DeviceScore:u8,SysScore:u8,PidScore:u8,RunningProgress:u8,RunningService:u8,PercentInBoot:u8,PercentInPid:u8,PercentInSystem:u8,PercentInDevice:u8,TaskUsedTime:u8,TaskCpuTime:u8";
    public static String aM = "";
    public static String aa = "actCreate page:u4:u1*,pageHashCode:u4:u1*";
    public static String ab = "actStart page:u4:u1*,pageHashCode:u4:u1*";
    public static String ac = "actResume page:u4:u1*,pageHashCode:u4:u1*";
    public static String ad = "actStop page:u4:u1*,pageHashCode:u4:u1*";
    public static String ae = "actPause page:u4:u1*,pageHashCode:u4:u1*";
    public static String af = "actDestory page:u4:u1*,pageHashCode:u4:u1*";
    public static String ag = "pageOpen page:u4:u1*,pageHashCode:u4:u1*,totalPss:u4,nativePss:u4,dalvikPss:u4,cpuUsageOfApp:u2,cpuUsageOfDevice:u2";
    public static String ah = "pageLoadFinish time:u8,page:u4:u1*,pageHashCode:u4:u1*,totalPss:u4,nativePss:u4,dalvikPss:u4,cpuUsageOfApp:u2,cpuUsageOfDevice:u2";
    public static String ai = "fps fps:u2,page:u4:u1*,pageHashCode:u4:u1*";
    public static String aj = "cpuUsage bundleInfo:u4:u1*,time:u8,cpuUsageOfApp:u2,cpuUsageOfDevice:u2";
    public static String ak = "memoryUsage bundleInfo:u4:u1*,time:u8,totalPss:u4,nativePss:u4,dalvikPss:u4";
    public static String al = "viewOpenPref time:u8,viewOpenPrefArr:u4:array:u4[page_name=u4:u1*|page_load_time=u4|page_stay_time=u4|page_start_stamp=u8]";
    public static String am = "launchTime launchTime:u4:u1*";
    public static String an = "memoryLeak detail:u4:json";
    public static String ao = "trace detail:u4:json";
    public static String ap = "bitmapMemory detail:u4:json";
    public static String aq = "viewHierarchy detail:u4:json";
    public static String ar = "componentTrace detail:u4:json";
    public static String as = "mainThreadIO detail:u4:json";
    public static String at = "resourceLeak detail:u4:u1*";
    public static String au = "backGroundAction detail:u4:json";
    public static String av = "fdOverflow detail:u4:json";
    public static String aw = "alarmBgSet detail:u4:json";
    public static String ax = "alarmBgLeak detail:u4:json";
    public static String ay = "jank jank:u4:json";
    public static String az = "LaunchAll isFirstInstall:u4:u1*,CpuCore:u4:u1*,APILevel:u4:u1*,IsLowMemory:u4:u1*,MemoryLevel:u4:u1*,BootType:u4:u1*,Info:u4:u1*,BootTotalTime:u8,loadTime:u8,BlockingGCCount:u8,CpuMaxFreq:u8,DeviceMem:u8,DeviceAvailMem:u8,TotalUsedMem:u8,RemainMem:u8,NativeHeapSize:u8,JavaHeapSize:u8,SysCpuPercent:u8,PidCpuPercent:u8,IOWaitTime:u8,SysLoadAvg:u8,RuntimeThread:u8,RunningThread:u8,DeviceScore:u8,SysScore:u8,PidScore:u8,RunningProgress:u8,RunningService:u8,PidPrepareTime:u8,AdvTime:u8";
    public static short b = 2;
    public static short c = 3;
    public static short d = 4;
    public static short e = 5;
    public static short f = 6;
    public static short g = 257;
    public static short h = 258;
    public static short i = 259;
    public static short j = 260;
    public static short k = 261;
    public static short l = 262;
    public static short m = 263;
    public static short n = 264;
    public static short o = 513;
    public static short p = 514;
    public static short q = 515;
    public static short r = 516;
    public static short s = 517;
    public static short t = 769;
    public static short u = 770;
    public static short v = 771;
    public static short w = 772;
    public static short x = 773;
    public static short y = 774;
    public static short z = 775;

    public static HashMap<String, String> a() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(Integer.toString(a), U);
        hashMap.put(Integer.toString(b), V);
        hashMap.put(Integer.toString(c), W);
        hashMap.put(Integer.toString(d), X);
        hashMap.put(Integer.toString(e), Y);
        hashMap.put(Integer.toString(f), Z);
        hashMap.put(Integer.toString(g), aa);
        hashMap.put(Integer.toString(i), ac);
        hashMap.put(Integer.toString(j), ae);
        hashMap.put(Integer.toString(h), ab);
        hashMap.put(Integer.toString(k), ad);
        hashMap.put(Integer.toString(l), af);
        hashMap.put(Integer.toString(m), ag);
        hashMap.put(Integer.toString(n), ah);
        hashMap.put(Integer.toString(o), ai);
        hashMap.put(Integer.toString(p), aj);
        hashMap.put(Integer.toString(q), ak);
        hashMap.put(Integer.toString(r), al);
        hashMap.put(Integer.toString(s), am);
        hashMap.put(Integer.toString(t), an);
        hashMap.put(Integer.toString(u), ao);
        hashMap.put(Integer.toString(v), ap);
        hashMap.put(Integer.toString(w), aq);
        hashMap.put(Integer.toString(x), ar);
        hashMap.put(Integer.toString(y), as);
        hashMap.put(Integer.toString(z), at);
        hashMap.put(Integer.toString(A), au);
        hashMap.put(Integer.toString(B), av);
        hashMap.put(Integer.toString(C), aw);
        hashMap.put(Integer.toString(D), ax);
        hashMap.put(Integer.toString(E), ay);
        hashMap.put(Integer.toString(G), az);
        hashMap.put(Integer.toString(H), aA);
        hashMap.put(Integer.toString(I), aB);
        hashMap.put(Integer.toString(J), aC);
        hashMap.put(Integer.toString(K), aD);
        hashMap.put(Integer.toString(L), aE);
        hashMap.put(Integer.toString(M), aF);
        hashMap.put(Integer.toString(N), aG);
        hashMap.put(Integer.toString(O), aH);
        hashMap.put(Integer.toString(P), aI);
        hashMap.put(Integer.toString(Q), aJ);
        hashMap.put(Integer.toString(R), aK);
        hashMap.put(Integer.toString(S), aL);
        hashMap.put(Integer.toString(T), aM);
        return hashMap;
    }
}