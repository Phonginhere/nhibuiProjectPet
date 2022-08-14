package com.example.layoutadmin;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class BookingAdapter extends ArrayAdapter {
    private Activity Context;
    List<Booking> usersList;

    public BookingAdapter(Activity Context,List<Booking> usersList){
        super(Context,R.layout.list_service, usersList);
        this.Context=Context;
        this.usersList = usersList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater=Context.getLayoutInflater();
        View listItemView=inflater.inflate(R.layout.list_users,null,true);

        TextView email = listItemView.findViewById(R.id.UserEmail);
        TextView role = listItemView.findViewById(R.id.UserRole);
        TextView payment = listItemView.findViewById(R.id.UserPayment);
        //ImageView img=listItemView.findViewById(R.id.img1);

        Booking users = usersList.get(position);
        email.setText(users.getTotalPrice());
        role.setText(users.getAddress());
        payment.setText(users.getPayment());

        return listItemView;
    }
}
