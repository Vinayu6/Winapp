// Generated code from Butter Knife. Do not modify!
package free.rm.skytube.gui.fragments;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.Utils;
import free.rm.skytube.R;
import free.rm.skytube.gui.businessobjects.fragments.BaseVideosGridFragment_ViewBinding;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DownloadedVideosFragment_ViewBinding extends BaseVideosGridFragment_ViewBinding {
  private DownloadedVideosFragment target;

  @UiThread
  public DownloadedVideosFragment_ViewBinding(DownloadedVideosFragment target, View source) {
    super(target, source);

    this.target = target;

    target.noDownloadedVideosText = Utils.findRequiredView(source, R.id.noDownloadedVideosText, "field 'noDownloadedVideosText'");
    target.downloadsDisabledWarning = Utils.findRequiredView(source, R.id.downloadsDisabledWarning, "field 'downloadsDisabledWarning'");
  }

  @Override
  public void unbind() {
    DownloadedVideosFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.noDownloadedVideosText = null;
    target.downloadsDisabledWarning = null;

    super.unbind();
  }
}
