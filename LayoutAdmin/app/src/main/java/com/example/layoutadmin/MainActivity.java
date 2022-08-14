package com.example.layoutadmin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
        List<Users> usersList;
        List<Booking> bookingsList;
        List<Service> servicesList;
        private ListView listView;
        DatabaseReference databaseReference;
    TextView one, two, three;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.rv);
        usersList = new ArrayList<>();
        bookingsList = new ArrayList<>();
        servicesList = new ArrayList<>();
        databaseReference = FirebaseDatabase.getInstance().getReference("Users");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                usersList.clear();
                for(DataSnapshot model:dataSnapshot.getChildren()){
                    Users users = model.getValue(Users.class);
                    usersList.add(users);
                }
                ListAdapter adapter = new UserAdapter(MainActivity.this,usersList);
                listView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

//        one=findViewById(R.id.clientsClick);
//        two=findViewById(R.id.LayoutFollowing);
//        three=findViewById(R.id.LayoutImpacted);
//
//        one.onTouchEvent(new )
    }

    private void onClick1(){
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                servicesList.clear();
                for(DataSnapshot model:dataSnapshot.getChildren()){
                    Service users = model.getValue(Service.class);
                    servicesList.add(users);
                }
                ListAdapter adapter = new UserAdapter(MainActivity.this,usersList);
                listView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void onClick2(){
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                bookingsList.clear();
                for(DataSnapshot model:dataSnapshot.getChildren()){
                    Booking users = model.getValue(Booking.class);
                    bookingsList.add(users);
                }
                ListAdapter adapter = new UserAdapter(MainActivity.this,usersList);
                listView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}