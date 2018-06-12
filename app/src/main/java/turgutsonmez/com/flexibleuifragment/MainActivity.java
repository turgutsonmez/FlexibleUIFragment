package turgutsonmez.com.flexibleuifragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  @Override
  public void sendData(int position) {

    FragmentAciklama fragmentAciklama = (FragmentAciklama) getFragmentManager().findFragmentById(R.id.landFragmentAciklama);

    //lanscape mod
    if (fragmentAciklama != null && fragmentAciklama.isVisible()) {
      fragmentAciklama.konuAciklamasi(position);
    }
    //portraid mod
    else {
      Intent intent = new Intent(this, DigerActivity.class);
      intent.putExtra("position", position);
      startActivity(intent);
    }
  }
}
