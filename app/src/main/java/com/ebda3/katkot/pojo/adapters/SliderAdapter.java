package com.ebda3.katkot.pojo.adapters;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.viewpager.widget.PagerAdapter;

import com.ebda3.katkot.R;
import com.ebda3.katkot.databinding.Slider_LayoutBinding;

public class SliderAdapter extends PagerAdapter {


    private String titles[];
    private Context context;


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        Slider_LayoutBinding layoutBinding = DataBindingUtil.
                inflate(LayoutInflater.from(context), R.layout.slide_layout_ft, container, false);

        layoutBinding.tvHeader.setText(titles[position]);
        //layoutBinding.imgTitle.setImageDrawable();

        //
        container.addView(layoutBinding.getRoot());

        return super.instantiateItem(container, position);
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((RelativeLayout) object);
    }//..
}
