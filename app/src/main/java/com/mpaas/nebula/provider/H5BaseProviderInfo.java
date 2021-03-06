package com.mpaas.nebula.provider;

import com.alipay.mobile.nebula.provider.H5AppBizRpcProvider;
import com.alipay.mobile.nebula.provider.H5BugMeRpcAuthProvider;
import com.alipay.mobile.nebula.provider.H5LogProvider;
import com.alipay.mobile.nebula.provider.H5NebulaDebugProvider;
import com.alipay.mobile.nebula.provider.H5RpcProxyProvider;
import com.alipay.mobile.nebula.provider.H5ThreadPoolProvider;
import com.alipay.mobile.nebula.provider.H5TraceProvider;
import com.alipay.mobile.nebula.provider.TinyWebWorkerPushProvider;
import com.alipay.mobile.nebula.providermanager.H5ProviderConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class H5BaseProviderInfo {
    public static final String h5worker = "android-phone-wallet-h5worker";
    public static final String nebulaappproxy = "android-phone-wallet-nebulaappproxy";
    public static final String nebulabiz = "com-mpaas-nebula-adapter-mpaasnebulaadapter";
    public static final String nebuladebug = "android-phone-wallet-nebuladebug-amap";
    public static final String nebulauc = "android-phone-wallet-nebulauc";
    public static final String nebulaucsdk = "android-phone-wallet-nebulaucsdk";
    public static Map<String, H5ProviderConfig> providerInfoMap = null;
    public static final String tinyappcommon = "android-phone-wallet-tinyappcommon";
    public static final String tinyappcustom = "android-phone-mpaas-tinyappcustom";

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        providerInfoMap = concurrentHashMap;
        concurrentHashMap.put(H5NebulaDebugProvider.class.getName(), new H5ProviderConfig(nebuladebug, "com.alipay.mobile.nebuladebug.H5DebugProviderImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5TraceProvider", new H5ProviderConfig(H5TraceProvider.class.getName(), "com.alipay.mobile.nebulacore.dev.trace.H5TraceProviderImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5LogProvider", new H5ProviderConfig(H5LogProvider.class.getName(), "com.alipay.mobile.nebulacore.wallet.H5LogProviderImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5ThreadPoolProvider", new H5ProviderConfig(H5ThreadPoolProvider.class.getName(), "com.alipay.mobile.nebulacore.wallet.H5ThreadPoolProviderImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5ABTestProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.alipay.mobile.nebulabiz.provider.H5ABTestProviderImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5APMTool", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.mpaas.nebula.provider.H5APMToolImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5EnvProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.alipay.mobile.nebulabiz.provider.WalletEnvProvider"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5ConfigProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.mpaas.nebula.provider.H5ConfigProviderImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5DialogManagerProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.mpaas.nebula.provider.H5WalletDialogProvider"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5CacheProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.alipay.mobile.nebulabiz.provider.WalletCacheProvider"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5PreRpcProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.mpaas.nebula.provider.WalletPreRpcProvider"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5LocationDialogProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.mpaas.nebula.provider.WalletLocationDialogProvider"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5ImageProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.alipay.mobile.nebulabiz.provider.WalletImageProvider"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5ImageUploadProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.alipay.mobile.nebulabiz.provider.WalletImageUploadProvider"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5CardShareProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.alipay.mobile.nebulabiz.provider.WalletCardShareProvider"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5LastKnowLocationProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.alipay.mobile.nebulabiz.provider.WalletLastKnowLocationProvider"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5JSApiPermissionProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.alipay.mobile.nebulabiz.provider.H5JSApiPermissionProviderImp"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5JSApiPermissionProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.alipay.mobile.nebulabiz.provider.H5JSApiPermissionProviderImp"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5ListPopDialogProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.alipay.mobile.nebulabiz.provider.H5WalletListPopDialogProvider"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5ToastProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.alipay.mobile.nebulabiz.provider.H5WalletToastProvider"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5SharePanelProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", H5SharePanelProviderImpl.class.getName()));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5AppCenterPresetProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.alipay.mobile.nebulabiz.appcenter.H5AppCenterPresetProviderImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5InputBoardProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.mpaas.nebula.provider.H5InputBoardProviderImpEx"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5BugMeRpcAuthProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.alipay.mobile.nebulabiz.provider.H5BugMeRpcAuthProviderImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5ActionSheetProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.mpaas.nebula.provider.H5AntUIActionSheetProviderImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.search.H5SearchView", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.alipay.mobile.nebulabiz.provider.H5SearchViewImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.resourcehandler.H5ResourceHandler", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.mpaas.nebula.provider.H5ResourceHandlerImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5478Provider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.alipay.mobile.nebulabiz.provider.H5478ProviderImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5LoadingDialog", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.alipay.mobile.nebulabiz.provider.H5LoadingDialogImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5SimpleRpcProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.alipay.mobile.nebulabiz.provider.H5SimpleRpcProviderImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5OpenAuthProvider", new H5ProviderConfig(tinyappcustom, "com.alipay.mobile.tinyappcustom.provider.H5OpenAuthProviderImpl"));
        providerInfoMap.put(H5RpcProxyProvider.class.getName(), new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.alipay.mobile.nebulabiz.provider.H5RpcProxyProviderImpl"));
        providerInfoMap.put("com.mpaas.nebula.adapter.api.H5APServiceCallbackProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.mpaas.nebula.provider.H5APServiceCallbackProviderImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5UCM57Provider", new H5ProviderConfig("android-phone-wallet-nebulaucsdk", "com.alipay.mobile.nebulaucsdk.H5UCM57ProviderImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5PreConnectProvider", new H5ProviderConfig("android-phone-wallet-nebulauc", "com.alipay.mobile.nebulauc.impl.network.provider.H5PreConnectProviderImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5FallbackStreamProvider", new H5ProviderConfig("android-phone-wallet-nebulauc", "com.alipay.mobile.nebulauc.impl.network.provider.UCFallbackStreamProvider"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5WebViewPathProvider", new H5ProviderConfig("android-phone-wallet-nebulauc", "com.alipay.mobile.nebulauc.provider.UcPathProviderImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.appcenter.download.H5ExternalDownloadManager", new H5ProviderConfig("android-phone-wallet-nebulaappproxy", "com.alipay.mobile.nebulaappproxy.api.download.H5ExternalDownloadManagerImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5PatchProvider", new H5ProviderConfig("android-phone-wallet-nebulaappproxy", "com.alipay.mobile.nebulaappproxy.provider.H5PatchProviderImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5AppSyncDataHandler", new H5ProviderConfig("android-phone-wallet-nebulaappproxy", "com.alipay.mobile.nebulaappproxy.provider.H5AppSyncDataHandlerImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.tinypermission.H5ApiManager", new H5ProviderConfig("android-phone-wallet-tinyappcommon", "com.alipay.mobile.tinyappcommon.tinypermission.H5ApiManagerImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.view.IH5TinyPopMenu", new H5ProviderConfig("android-phone-wallet-tinyappcommon", "com.alipay.mobile.tinyappcommon.dynamicpanel.H5TinyPopMenu"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5TinyAppProvider", new H5ProviderConfig("android-phone-wallet-tinyappcommon", "com.alipay.mobile.tinyappcommon.provider.H5TinyAppProviderImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5TinyDebugProvider", new H5ProviderConfig("android-phone-wallet-tinyappcommon", "com.alipay.mobile.tinyappcommon.provider.H5TinyAppDebugProviderImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.NebulaAdapterProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.mpaas.nebula.provider.NebulaAdapterProviderImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5LottieViewProvider", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.alipay.mobile.nebulabiz.provider.H5LottieViewProviderImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5ErrorPageView", new H5ProviderConfig("com-mpaas-nebula-adapter-mpaasnebulaadapter", "com.alipay.mobile.nebulabiz.provider.H5ErrorPageViewImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5TinyAppRemoteLogProvider", new H5ProviderConfig("android-phone-wallet-tinyappcommon", "com.alipay.mobile.tinyappcommon.provider.H5TinyAppRemoteLogProviderImpl"));
        providerInfoMap.put("com.alipay.mobile.nebula.provider.H5InPageRenderProvider", new H5ProviderConfig("android-phone-wallet-nebulauc", "com.alipay.mobile.nebulauc.provider.H5InPageRenderProviderImpl"));
        providerInfoMap.put(H5BugMeRpcAuthProvider.class.getName(), new H5ProviderConfig(tinyappcustom, "com.alipay.mobile.tinyappcustom.provider.H5BugMeRpcAuthProviderImpl"));
        providerInfoMap.put(TinyWebWorkerPushProvider.class.getName(), new H5ProviderConfig("android-phone-wallet-h5worker", "com.alipay.mobile.worker.TinyAppWorkerProviderImpl"));
        providerInfoMap.put(H5AppBizRpcProvider.class.getName(), new H5ProviderConfig("android-phone-wallet-h5worker", "com.autonavi.miniapp.biz.provider.AmapAppBizRpcProviderImpl"));
    }
}
