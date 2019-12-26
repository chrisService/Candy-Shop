package chrisservice.project.slatkarnica;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.core.view.MenuItemCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import chrisservice.project.slatkarnica.fragments.KolaciFragment;
import chrisservice.project.slatkarnica.fragments.KontaktFragment;
import chrisservice.project.slatkarnica.fragments.MainFragment;
import chrisservice.project.slatkarnica.fragments.TortiFragment;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    private SwitchCompat switcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Повлечи на десно на тулбарот", Toast.LENGTH_LONG).show();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout, new MainFragment())
                .addToBackStack(null)
                .commit();

        NavigationView navigationView = findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.doma:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frameLayout, new MainFragment())
                                .addToBackStack(null)
                                .commit();
                        break;
                    case R.id.torti:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frameLayout, new TortiFragment())
                                .addToBackStack(null)
                                .commit();
                        break;
                    case R.id.kolaci:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frameLayout, new KolaciFragment())
                                .addToBackStack(null)
                                .commit();
                        break;
                    case R.id.map:
                        String mapa = "La Crème,Skopje1000";
                        Uri map1 = Uri.parse("geo:0,0?q=" + mapa);
                        Intent intent = new Intent(Intent.ACTION_VIEW, map1);
                        startActivity(intent);
                        break;
                    case R.id.kontakt:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frameLayout, new KontaktFragment())
                                .addToBackStack(null)
                                .commit();
                        break;
                    case R.id.nav_switch:
                        Log.d("menumenu", "onNavigationItemSelected: ");
                        switcher = findViewById(R.id.navigation);
                        switcher.setChecked(!switcher.isChecked());
                        switcher.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                            @Override
                            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                                Log.d("babaZumbula", "onCheckedChanged: ");
                            }
                        });

                        break;
                }

                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle
                (this, drawerLayout, toolbar, R.string.nav_drawer_open, R.string.nav_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
            getSupportFragmentManager().popBackStack();
        }
    }
}