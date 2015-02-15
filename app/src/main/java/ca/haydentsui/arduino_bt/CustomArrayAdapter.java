package ca.haydentsui.arduino_bt;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomArrayAdapter extends ArrayAdapter<String> {

    private String[] values;
    private Context context;

    public CustomArrayAdapter(String[] values, Context ctx) {
        super(ctx, R.layout.hello_card, values);
        this.values=values;
        this.context = ctx;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        // First let's verify the convertView is not null
        if (convertView == null) {
            // This a new view we inflate the new layout
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.hello_card, parent, false);
        }
        // Now we can fill the layout with the right values
        TextView tv = (TextView) convertView.findViewById(R.id.deviceN);
        //TextView distView = (TextView) convertView.findViewById(R.id.dist);
        String p = values[position];

        tv.setText(p);
        //distView.setText("" + p.getDistance());


        return convertView;
    }}
