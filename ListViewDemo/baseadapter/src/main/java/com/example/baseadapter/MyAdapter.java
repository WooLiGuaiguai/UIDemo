package com.example.baseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private List<Message> Datas;
    private Context mContext;

    public MyAdapter(List<Message> datas, Context mContext) {
        Datas = datas;
        this.mContext = mContext;
    }
    @Override
    public int getCount() {
        return Datas.size();
    }

    @Override
    public Object getItem(int i) {
        return Datas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view==null){
            holder=new ViewHolder();
            view=LayoutInflater.from(mContext).inflate(R.layout.item,viewGroup);
            holder.imageView=(ImageView)view.findViewById(R.id.image1);
            holder.textView1=(TextView)view.findViewById(R.id.text1);
            holder.textView2=(TextView)view.findViewById(R.id.text2);
            view.setTag(holder);
        }else{
            holder=(ViewHolder)view.getTag();
        }
        holder.imageView.setImageResource(Datas.get(i).getImageId());
        holder.textView1.setText(Datas.get(i).getTheme());
        holder.textView2.setText(Datas.get(i).getContent());
        return view;
    }
    class ViewHolder{
        private ImageView imageView;
        private TextView textView1;
        private TextView textView2;
    }


}
