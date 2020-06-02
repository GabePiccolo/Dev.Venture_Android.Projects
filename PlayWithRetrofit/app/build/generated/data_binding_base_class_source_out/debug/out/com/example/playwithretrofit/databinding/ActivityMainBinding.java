// Generated by view binder compiler. Do not edit!
package com.example.playwithretrofit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.playwithretrofit.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonRequest;

  @NonNull
  public final EditText editTextSearch;

  @NonNull
  public final TextView textViewHeight;

  @NonNull
  public final TextView textViewId;

  @NonNull
  public final TextView textViewName;

  @NonNull
  public final TextView textViewWeight;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonRequest,
      @NonNull EditText editTextSearch, @NonNull TextView textViewHeight,
      @NonNull TextView textViewId, @NonNull TextView textViewName,
      @NonNull TextView textViewWeight) {
    this.rootView = rootView;
    this.buttonRequest = buttonRequest;
    this.editTextSearch = editTextSearch;
    this.textViewHeight = textViewHeight;
    this.textViewId = textViewId;
    this.textViewName = textViewName;
    this.textViewWeight = textViewWeight;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      Button buttonRequest = rootView.findViewById(R.id.buttonRequest);
      if (buttonRequest == null) {
        missingId = "buttonRequest";
        break missingId;
      }
      EditText editTextSearch = rootView.findViewById(R.id.editTextSearch);
      if (editTextSearch == null) {
        missingId = "editTextSearch";
        break missingId;
      }
      TextView textViewHeight = rootView.findViewById(R.id.textViewHeight);
      if (textViewHeight == null) {
        missingId = "textViewHeight";
        break missingId;
      }
      TextView textViewId = rootView.findViewById(R.id.textViewId);
      if (textViewId == null) {
        missingId = "textViewId";
        break missingId;
      }
      TextView textViewName = rootView.findViewById(R.id.textViewName);
      if (textViewName == null) {
        missingId = "textViewName";
        break missingId;
      }
      TextView textViewWeight = rootView.findViewById(R.id.textViewWeight);
      if (textViewWeight == null) {
        missingId = "textViewWeight";
        break missingId;
      }
      return new ActivityMainBinding((ConstraintLayout) rootView, buttonRequest, editTextSearch,
          textViewHeight, textViewId, textViewName, textViewWeight);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}