package defpackage;

import com.amap.bundle.tripgroup.api.IVoicePackageManager;
import com.autonavi.minimap.bundle.msgbox.entity.AmapMessage;
import com.autonavi.minimap.bundle.msgbox.util.MessageBoxManager.a;
import java.util.Arrays;

/* renamed from: dbi reason: default package */
/* compiled from: RouteBusResultMapFilter */
public final class dbi extends a {
    IVoicePackageManager a = ((IVoicePackageManager) ank.a(IVoicePackageManager.class));
    private String b = null;

    public dbi() {
        if (this.a != null) {
            this.b = this.a.getCurrentTtsName();
        }
    }

    public final boolean a(AmapMessage amapMessage) {
        if (amapMessage.page != 3 || !amapMessage.extData_gj_type.equals("1") || !amapMessage.isUnRead) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= amapMessage.createdTime && currentTimeMillis <= amapMessage.expireAt && amapMessage.extData_gj_name_array != null) {
            return Arrays.asList(amapMessage.extData_gj_name_array).contains(this.b);
        }
        return false;
    }
}
