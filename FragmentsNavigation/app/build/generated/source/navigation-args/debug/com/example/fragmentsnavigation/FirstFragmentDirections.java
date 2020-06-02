package com.example.fragmentsnavigation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FirstFragmentDirections {
  private FirstFragmentDirections() {
  }

  @NonNull
  public static ActionFirstFragmentToSecondFragment actionFirstFragmentToSecondFragment(
      int number) {
    return new ActionFirstFragmentToSecondFragment(number);
  }

  public static class ActionFirstFragmentToSecondFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionFirstFragmentToSecondFragment(int number) {
      this.arguments.put("number", number);
    }

    @NonNull
    public ActionFirstFragmentToSecondFragment setNumber(int number) {
      this.arguments.put("number", number);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("number")) {
        int number = (int) arguments.get("number");
        __result.putInt("number", number);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_firstFragment_to_secondFragment;
    }

    @SuppressWarnings("unchecked")
    public int getNumber() {
      return (int) arguments.get("number");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionFirstFragmentToSecondFragment that = (ActionFirstFragmentToSecondFragment) object;
      if (arguments.containsKey("number") != that.arguments.containsKey("number")) {
        return false;
      }
      if (getNumber() != that.getNumber()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getNumber();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionFirstFragmentToSecondFragment(actionId=" + getActionId() + "){"
          + "number=" + getNumber()
          + "}";
    }
  }
}
