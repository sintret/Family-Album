package com.andif.keluargaali;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

	private Context mContext;

	// constructor
	public ImageAdapter(Context c) {
		mContext = c;
	}

	public static Integer[] mThumbsId = { R.drawable.ali, R.drawable.papah,
			R.drawable.mamah, R.drawable.papahali, R.drawable.mamahali,
			R.drawable.mbahkumis, R.drawable.dino, R.drawable.santo,
			R.drawable.gopar, R.drawable.ita, R.drawable.aisyah,
			R.drawable.pipin, R.drawable.atta, R.drawable.lila,
			R.drawable.jordan, R.drawable.farel, R.drawable.marni,
			R.drawable.nonik, R.drawable.cici, R.drawable.surya

	};

	public static String[] thumbString = { "Ali Yang Ngganteng Kayak Papahnya",
			"Papah handsome", "Mamah", "Papah and Ali", "Mamah and  Ali",
			"Mbah Kumis", "Uncle Dino", "Uncle Santo", "Uncle Gopar",
			"Aunt Ita", "Aisyah", "Pipin", "Atta", "Lila Brekele", "Jordan",
			"Farel", "Grandmother Marni", "Nonik", "Cici", "Surya" };

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mThumbsId.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View view, ViewGroup group) {
		// TODO Auto-generated method stub
		ImageView imageView;
		if (view == null) {
			imageView = new ImageView(mContext);
			int h = mContext.getResources().getDisplayMetrics().densityDpi;
			imageView
					.setLayoutParams(new GridView.LayoutParams(h - 45, h - 45));
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageView.setPadding(1, 1, 1, 1);
		} else {
			imageView = (ImageView) view;

		}
		imageView.setImageResource(mThumbsId[position]);
		return imageView;
	}

}
