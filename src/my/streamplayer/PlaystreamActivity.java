package my.streamplayer;

import android.app.Activity;
import android.os.Bundle;

public class PlaystreamActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);
        Rtsplayer player = new Rtsplayer();
        String url = "rtsp://ahlawat.servehttp.com/live.sdp";
        String recfile = "/mnt/sdcard/rec.mov";
        player.CreateRec(url, recfile, 1, 10, 10, 30);
    }
}