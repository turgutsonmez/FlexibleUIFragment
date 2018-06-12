package turgutsonmez.com.flexibleuifragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class FragmentKonu extends Fragment implements AdapterView.OnItemClickListener {

  ListView konuListesi;


  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_konu, container, false);

    konuListesi = view.findViewById(R.id.konularListesi);

    Adapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.konular, android.R.layout.simple_list_item_1);
    konuListesi.setAdapter((ListAdapter) adapter);
    konuListesi.setOnItemClickListener(this);

    return view;
  }

  @Override
  public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    MyListener listener = (MyListener) getActivity();
    listener.sendData(position);
  }
}
