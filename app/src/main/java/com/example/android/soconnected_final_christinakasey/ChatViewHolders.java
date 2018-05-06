package com.example.android.soconnected_final_christinakasey;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.soconnected_final_christinakasey.R;

public class ChatViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView mMessage;
        public LinearLayout mContainer;
        public ChatViewHolders(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            mMessage = itemView.findViewById(R.id.message);
            mContainer = itemView.findViewById(R.id.container);
        }

        @Override
        public void onClick(View view) {
        }
    }