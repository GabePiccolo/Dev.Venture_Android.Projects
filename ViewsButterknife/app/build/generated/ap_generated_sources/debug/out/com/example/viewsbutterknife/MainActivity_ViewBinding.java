// Generated code from Butter Knife. Do not modify!
package com.example.viewsbutterknife;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.textView1 = Utils.findRequiredViewAsType(source, R.id.textView1, "field 'textView1'", TextView.class);
    target.textView2 = Utils.findRequiredViewAsType(source, R.id.textView2, "field 'textView2'", TextView.class);
    target.editText = Utils.findRequiredViewAsType(source, R.id.editText, "field 'editText'", EditText.class);
    target.button = Utils.findRequiredViewAsType(source, R.id.button, "field 'button'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textView1 = null;
    target.textView2 = null;
    target.editText = null;
    target.button = null;
  }
}
