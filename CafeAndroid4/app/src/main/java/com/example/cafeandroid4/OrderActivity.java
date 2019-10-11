package com.example.cafeandroid4;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * This activity handles radio buttons for choosing
 * a delivery method for an order.
 */
public class OrderActivity extends AppCompatActivity {

    private static final String TAG_ACTIVITY = OrderActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }


    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }


    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.sameday:
                if (checked)
                    displayToast(getString(R.string.chosen) +
                            getString(R.string.same_day_messenger_service));
                break;
            case R.id.nextday:
                if (checked)
                    displayToast(getString(R.string.chosen) +
                            getString(R.string.next_day_ground_delivery));
                break;
            case R.id.pickup:
                if (checked)
                    displayToast(getString(R.string.chosen) +
                            getString(R.string.pick_up));
                break;
            default:
                Log.d(TAG_ACTIVITY, getString(R.string.nothing_clicked));
                break;
        }
    }
}
