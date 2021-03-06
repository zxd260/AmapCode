package defpackage;

import android.net.Uri;
import com.autonavi.amap.app.AMapAppGlobal;
import com.autonavi.annotation.Router;
import com.autonavi.bundle.account.api.IAccountService;
import com.autonavi.bundle.account.api.IAccountService.AccountType;
import com.autonavi.common.PageBundle;
import com.autonavi.map.fragmentcontainer.page.utils.AMapPageUtil;
import com.autonavi.minimap.R;
import com.autonavi.minimap.life.order.viewpoint.fragment.ViewPointListFragmentNew;
import java.util.List;

@Router({"scenicSpotOrder"})
/* renamed from: dqh reason: default package */
/* compiled from: ScenicSpotOrderRouter */
public class dqh extends esk {
    public boolean start(ese ese) {
        Uri uri = ese.a;
        if (uri == null) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.size() == 0 || !"home".equalsIgnoreCase(pathSegments.get(0))) {
            return false;
        }
        IAccountService iAccountService = (IAccountService) a.a.a(IAccountService.class);
        if (iAccountService != null) {
            if (!iAccountService.a() || !iAccountService.a(AccountType.Mobile)) {
                iAccountService.a(AMapPageUtil.getPageContext(), AMapAppGlobal.getApplication().getString(R.string.life_order_bind_phone_tip), (anq) new anq() {
                    public final void loginOrBindCancel() {
                    }

                    public final void onComplete(boolean z) {
                        if (z) {
                            dqh.this.startPage(ViewPointListFragmentNew.class, (PageBundle) null);
                        }
                    }
                });
            } else {
                startPage(ViewPointListFragmentNew.class, (PageBundle) null);
            }
        }
        return true;
    }
}
