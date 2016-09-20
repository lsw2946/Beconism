package com.cu.amuse.beconism;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.cu.amuse.beconism.Fragment.Child.childmain;
import com.cu.amuse.beconism.Fragment.Coupon.couponmain;
import com.cu.amuse.beconism.Fragment.Parade.parademain;
import com.cu.amuse.beconism.Fragment.Parking.parkingmain;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Fragment ChildFragment;
    private Fragment HomeFragment;
    private Fragment RideFragment;
    private Fragment ParadeFragment;
    private Fragment ParkingFragment;
    private Fragment ShopFragment;
    private Fragment CouponFragment;
    private Fragment EventFragment;
    private long lastTimeBackPressed;




    ///////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(this, opning.class));



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        HomeFragment = new HomeFragment();
        ChildFragment = new childmain();
        RideFragment = new ridemain();
        ParadeFragment = new parademain();
        ParkingFragment = new parkingmain();
        ShopFragment = new shopmain();
        CouponFragment = new couponmain();
        EventFragment = new eventmain();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.addToBackStack(null);
        transaction.add(R.id.container, HomeFragment);
        transaction.commit();



    }
    //////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {

            if (System.currentTimeMillis() - lastTimeBackPressed < 1500) {
                finish();
                return;
            }
            Toast.makeText(this, "'뒤로' 버튼을 한번 더 누르면 종료됩니다.", Toast.LENGTH_SHORT).show();

            lastTimeBackPressed = System.currentTimeMillis();

        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        if (id == R.id.action_settings) {

            transaction.replace(R.id.container, CouponFragment);

        } else if (id == R.id.action_event) {

            transaction.replace(R.id.container, EventFragment);
        }
        transaction.addToBackStack(null);
        transaction.commit();

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_ride) {
            transaction.replace(R.id.container, RideFragment);

        } else if (id == R.id.nav_parking) {
            transaction.replace(R.id.container, ParkingFragment);

        } else if (id == R.id.nav_shop) {
            transaction.replace(R.id.container, ShopFragment);

        } else if (id == R.id.nav_parade) {
            transaction.replace(R.id.container, EventFragment);

        } else if (id == R.id.nav_child) {
            transaction.replace(R.id.container, ChildFragment);

        } else if (id == R.id.nav_coupon) {
            transaction.replace(R.id.container, CouponFragment);

        }

        transaction.addToBackStack(null);
        transaction.commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;


    }

    public void bottomClick(View view) {

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        switch (view.getId()) {
            case R.id.bottom_ride_button:

                transaction.replace(R.id.container, RideFragment);
                break;
            case R.id.bottom_parking_button:
                transaction.replace(R.id.container, ParkingFragment);
                break;
            case R.id.bottom_shop_button:
                transaction.replace(R.id.container, ShopFragment);
                break;
            case R.id.bottom_parade_button:
                transaction.replace(R.id.container, EventFragment);
                break;
            case R.id.bottom_child_button:
                transaction.replace(R.id.container, ChildFragment);
                break;
        }


        transaction.addToBackStack(null);
        transaction.commit();
    }

}

