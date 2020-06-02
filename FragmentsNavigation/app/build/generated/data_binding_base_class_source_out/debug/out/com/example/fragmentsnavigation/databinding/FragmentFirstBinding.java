// Generated by view binder compiler. Do not edit!
package com.example.fragmentsnavigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.fragmentsnavigation.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFirstBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonNavigate;

  @NonNull
  public final Button buttonReset;

  @NonNull
  public final EditText editText;

  @NonNull
  public final SeekBar seekBar;

  @NonNull
  public final Switch switch1;

  @NonNull
  public final Switch switch2;

  @NonNull
  public final TextView textView;

  private FragmentFirstBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonNavigate,
      @NonNull Button buttonReset, @NonNull EditText editText, @NonNull SeekBar seekBar,
      @NonNull Switch switch1, @NonNull Switch switch2, @NonNull TextView textView) {
    this.rootView = rootView;
    this.buttonNavigate = buttonNavigate;
    this.buttonReset = buttonReset;
    this.editText = editText;
    this.seekBar = seekBar;
    this.switch1 = switch1;
    this.switch2 = switch2;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFirstBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFirstBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_first, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFirstBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      Button buttonNavigate = rootView.findViewById(R.id.buttonNavigate);
      if (buttonNavigate == null) {
        missingId = "buttonNavigate";
        break missingId;
      }
      Button buttonReset = rootView.findViewById(R.id.buttonReset);
      if (buttonReset == null) {
        missingId = "buttonReset";
        break missingId;
      }
      EditText editText = rootView.findViewById(R.id.editText);
      if (editText == null) {
        missingId = "editText";
        break missingId;
      }
      SeekBar seekBar = rootView.findViewById(R.id.seekBar);
      if (seekBar == null) {
        missingId = "seekBar";
        break missingId;
      }
      Switch switch1 = rootView.findViewById(R.id.switch1);
      if (switch1 == null) {
        missingId = "switch1";
        break missingId;
      }
      Switch switch2 = rootView.findViewById(R.id.switch2);
      if (switch2 == null) {
        missingId = "switch2";
        break missingId;
      }
      TextView textView = rootView.findViewById(R.id.textView);
      if (textView == null) {
        missingId = "textView";
        break missingId;
      }
      return new FragmentFirstBinding((ConstraintLayout) rootView, buttonNavigate, buttonReset,
          editText, seekBar, switch1, switch2, textView);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
