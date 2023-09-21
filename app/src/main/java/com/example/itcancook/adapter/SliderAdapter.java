package com.example.itcancook.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.itcancook.R;
import com.example.itcancook.helper.OnboardingButtonClickListener;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.SliderViewHolder> {

    private Context context;
    private LayoutInflater layoutInflater;

    private OnboardingButtonClickListener buttonClickListener;

    private int[] images = {
            R.drawable.onboarding_picture_1,
            R.drawable.onboarding_picture_2,
            R.drawable.onboarding_picture_3,
    };

    private int[] headings = {
            R.string.onboarding_heading_1,
            R.string.onboarding_heading_2,
            R.string.onboarding_heading_3,
    };

    private int[] descriptions = {
            R.string.onboarding_description_1,
            R.string.onboarding_description_2,
            R.string.onboarding_description_3,
    };

    private int[] buttonTexts = {
            R.string.onboarding_button_text_1,
            R.string.onboarding_button_text_2,
    };

    public SliderAdapter(Context context, OnboardingButtonClickListener listener) {
        this.context = context;
        this.buttonClickListener = listener;
    }

    @NonNull
    @Override
    public SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.onboarding_layout, parent, false);

        return new SliderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SliderViewHolder holder, int position) {
        holder.imgViewOnboarding.setImageResource(images[position]);
        holder.tvHeading.setText(headings[position]);
        holder.tvDescription.setText(descriptions[position]);
        if(position < 2){
            holder.btnOnboarding.setText(buttonTexts[0]);
            if(position == 1){
                holder.vector1.setBackgroundResource(R.drawable.vector_5);
                holder.vector2.setBackgroundResource(R.drawable.vector_6);
            }
        } else {
            holder.btnOnboarding.setText(buttonTexts[1]);
            holder.vector1.setBackgroundResource(R.drawable.transparent);
            holder.vector3.setImageResource(R.drawable.vector_3);
            holder.vector2.setBackgroundResource(R.drawable.vector_4);
        }

        //Event
        holder.btnOnboarding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClickListener.onButtonClicked();
            }
        });

        holder.tvBoqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClickListener.onTextViewClicked();
            }
        });



    }

    @Override
    public int getItemCount() {
        return headings.length;
    }

    static class SliderViewHolder extends RecyclerView.ViewHolder {
        ImageView imgViewOnboarding;
        ImageView vector1;
        ImageView vector2;
        ImageView vector3;
        TextView tvHeading;
        TextView tvDescription;
        TextView tvBoqua;
        Button btnOnboarding;

        public SliderViewHolder(@NonNull View itemView) {
            super(itemView);
            imgViewOnboarding = itemView.findViewById(R.id.imgView_onboarding);
            vector1 = itemView.findViewById(R.id.vector_1);
            vector2 = itemView.findViewById(R.id.vector_2);
            vector3 = itemView.findViewById(R.id.vector_3);
            tvHeading = itemView.findViewById(R.id.tv_heading);
            tvDescription = itemView.findViewById(R.id.tv_description);
            btnOnboarding = itemView.findViewById(R.id.btn_onboarding);
            tvBoqua = itemView.findViewById(R.id.tv_boqua);
        }
    }
}
