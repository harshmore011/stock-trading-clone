package com.example.stockmarketsimulator;

import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_StockMarketSimulator);
        setContentView(R.layout.activity_main);
        bottomNav = findViewById(R.id.bottomNavigationView);

        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.watchlist:
                        swichFragmentWatchlist();
                        return true;
                    case R.id.movers:
                        swichFragmentMovers();
                        return true;
                    case R.id.portfolio:
                        swichFragmentPortfolio();
                        return true;
                    case R.id.orders:
                        swichFragmentOrders();
                        return true;
                    case R.id.profile:
                        swichFragmentProfile();
                        return true;
                }
                return false;
            }
        });
    }


    public void swichFragmentWatchlist() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();
    }

    public void swichFragmentMovers() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new MoversFragment()).commit();
    }

    public void swichFragmentPortfolio() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new PortfolioFragment()).commit();
    }

    public void swichFragmentOrders() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new OrdersFragment()).commit();
    }

    public void swichFragmentProfile() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new ProfileFragment()).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.overflow_menu, menu);

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();

        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));

        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.search:
                Toast.makeText(MainActivity.this, "Search...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.watchlist:
                Toast.makeText(MainActivity.this, "Opening Watchlist...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.settings:
                Toast.makeText(MainActivity.this, "Opening Settings...", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
