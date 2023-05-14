package com.example.firebaseloginyt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView benimrecyc;
    private ArrayList<Car> cars;
    private MyrecycAdaptor myadaptor;




    BottomNavigationView bottomNavim;




    FirebaseAuth auth;
    Button button;
    TextView textView;
    FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        benimrecyc=findViewById(R.id.myrecyc);
        cars=new ArrayList<>();
        myadaptor=new MyrecycAdaptor(cars);
        benimrecyc.setAdapter(myadaptor);
        diziolustur();
        benimrecyc.setLayoutManager(new LinearLayoutManager(this));
        myadaptor.notifyDataSetChanged();




        bottomNavim = findViewById(R.id.navim);
        /*
        bottomNavim.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.myrecyc,new HomeFrag()).commit();
                        break;
                    case R.id.search:
                        getSupportFragmentManager().beginTransaction().replace(R.id.myrecyc,new SearchFrag()).commit();
                        break;
                    case R.id.post:
                        getSupportFragmentManager().beginTransaction().replace(R.id.myrecyc,new PostFrag()).commit();
                        break;
                    case R.id.reels:
                        getSupportFragmentManager().beginTransaction().replace(R.id.myrecyc,new ReelsFrag()).commit();
                        break;
                    case R.id.profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.myrecyc,new ProfileFrag()).commit();
                        break;
                }

                return true;
            }
        });
        */





        auth = FirebaseAuth.getInstance();
        button = findViewById(R.id.logout);
        textView = findViewById(R.id.user_details);
        user = auth.getCurrentUser();
        if (user == null) {
            Intent intent = new Intent(getApplicationContext(), Login.class);
            startActivity(intent);
            finish();
        }
        else {
            textView.setText(user.getEmail());
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void diziolustur() {
        cars.add(new Car(R.drawable.p_keanu,"Keanu Reeves","Keanu Charles Reeves, Kanadalı aktör, yapımcı, yönetmen ve müzisyen. Adının anlamı \"Dağlardan esen rüzgâr\"dır."));
        cars.add(new Car(R.drawable.p_elon,"Elon Musk","Elon Musk veya tam adıyla Elon Reeve Musk; mühendis, endüstriyel tasarımcı, teknoloji girişimcisi ve hayırseverdir."));
        cars.add(new Car(R.drawable.p_harold,"Hide the Pain Harold","Hide the Pain Harold, Macar emekli bir elektrik mühendisi ve model olan András István Arató'nun bir dizi stok fotoğrafına dayanan bir İnternet meme'idir. 2011 yılında genel yüz ifadesi ve görünüşte sahte gülümsemesi nedeniyle meme konusu oldu."));
        cars.add(new Car(R.drawable.p_rock,"Dwayne Johnson - The Rock","Dwayne Douglas Johnson, ya da ring adı ile The Rock, Amerikalı aktör, iş insanı ve eski profesyonel güreşçidir. Geniş çapta tüm zamanların en büyük ve en etkili profesyonel güreşçilerinden biri olarak kabul edilen Johnson, oyunculuk kariyerine devam etmeden önce sekiz yıl boyunca WWF/E adına güreşti."));
        cars.add(new Car(R.drawable.p_grumpy,"Grumpy Cat","Grumpy Cat, gerçek adı Tardar Sauce olan ve huysuz yüz ifadesi ile İnternette şöhret olarak tanınan dişi kedidir. Sahibi Tabatha Bundesen, Tardar'ın sürekli olarak Cüce kedi olması nedeniyle huysuz bir yüz ifadesine sahip olduğunu belirtmektedir."));
        cars.add(new Car(R.drawable.p_cj,"Carl CJ Johnson","Carl Johnson ya da kısaca CJ, Grand Theft Auto: San Andreas oyunundaki hayalî baş karakter. Annesi Beverly Johnson'ın dört çocuğundan biridir. 1967 ya da 1968 doğumludur."));
        cars.add(new Car(R.drawable.p_keanu,"Keanu Reeves","Keanu Charles Reeves, Kanadalı aktör, yapımcı, yönetmen ve müzisyen. Adının anlamı \"Dağlardan esen rüzgâr\"dır."));
        cars.add(new Car(R.drawable.p_elon,"Elon Musk","Elon Musk veya tam adıyla Elon Reeve Musk; mühendis, endüstriyel tasarımcı, teknoloji girişimcisi ve hayırseverdir."));
        cars.add(new Car(R.drawable.p_harold,"Hide the Pain Harold","Hide the Pain Harold, Macar emekli bir elektrik mühendisi ve model olan András István Arató'nun bir dizi stok fotoğrafına dayanan bir İnternet meme'idir. 2011 yılında genel yüz ifadesi ve görünüşte sahte gülümsemesi nedeniyle meme konusu oldu."));
        cars.add(new Car(R.drawable.p_rock,"Dwayne Johnson - The Rock","Dwayne Douglas Johnson, ya da ring adı ile The Rock, Amerikalı aktör, iş insanı ve eski profesyonel güreşçidir. Geniş çapta tüm zamanların en büyük ve en etkili profesyonel güreşçilerinden biri olarak kabul edilen Johnson, oyunculuk kariyerine devam etmeden önce sekiz yıl boyunca WWF/E adına güreşti."));
        cars.add(new Car(R.drawable.p_grumpy,"Grumpy Cat","Grumpy Cat, gerçek adı Tardar Sauce olan ve huysuz yüz ifadesi ile İnternette şöhret olarak tanınan dişi kedidir. Sahibi Tabatha Bundesen, Tardar'ın sürekli olarak Cüce kedi olması nedeniyle huysuz bir yüz ifadesine sahip olduğunu belirtmektedir."));
        cars.add(new Car(R.drawable.p_cj,"Carl CJ Johnson","Carl Johnson ya da kısaca CJ, Grand Theft Auto: San Andreas oyunundaki hayalî baş karakter. Annesi Beverly Johnson'ın dört çocuğundan biridir. 1967 ya da 1968 doğumludur."));
    }
}