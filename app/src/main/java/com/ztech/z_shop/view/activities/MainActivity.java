package com.ztech.z_shop.view.activities;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.ztech.z_shop.R;
import com.ztech.z_shop.controller.adapters.CategoryAdapter;
import com.ztech.z_shop.controller.adapters.HeaderViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private RecyclerView categoryRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setupToolbar();
        setupViewPager();
        setupRecyclerView();


    }

    private void setupRecyclerView() {


        categoryRecyclerView = findViewById(R.id.category_recycler_view);

        List<String> stringList = new ArrayList<>();

        stringList.add("کالای دیجیتال");
        stringList.add("ارایشی، بهداشتی وسلامت");
        stringList.add("خودرو، ابزار و اداری");
        stringList.add("مد و پوشاک");
        stringList.add("خانه و اشپزخانه");
        stringList.add("کتاب،لوازم تحریر و هنر");
        stringList.add("اسباب بازی،کودک و نوزاد");
        stringList.add("ورزش و سفر");
        stringList.add("خوذدنی و آشیدنی");

        CategoryAdapter categoryAdapter = new CategoryAdapter(this, stringList);

        categoryRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));


        categoryRecyclerView.setAdapter(categoryAdapter);

    }

    private void setupViewPager() {
        viewPager = findViewById(R.id.header_view_pager);
        HeaderViewPagerAdapter adapter = new HeaderViewPagerAdapter(this);
        viewPager.setAdapter(adapter);

    }

    private void setupToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
