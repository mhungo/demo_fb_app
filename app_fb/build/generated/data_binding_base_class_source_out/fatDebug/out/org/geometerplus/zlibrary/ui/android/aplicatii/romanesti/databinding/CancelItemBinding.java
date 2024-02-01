// Generated by view binder compiler. Do not edit!
package org.geometerplus.zlibrary.ui.android.aplicatii.romanesti.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.geometerplus.zlibrary.ui.android.aplicatii.romanesti.R;

public final class CancelItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView cancelItemSummary;

  @NonNull
  public final TextView cancelItemTitle;

  private CancelItemBinding(@NonNull LinearLayout rootView, @NonNull TextView cancelItemSummary,
      @NonNull TextView cancelItemTitle) {
    this.rootView = rootView;
    this.cancelItemSummary = cancelItemSummary;
    this.cancelItemTitle = cancelItemTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CancelItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CancelItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.cancel_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CancelItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cancel_item_summary;
      TextView cancelItemSummary = ViewBindings.findChildViewById(rootView, id);
      if (cancelItemSummary == null) {
        break missingId;
      }

      id = R.id.cancel_item_title;
      TextView cancelItemTitle = ViewBindings.findChildViewById(rootView, id);
      if (cancelItemTitle == null) {
        break missingId;
      }

      return new CancelItemBinding((LinearLayout) rootView, cancelItemSummary, cancelItemTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
