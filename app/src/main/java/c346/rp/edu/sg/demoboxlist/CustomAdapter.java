package c346.rp.edu.sg.demoboxlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context mContext;
    int layout_id;
    ArrayList<Color> colorList;
    LayoutInflater inflater;

    public CustomAdapter(Context mContext, int layout_id, ArrayList<Color> colorList) {
        super(mContext, layout_id, colorList);
        this.mContext = mContext;
        this.layout_id = layout_id;
        this.colorList = colorList;
        inflater = LayoutInflater.from(mContext);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(layout_id, null);

        ImageView colorIv;

        colorIv = convertView.findViewById(R.id.colorIv);

        Color currentItem = colorList.get(position);

        if (currentItem.getColor().equalsIgnoreCase("Blue")) {
            colorIv.setImageResource(R.drawable.blue_box);
        }
        else if (currentItem.getColor().equalsIgnoreCase("Orange")) {
            colorIv.setImageResource(R.drawable.orange_box);
        }
        else {
            colorIv.setImageResource(R.drawable.brown_box);
        }

        return convertView;
    }
}
