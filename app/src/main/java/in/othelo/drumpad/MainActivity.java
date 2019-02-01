package in.othelo.drumpad;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SoundPool ap;
    private int sound1;
    private int sound2;
    private int sound3;
    private int sound4;
    private int sound5;
    private int sound6;
    private int sound7;
    private int sound8;
    private int sound9;
    private int sound00;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ap=new SoundPool(2, AudioManager.STREAM_MUSIC,0);
                sound1=ap.load(getApplicationContext(),R.raw.sound1,1);
                sound2=ap.load(getApplicationContext(),R.raw.sound2,1);
                sound3=ap.load(getApplicationContext(),R.raw.sound3,1);
                sound4=ap.load(getApplicationContext(),R.raw.sound4,1);
                sound5=ap.load(getApplicationContext(),R.raw.sound5,1);
                sound6=ap.load(getApplicationContext(),R.raw.sound6,1);
                sound7=ap.load(getApplicationContext(),R.raw.sound7,1);
                sound8=ap.load(getApplicationContext(),R.raw.sound8,1);
                sound9=ap.load(getApplicationContext(),R.raw.sound9,1);
                sound00=ap.load(getApplicationContext(),R.raw.sound00,1);


    }

    public void playsound1(View view)
    {
        ap.play(sound1,1.0f,1.0f,0,0,10f);

    }
    public void playsound2(View view)
    {
        ap.play(sound2 ,1.0f,1.0f,0,0,10f);
    }
    public void playsound3(View view)
    {
        ap.play(sound3,1.0f,1.0f,0,0,10f);
    }
    public void playsound4(View view)
    {
        ap.play(sound4,1.0f,1.0f,0,0,10f);
    }
    public void playsound5(View view)
    {
        ap.play(sound5,1.0f,1.0f,0,0,10f);
    }
    public void playsound6(View view)
    {
        ap.play(sound00,1.0f,1.0f,0,0,10f);

    }
    public void playsound7(View view)
    {
        ap.play(sound7,1.0f,1.0f,0,0,10f);
    }
    public void playsound8(View view)
    {
        ap.play(sound8,1.0f,1.0f,0,0,10f);
    }
    public void playsound9(View view)
    {
        ap.play(sound9,1.0f,1.0f,0,0,10f);
    }
}
