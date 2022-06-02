package com.example.nowapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.nowapp.databinding.ActivityDashboardBinding;
import com.example.nowapp.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

public class Dashboard extends AppCompatActivity {

    ActivityDashboardBinding binding;
    ActionBarDrawerToggle toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Adapter adapter=new Adapter();
        RecyclerView recyclerView=findViewById(R.id.recDash);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),RecyclerView.VERTICAL,false));
        recyclerView.setAdapter(adapter);


        toggle=new ActionBarDrawerToggle(this,binding.drawerLayout,R.string.open,R.string.close);
        binding.drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        binding.nav.setCheckedItem(R.id.dash);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        binding.nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.dash:
                        startActivity(new Intent(getApplicationContext(),Dashboard.class));
                        break;
                    case R.id.Tab:
                        startActivity(new Intent(getApplicationContext(),Tables.class));
                        break;
                    case R.id.Menu:
                        startActivity(new Intent(getApplicationContext(),TodayMenu.class));
                        break;
                    case R.id.book:
                        startActivity(new Intent(getApplicationContext(),Booking.class));
                        break;
                    case R.id.logout:
                        startActivity(new Intent(getApplicationContext(),login.class));
                        finishAffinity();
                        break;

                }

                return false;
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}