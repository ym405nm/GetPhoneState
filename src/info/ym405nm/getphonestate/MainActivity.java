package info.ym405nm.getphonestate;

import android.os.Bundle;
import android.app.Activity;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TelephonyManager telephonyManager = (TelephonyManager)getSystemService(TELEPHONY_SERVICE);
        Log.d("TM", "Line1Number " + telephonyManager.getLine1Number());
        Log.d("TM", "DeviceId " + telephonyManager.getDeviceId());
        Log.d("TM", "SimCountryIso " + telephonyManager.getSimCountryIso());
        Log.d("TM", "SimOperator " + telephonyManager.getSimOperator());
        Log.d("TM", "SimOperatorName " + telephonyManager.getSimOperatorName());
        Log.d("TM", "SimSerialNumber " + telephonyManager.getSimSerialNumber());
        Log.d("TM", "SimState " + telephonyManager.getSimState());
        Log.d("TM", "VoiceMailNumber " + telephonyManager.getVoiceMailNumber());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
