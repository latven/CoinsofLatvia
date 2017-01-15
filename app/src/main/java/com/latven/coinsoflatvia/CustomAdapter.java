package com.latven.coinsoflatvia;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

class CustomAdapter extends ArrayAdapter<String>{

    public CustomAdapter(Context context, String[] coins) {
        super(context, R.layout.coin_custom_row, coins);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater coinInflater = LayoutInflater.from(getContext());
        View customView = coinInflater.inflate (R.layout.coin_custom_row, parent, false);
        String signleCoinItem = getItem(position);
        TextView coinText =(TextView) customView.findViewById(R.id.coinText);
        ImageView coinImage = (ImageView) customView.findViewById(R.id.coinImage);

        coinText.setText(signleCoinItem + "\nCustom coin description");
        coinImage.setImageResource(R.drawable.reverse);
        return customView;
    }
}
