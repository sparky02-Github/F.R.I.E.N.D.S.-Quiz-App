// Generated by data binding compiler. Do not edit!
package com.example.friendstrivia.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.friendstrivia.QuizFragment;
import com.example.friendstrivia.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class QuizLayoutBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final RadioGroup questionRGP;

  @NonNull
  public final RadioButton radioButton1;

  @NonNull
  public final RadioButton radioButton2;

  @NonNull
  public final RadioButton radioButton3;

  @NonNull
  public final Button submit;

  @NonNull
  public final TextView textView;

  @Bindable
  protected QuizFragment mQuiz;

  protected QuizLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageView3, RadioGroup questionRGP, RadioButton radioButton1,
      RadioButton radioButton2, RadioButton radioButton3, Button submit, TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView3 = imageView3;
    this.questionRGP = questionRGP;
    this.radioButton1 = radioButton1;
    this.radioButton2 = radioButton2;
    this.radioButton3 = radioButton3;
    this.submit = submit;
    this.textView = textView;
  }

  public abstract void setQuiz(@Nullable QuizFragment quiz);

  @Nullable
  public QuizFragment getQuiz() {
    return mQuiz;
  }

  @NonNull
  public static QuizLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.quiz_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static QuizLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<QuizLayoutBinding>inflateInternal(inflater, R.layout.quiz_layout, root, attachToRoot, component);
  }

  @NonNull
  public static QuizLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.quiz_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static QuizLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<QuizLayoutBinding>inflateInternal(inflater, R.layout.quiz_layout, null, false, component);
  }

  public static QuizLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static QuizLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (QuizLayoutBinding)bind(component, view, R.layout.quiz_layout);
  }
}