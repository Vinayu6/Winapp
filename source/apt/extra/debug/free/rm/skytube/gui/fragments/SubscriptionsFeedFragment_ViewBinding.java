// Generated code from Butter Knife. Do not modify!
package free.rm.skytube.gui.fragments;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import free.rm.skytube.R;
import free.rm.skytube.gui.businessobjects.fragments.BaseVideosGridFragment_ViewBinding;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SubscriptionsFeedFragment_ViewBinding extends BaseVideosGridFragment_ViewBinding {
  private SubscriptionsFeedFragment target;

  private View view2131296422;

  private View view2131296421;

  @UiThread
  public SubscriptionsFeedFragment_ViewBinding(final SubscriptionsFeedFragment target,
      View source) {
    super(target, source);

    this.target = target;

    View view;
    target.noSubscriptionsText = Utils.findRequiredView(source, R.id.noSubscriptionsText, "field 'noSubscriptionsText'");
    view = Utils.findRequiredView(source, R.id.importSubscriptionsButton, "method 'importSubscriptions'");
    view2131296422 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.importSubscriptions(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.importBackupButton, "method 'importBackup'");
    view2131296421 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.importBackup(p0);
      }
    });
  }

  @Override
  public void unbind() {
    SubscriptionsFeedFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.noSubscriptionsText = null;

    view2131296422.setOnClickListener(null);
    view2131296422 = null;
    view2131296421.setOnClickListener(null);
    view2131296421 = null;

    super.unbind();
  }
}
