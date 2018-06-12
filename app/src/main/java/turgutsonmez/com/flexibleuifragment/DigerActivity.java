package turgutsonmez.com.flexibleuifragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class DigerActivity extends AppCompatActivity {
  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_diger);

    Intent intent = getIntent();

    int pos = intent.getIntExtra("position", 0);

    FragmentAciklama fragmentAciklama= (FragmentAciklama) getFragmentManager().findFragmentById(R.id.fragmentAciklama);
    fragmentAciklama.konuAciklamasi(pos);
  }
}
