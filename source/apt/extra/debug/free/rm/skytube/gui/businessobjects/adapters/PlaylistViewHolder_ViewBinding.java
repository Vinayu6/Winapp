// Generated code from Butter Knife. Do not modify!
package free.rm.skytube.gui.businessobjects.adapters;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import free.rm.skytube.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PlaylistViewHolder_ViewBinding implements Unbinder {
  private PlaylistViewHolder target;

  @UiThread
  public PlaylistViewHolder_ViewBinding(PlaylistViewHolder target, View source) {
    this.target = target;

    target.thumbnailImageView = Utils.findRequiredViewAsType(source, R.id.thumbnail_image_view, "field 'thumbnailImageView'", ImageView.class);
    target.titleTextView = Utils.findRequiredViewAsType(source, R.id.title_text_view, "field 'titleTextView'", TextView.class);
    target.videoCountTextView = Utils.findRequiredViewAsType(source, R.id.views_text_view, "field 'videoCountTextView'", TextView.class);
    target.publishDateTextView = Utils.findRequiredViewAsType(source, R.id.publish_date_text_view, "field 'publishDateTextView'", TextView.class);
    target.thumbsUpView = Utils.findRequiredView(source, R.id.thumbs_up_text_view, "field 'thumbsUpView'");
    target.videoDurationTextView = Utils.findRequiredView(source, R.id.video_duration_text_view, "field 'videoDurationTextView'");
    target.channelTextView = Utils.findRequiredView(source, R.id.channel_text_view, "field 'channelTextView'");
    target.optionsButton = Utils.findRequiredView(source, R.id.options_button, "field 'optionsButton'");
  }

  @Override
  @CallSuper
  public void unbind() {
    PlaylistViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.thumbnailImageView = null;
    target.titleTextView = null;
    target.videoCountTextView = null;
    target.publishDateTextView = null;
    target.thumbsUpView = null;
    target.videoDurationTextView = null;
    target.channelTextView = null;
    target.optionsButton = null;
  }
}
