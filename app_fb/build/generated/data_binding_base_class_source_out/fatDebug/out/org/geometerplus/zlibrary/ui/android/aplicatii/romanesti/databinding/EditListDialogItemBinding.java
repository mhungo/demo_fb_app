// Generated by view binder compiler. Do not edit!
package org.geometerplus.zlibrary.ui.android.aplicatii.romanesti.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

public final class EditListDialogItemBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView editItemRemove;

  @NonNull
  public final TextView editItemTitle;

  private EditListDialogItemBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageView editItemRemove, @NonNull TextView editItemTitle) {
    this.rootView = rootView;
    this.editItemRemove = editItemRemove;
    this.editItemTitle = editItemTitle;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static EditListDialogItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static EditListDialogItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.edit_list_dialog_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static EditListDialogItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.edit_item_remove;
      ImageView editItemRemove = ViewBindings.findChildViewById(rootView, id);
      if (editItemRemove == null) {
        break missingId;
      }

      id = R.id.edit_item_title;
      TextView editItemTitle = ViewBindings.findChildViewById(rootView, id);
      if (editItemTitle == null) {
        break missingId;
      }

      return new EditListDialogItemBinding((RelativeLayout) rootView, editItemRemove,
          editItemTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
