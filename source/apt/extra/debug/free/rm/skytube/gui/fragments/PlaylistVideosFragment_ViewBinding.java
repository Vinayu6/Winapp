// Generated code from Butter Knife. Do not modify!
package free.rm.skytube.gui.fragments;

import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.internal.Utils;
import free.rm.skytube.R;
import free.rm.skytube.gui.businessobjects.fragments.BaseVideosGridFragment_ViewBinding;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PlaylistVideosFragment_ViewBinding extends BaseVideosGridFragment_ViewBinding {
  private PlaylistVideosFragment target;

  @UiThread
  public PlaylistVideosFragment_ViewBinding(PlaylistVideosFragment target, View source) {
    super(target, source);

    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.playlistBannerImageView = Utils.findRequiredViewAsType(source, R.id.playlist_banner_image_view, "field 'playlistBannerImageView'", ImageView.class);
    target.playlistThumbnailImageView = Utils.findRequiredViewAsType(source, R.id.playlist_thumbnail_image_view, "field 'playlistThumbnailImageView'", ImageView.class);
    target.playlistTitleTextView = Utils.findRequiredViewAsType(source, R.id.playlist_title_text_view, "field 'playlistTitleTextView'", TextView.class);
  }

  @Override
  public void unbind() {
    PlaylistVideosFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.playlistBannerImageView = null;
    target.playlistThumbnailImageView = null;
    target.playlistTitleTextView = null;

    super.unbind();
  }
}
