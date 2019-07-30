package com.ztech.z_shop.controller.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.ztech.z_shop.R;


public class HeaderViewPagerAdapter extends PagerAdapter {
    // TODO: you can also use a string array for image urls and then load images from a server by picasso library

    private int[] imageResources = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5, R.drawable.pic6};
    private Context context;
    private LayoutInflater layoutInflater;

    public HeaderViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return imageResources.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (RelativeLayout ) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        // inflating the layout that we want to be on view pager
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = layoutInflater.inflate(R.layout.header_view_pager_swipe_layout, container, false);

        // getting children of view and initializing them:
        ImageView imageView = itemView.findViewById(R.id.swipe_layout_image_view);
        imageView.setImageResource(imageResources[position]);


        // add view to container:
        container.addView(itemView);
        return itemView;
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        // inorder to free the heap memory :
        //  the root element for R.layout.header_view_pager_swipe_layout is a RelativeLayout
        container.removeView((RelativeLayout) object);

    }
}
