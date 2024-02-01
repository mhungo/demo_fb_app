// Generated by view binder compiler. Do not edit!
package org.geometerplus.zlibrary.ui.android.aplicatii.romanesti.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.geometerplus.zlibrary.ui.android.aplicatii.romanesti.R;

public final class AddCustomCatalogBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final OkCancelButtonsBinding addCustomCatalogButtons;

  @NonNull
  public final TextView addCustomCatalogError;

  @NonNull
  public final EditText addCustomCatalogSummary;

  @NonNull
  public final TextView addCustomCatalogSummaryExample;

  @NonNull
  public final RelativeLayout addCustomCatalogSummaryGroup;

  @NonNull
  public final TextView addCustomCatalogSummaryLabel;

  @NonNull
  public final EditText addCustomCatalogTitle;

  @NonNull
  public final TextView addCustomCatalogTitleExample;

  @NonNull
  public final RelativeLayout addCustomCatalogTitleGroup;

  @NonNull
  public final TextView addCustomCatalogTitleLabel;

  @NonNull
  public final TextView addCustomCatalogTitleStar;

  @NonNull
  public final EditText addCustomCatalogUrl;

  @NonNull
  public final TextView addCustomCatalogUrlExample;

  @NonNull
  public final RelativeLayout addCustomCatalogUrlGroup;

  @NonNull
  public final TextView addCustomCatalogUrlLabel;

  @NonNull
  public final TextView addCustomCatalogUrlStar;

  private AddCustomCatalogBinding(@NonNull ScrollView rootView,
      @NonNull OkCancelButtonsBinding addCustomCatalogButtons,
      @NonNull TextView addCustomCatalogError, @NonNull EditText addCustomCatalogSummary,
      @NonNull TextView addCustomCatalogSummaryExample,
      @NonNull RelativeLayout addCustomCatalogSummaryGroup,
      @NonNull TextView addCustomCatalogSummaryLabel, @NonNull EditText addCustomCatalogTitle,
      @NonNull TextView addCustomCatalogTitleExample,
      @NonNull RelativeLayout addCustomCatalogTitleGroup,
      @NonNull TextView addCustomCatalogTitleLabel, @NonNull TextView addCustomCatalogTitleStar,
      @NonNull EditText addCustomCatalogUrl, @NonNull TextView addCustomCatalogUrlExample,
      @NonNull RelativeLayout addCustomCatalogUrlGroup, @NonNull TextView addCustomCatalogUrlLabel,
      @NonNull TextView addCustomCatalogUrlStar) {
    this.rootView = rootView;
    this.addCustomCatalogButtons = addCustomCatalogButtons;
    this.addCustomCatalogError = addCustomCatalogError;
    this.addCustomCatalogSummary = addCustomCatalogSummary;
    this.addCustomCatalogSummaryExample = addCustomCatalogSummaryExample;
    this.addCustomCatalogSummaryGroup = addCustomCatalogSummaryGroup;
    this.addCustomCatalogSummaryLabel = addCustomCatalogSummaryLabel;
    this.addCustomCatalogTitle = addCustomCatalogTitle;
    this.addCustomCatalogTitleExample = addCustomCatalogTitleExample;
    this.addCustomCatalogTitleGroup = addCustomCatalogTitleGroup;
    this.addCustomCatalogTitleLabel = addCustomCatalogTitleLabel;
    this.addCustomCatalogTitleStar = addCustomCatalogTitleStar;
    this.addCustomCatalogUrl = addCustomCatalogUrl;
    this.addCustomCatalogUrlExample = addCustomCatalogUrlExample;
    this.addCustomCatalogUrlGroup = addCustomCatalogUrlGroup;
    this.addCustomCatalogUrlLabel = addCustomCatalogUrlLabel;
    this.addCustomCatalogUrlStar = addCustomCatalogUrlStar;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static AddCustomCatalogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AddCustomCatalogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.add_custom_catalog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AddCustomCatalogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_custom_catalog_buttons;
      View addCustomCatalogButtons = ViewBindings.findChildViewById(rootView, id);
      if (addCustomCatalogButtons == null) {
        break missingId;
      }
      OkCancelButtonsBinding binding_addCustomCatalogButtons = OkCancelButtonsBinding.bind(addCustomCatalogButtons);

      id = R.id.add_custom_catalog_error;
      TextView addCustomCatalogError = ViewBindings.findChildViewById(rootView, id);
      if (addCustomCatalogError == null) {
        break missingId;
      }

      id = R.id.add_custom_catalog_summary;
      EditText addCustomCatalogSummary = ViewBindings.findChildViewById(rootView, id);
      if (addCustomCatalogSummary == null) {
        break missingId;
      }

      id = R.id.add_custom_catalog_summary_example;
      TextView addCustomCatalogSummaryExample = ViewBindings.findChildViewById(rootView, id);
      if (addCustomCatalogSummaryExample == null) {
        break missingId;
      }

      id = R.id.add_custom_catalog_summary_group;
      RelativeLayout addCustomCatalogSummaryGroup = ViewBindings.findChildViewById(rootView, id);
      if (addCustomCatalogSummaryGroup == null) {
        break missingId;
      }

      id = R.id.add_custom_catalog_summary_label;
      TextView addCustomCatalogSummaryLabel = ViewBindings.findChildViewById(rootView, id);
      if (addCustomCatalogSummaryLabel == null) {
        break missingId;
      }

      id = R.id.add_custom_catalog_title;
      EditText addCustomCatalogTitle = ViewBindings.findChildViewById(rootView, id);
      if (addCustomCatalogTitle == null) {
        break missingId;
      }

      id = R.id.add_custom_catalog_title_example;
      TextView addCustomCatalogTitleExample = ViewBindings.findChildViewById(rootView, id);
      if (addCustomCatalogTitleExample == null) {
        break missingId;
      }

      id = R.id.add_custom_catalog_title_group;
      RelativeLayout addCustomCatalogTitleGroup = ViewBindings.findChildViewById(rootView, id);
      if (addCustomCatalogTitleGroup == null) {
        break missingId;
      }

      id = R.id.add_custom_catalog_title_label;
      TextView addCustomCatalogTitleLabel = ViewBindings.findChildViewById(rootView, id);
      if (addCustomCatalogTitleLabel == null) {
        break missingId;
      }

      id = R.id.add_custom_catalog_title_star;
      TextView addCustomCatalogTitleStar = ViewBindings.findChildViewById(rootView, id);
      if (addCustomCatalogTitleStar == null) {
        break missingId;
      }

      id = R.id.add_custom_catalog_url;
      EditText addCustomCatalogUrl = ViewBindings.findChildViewById(rootView, id);
      if (addCustomCatalogUrl == null) {
        break missingId;
      }

      id = R.id.add_custom_catalog_url_example;
      TextView addCustomCatalogUrlExample = ViewBindings.findChildViewById(rootView, id);
      if (addCustomCatalogUrlExample == null) {
        break missingId;
      }

      id = R.id.add_custom_catalog_url_group;
      RelativeLayout addCustomCatalogUrlGroup = ViewBindings.findChildViewById(rootView, id);
      if (addCustomCatalogUrlGroup == null) {
        break missingId;
      }

      id = R.id.add_custom_catalog_url_label;
      TextView addCustomCatalogUrlLabel = ViewBindings.findChildViewById(rootView, id);
      if (addCustomCatalogUrlLabel == null) {
        break missingId;
      }

      id = R.id.add_custom_catalog_url_star;
      TextView addCustomCatalogUrlStar = ViewBindings.findChildViewById(rootView, id);
      if (addCustomCatalogUrlStar == null) {
        break missingId;
      }

      return new AddCustomCatalogBinding((ScrollView) rootView, binding_addCustomCatalogButtons,
          addCustomCatalogError, addCustomCatalogSummary, addCustomCatalogSummaryExample,
          addCustomCatalogSummaryGroup, addCustomCatalogSummaryLabel, addCustomCatalogTitle,
          addCustomCatalogTitleExample, addCustomCatalogTitleGroup, addCustomCatalogTitleLabel,
          addCustomCatalogTitleStar, addCustomCatalogUrl, addCustomCatalogUrlExample,
          addCustomCatalogUrlGroup, addCustomCatalogUrlLabel, addCustomCatalogUrlStar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
