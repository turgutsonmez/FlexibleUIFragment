package turgutsonmez.com.flexibleuifragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentAciklama extends Fragment {

  TextView aciklama;
  String[] aciklamalar;

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_aciklama, container, false);
    aciklama = view.findViewById(R.id.txtAciklama);
    aciklamalar = getResources().getStringArray(R.array.aciklamalar);
    aciklama.setText(aciklamalar[0]);


    return view;
  }

  public void konuAciklamasi(int pos) {
    
    aciklama.setText(aciklamalar[pos]);
  }
}
