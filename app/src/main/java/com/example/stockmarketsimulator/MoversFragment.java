package com.example.stockmarketsimulator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MoversFragment extends Fragment {
    ViewPager2 viewPager2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.stockinfo_sample,container ,false);
//
//        TabLayout tabLayout = view.findViewById(R.id.tabLayout);
//        viewPager2 = view.findViewById(R.id.viewPager);
//
//        viewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
//        viewPager2.setUserInputEnabled(true);
//
//        viewPager2.setAdapter(new ViewPagerAdapter(getFragmentManager(), getLifecycle()));
//
//
//        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
//            @Override
//            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
//                switch (position) {
//                    case 0: {
//                        tab.setText("Top Gainers");
//                        break;
//                    }
//                    case 1: {
//                        tab.setText("Top Losers");
//                        break;
//                    }
//                }
//            }
//        });
//        tabLayoutMediator.attach();
//
        return view;

    }
}
