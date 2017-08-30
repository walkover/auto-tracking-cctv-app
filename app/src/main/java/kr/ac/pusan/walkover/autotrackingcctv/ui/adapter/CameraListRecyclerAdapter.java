package kr.ac.pusan.walkover.autotrackingcctv.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import kr.ac.pusan.walkover.autotrackingcctv.R;
import kr.ac.pusan.walkover.autotrackingcctv.retrofit.CameraResponse;

public class CameraListRecyclerAdapter extends RecyclerView.Adapter<CameraListRecyclerViewHolder> {

    private static final String TAG = CameraListRecyclerAdapter.class.getSimpleName();

    private List<CameraResponse> mDataSet;

    public void changeDataSet(List<CameraResponse> dataSet) {
        mDataSet = dataSet;
    }

    @Override
    public CameraListRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.camera_card, parent, false);
        return new CameraListRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CameraListRecyclerViewHolder holder, int position) {
        CameraResponse cameraResponse = mDataSet.get(position);
        holder.setIpAddress(cameraResponse.getIpAddress());
        holder.setName(cameraResponse.getName());
    }

    @Override
    public int getItemCount() {
        return mDataSet != null ? mDataSet.size() : 0;
    }
}
