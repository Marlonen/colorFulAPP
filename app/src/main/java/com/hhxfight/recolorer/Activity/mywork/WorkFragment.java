package com.hhxfight.recolorer.Activity.mywork;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.hhxfight.recolorer.Activity.color.view.FeatureImageAdapter;
import com.hhxfight.recolorer.R;
import com.shizhefei.fragment.LazyFragment;

import java.util.ArrayList;

public class WorkFragment extends LazyFragment {
	public static final String INTENT_INT_INDEX = "HHX";

	private GridView gv_featureimage;
	private ArrayList<Integer> manifoldList = new ArrayList<>();
	private ArrayList<Integer> userManifoldList = new ArrayList<>();
	private ArrayList<Integer> grayList = new ArrayList<>();
	private ArrayList<Integer> colorList = new ArrayList<>();

	@Override
	protected void onCreateViewLazy(Bundle savedInstanceState) {
		super.onCreateViewLazy(savedInstanceState);
		setContentView(R.layout.fragment_featureimage);
		init();
	}
	
	private void init() {
		if (0 == getArguments().getInt(INTENT_INT_INDEX)) {
			manifoldList.clear();
			for (int i = 0; i <= 20; i++) {
				int drawable = getActivity().getResources().getIdentifier("sys" + i + "",
						"drawable", getActivity().getPackageName());
				manifoldList.add(drawable);
			}
			gv_featureimage = (GridView) findViewById(R.id.gv_featureimage);
			gv_featureimage.setAdapter(new FeatureImageAdapter(getActivity(), manifoldList, 0));
			gv_featureimage.setOnItemClickListener(new AdapterView.OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
					view.setSelected(true);
					System.out.println("!!!!!!");
				}
			});
		}

		if (1 == getArguments().getInt(INTENT_INT_INDEX)) {
			userManifoldList.clear();
			for (int i = 1; i <= 3; i++) {
				int drawable = getActivity().getResources().getIdentifier("onedim" + i + "",
						"drawable", getActivity().getPackageName());
				userManifoldList.add(drawable);
			}
			gv_featureimage = (GridView) findViewById(R.id.gv_featureimage);
			gv_featureimage.setAdapter(new FeatureImageAdapter(getActivity(), userManifoldList, 0));
			gv_featureimage.setOnItemClickListener(new AdapterView.OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
					view.setSelected(true);
					System.out.println("!!!!!!");
				}
			});
		}

		if (2 == getArguments().getInt(INTENT_INT_INDEX)) {
			grayList.clear();
			for (int i = 1; i <= 3; i++) {
				int drawable = getActivity().getResources().getIdentifier("g" + i + "",
						"drawable", getActivity().getPackageName());
				grayList.add(drawable);
			}
			gv_featureimage = (GridView) findViewById(R.id.gv_featureimage);
			gv_featureimage.setAdapter(new FeatureImageAdapter(getActivity(), grayList, 1));
		}

		if (3 == getArguments().getInt(INTENT_INT_INDEX)) {
			colorList.clear();
			for (int i = 1; i <= 3; i++) {
				int drawable = getActivity().getResources().getIdentifier("c" + i + "",
						"drawable", getActivity().getPackageName());
				colorList.add(drawable);
			}
			gv_featureimage = (GridView) findViewById(R.id.gv_featureimage);
			gv_featureimage.setAdapter(new FeatureImageAdapter(getActivity(), colorList, 1));
		}


	}

	@Override
	public void onDestroyViewLazy() {
		super.onDestroyViewLazy();
	}

}
