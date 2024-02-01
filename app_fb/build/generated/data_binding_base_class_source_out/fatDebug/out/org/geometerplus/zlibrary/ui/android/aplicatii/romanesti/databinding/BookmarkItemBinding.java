// Generated by view binder compiler. Do not edit!
package org.geometerplus.zlibrary.ui.android.aplicatii.romanesti.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.geometerplus.zlibrary.ui.android.aplicatii.romanesti.R;
import yuku.ambilwarna.widget.AmbilWarnaPrefWidgetView;

public final class BookmarkItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView bookmarkItemBooktitle;

  @NonNull
  public final AmbilWarnaPrefWidgetView bookmarkItemColor;

  @NonNull
  public final RelativeLayout bookmarkItemColorContainer;

  @NonNull
  public final ImageView bookmarkItemIcon;

  @NonNull
  public final TextView bookmarkItemText;

  private BookmarkItemBinding(@NonNull LinearLayout rootView,
      @NonNull TextView bookmarkItemBooktitle, @NonNull AmbilWarnaPrefWidgetView bookmarkItemColor,
      @NonNull RelativeLayout bookmarkItemColorContainer, @NonNull ImageView bookmarkItemIcon,
      @NonNull TextView bookmarkItemText) {
    this.rootView = rootView;
    this.bookmarkItemBooktitle = bookmarkItemBooktitle;
    this.bookmarkItemColor = bookmarkItemColor;
    this.bookmarkItemColorContainer = bookmarkItemColorContainer;
    this.bookmarkItemIcon = bookmarkItemIcon;
    this.bookmarkItemText = bookmarkItemText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BookmarkItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BookmarkItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.bookmark_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BookmarkItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bookmark_item_booktitle;
      TextView bookmarkItemBooktitle = ViewBindings.findChildViewById(rootView, id);
      if (bookmarkItemBooktitle == null) {
        break missingId;
      }

      id = R.id.bookmark_item_color;
      AmbilWarnaPrefWidgetView bookmarkItemColor = ViewBindings.findChildViewById(rootView, id);
      if (bookmarkItemColor == null) {
        break missingId;
      }

      id = R.id.bookmark_item_color_container;
      RelativeLayout bookmarkItemColorContainer = ViewBindings.findChildViewById(rootView, id);
      if (bookmarkItemColorContainer == null) {
        break missingId;
      }

      id = R.id.bookmark_item_icon;
      ImageView bookmarkItemIcon = ViewBindings.findChildViewById(rootView, id);
      if (bookmarkItemIcon == null) {
        break missingId;
      }

      id = R.id.bookmark_item_text;
      TextView bookmarkItemText = ViewBindings.findChildViewById(rootView, id);
      if (bookmarkItemText == null) {
        break missingId;
      }

      return new BookmarkItemBinding((LinearLayout) rootView, bookmarkItemBooktitle,
          bookmarkItemColor, bookmarkItemColorContainer, bookmarkItemIcon, bookmarkItemText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
