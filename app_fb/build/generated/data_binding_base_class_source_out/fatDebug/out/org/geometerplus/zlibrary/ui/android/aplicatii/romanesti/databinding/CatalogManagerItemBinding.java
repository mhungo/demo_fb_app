// Generated by view binder compiler. Do not edit!
package org.geometerplus.zlibrary.ui.android.aplicatii.romanesti.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
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

public final class CatalogManagerItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CheckBox catalogManagerItemCheckbox;

  @NonNull
  public final ImageView catalogManagerItemDragIcon;

  @NonNull
  public final ImageView catalogManagerItemIcon;

  @NonNull
  public final TextView catalogManagerItemSubtitle;

  @NonNull
  public final TextView catalogManagerItemTitle;

  private CatalogManagerItemBinding(@NonNull LinearLayout rootView,
      @NonNull CheckBox catalogManagerItemCheckbox, @NonNull ImageView catalogManagerItemDragIcon,
      @NonNull ImageView catalogManagerItemIcon, @NonNull TextView catalogManagerItemSubtitle,
      @NonNull TextView catalogManagerItemTitle) {
    this.rootView = rootView;
    this.catalogManagerItemCheckbox = catalogManagerItemCheckbox;
    this.catalogManagerItemDragIcon = catalogManagerItemDragIcon;
    this.catalogManagerItemIcon = catalogManagerItemIcon;
    this.catalogManagerItemSubtitle = catalogManagerItemSubtitle;
    this.catalogManagerItemTitle = catalogManagerItemTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CatalogManagerItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CatalogManagerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.catalog_manager_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CatalogManagerItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.catalog_manager_item_checkbox;
      CheckBox catalogManagerItemCheckbox = ViewBindings.findChildViewById(rootView, id);
      if (catalogManagerItemCheckbox == null) {
        break missingId;
      }

      id = R.id.catalog_manager_item_drag_icon;
      ImageView catalogManagerItemDragIcon = ViewBindings.findChildViewById(rootView, id);
      if (catalogManagerItemDragIcon == null) {
        break missingId;
      }

      id = R.id.catalog_manager_item_icon;
      ImageView catalogManagerItemIcon = ViewBindings.findChildViewById(rootView, id);
      if (catalogManagerItemIcon == null) {
        break missingId;
      }

      id = R.id.catalog_manager_item_subtitle;
      TextView catalogManagerItemSubtitle = ViewBindings.findChildViewById(rootView, id);
      if (catalogManagerItemSubtitle == null) {
        break missingId;
      }

      id = R.id.catalog_manager_item_title;
      TextView catalogManagerItemTitle = ViewBindings.findChildViewById(rootView, id);
      if (catalogManagerItemTitle == null) {
        break missingId;
      }

      return new CatalogManagerItemBinding((LinearLayout) rootView, catalogManagerItemCheckbox,
          catalogManagerItemDragIcon, catalogManagerItemIcon, catalogManagerItemSubtitle,
          catalogManagerItemTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
