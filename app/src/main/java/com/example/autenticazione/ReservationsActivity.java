package com.example.autenticazione;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class ReservationsActivity extends AppCompatActivity {

    private ImageButton ibEditIncumbent;
    private ImageButton ibDeleteIncumbent;
    private ImageView ivDeleteRequest;
    private ImageView ivAcceptRequest;
    private ImageView ivEntrantCancelRequest;
    private ListView listEntrant;
    private ListView listIncumbent;

    private ImageButton ibBack;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TabItem myRequests;
    private TabItem requestsToMe;
    private TabItem myAvailabilities;
    public PageAdapter pageAdapter; //NB classe necessaria al funzionamento del tab, creata come classe.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservations);
        ibBack = (ImageButton)findViewById(R.id.ibBack);

        //tabLayout

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        myRequests = (TabItem) findViewById(R.id.myRequests);
        requestsToMe = (TabItem) findViewById(R.id.requestsToMe);
        myAvailabilities = (TabItem) findViewById(R.id.myAvailabilities);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        pageAdapter = new PageAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }

    public void goBackToMainActivity(View v) {
    Intent intent = new Intent(this, MainActivity.class);
    startActivity(intent);
    }

}