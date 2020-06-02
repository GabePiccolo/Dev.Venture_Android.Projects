package com.example.marsweather.databinding;
import com.example.marsweather.R;
import com.example.marsweather.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewSeason.setTag(null);
        this.textViewTempAverage.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.weatherStatus == variableId) {
            setWeatherStatus((com.example.marsweather.model.WeatherStatus) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setWeatherStatus(@Nullable com.example.marsweather.model.WeatherStatus WeatherStatus) {
        this.mWeatherStatus = WeatherStatus;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.weatherStatus);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String stringValueOfWeatherStatusAirTemperatureAverageJavaLangStringC = null;
        com.example.marsweather.model.WeatherStatus.Temperature weatherStatusAirTemperature = null;
        float weatherStatusAirTemperatureAverage = 0f;
        com.example.marsweather.model.WeatherStatus.Air weatherStatusAir = null;
        com.example.marsweather.model.WeatherStatus weatherStatus = mWeatherStatus;
        java.lang.String weatherStatusSeason = null;
        java.lang.String stringValueOfWeatherStatusAirTemperatureAverage = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (weatherStatus != null) {
                    // read weatherStatus.air
                    weatherStatusAir = weatherStatus.getAir();
                    // read weatherStatus.season
                    weatherStatusSeason = weatherStatus.getSeason();
                }


                if (weatherStatusAir != null) {
                    // read weatherStatus.air.temperature
                    weatherStatusAirTemperature = weatherStatusAir.getTemperature();
                }


                if (weatherStatusAirTemperature != null) {
                    // read weatherStatus.air.temperature.average
                    weatherStatusAirTemperatureAverage = weatherStatusAirTemperature.getAverage();
                }


                // read String.valueOf(weatherStatus.air.temperature.average)
                stringValueOfWeatherStatusAirTemperatureAverage = java.lang.String.valueOf(weatherStatusAirTemperatureAverage);


                // read (String.valueOf(weatherStatus.air.temperature.average)) + (" Cº")
                stringValueOfWeatherStatusAirTemperatureAverageJavaLangStringC = (stringValueOfWeatherStatusAirTemperatureAverage) + (" Cº");
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewSeason, weatherStatusSeason);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewTempAverage, stringValueOfWeatherStatusAirTemperatureAverageJavaLangStringC);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): weatherStatus
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}