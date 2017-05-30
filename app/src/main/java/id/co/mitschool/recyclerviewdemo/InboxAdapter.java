package id.co.mitschool.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kakaroto on 30/05/17.
 */

public class InboxAdapter extends RecyclerView.Adapter<InboxAdapter.InboxViewHolder> {
    private List<Inbox> dataset;

    public InboxAdapter(List<Inbox> dataset) {
        this.dataset = dataset;
    }

    public void remove(List<Inbox> dataset, int index) {
        dataset.remove(index);
        notifyDataSetChanged();
    }

    @Override
    public InboxViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_inbox, parent, false);
        return new InboxViewHolder(view);
    }

    @Override
    public void onBindViewHolder(InboxViewHolder holder, int position) {
        Inbox inbox = dataset.get(position);

        holder.tvName.setText(inbox.getName());
        holder.tvMessage.setText(inbox.getMessage());
        holder.tvTime.setText(inbox.getTime());
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    class InboxViewHolder extends ViewHolder {
        TextView tvName, tvMessage, tvTime;

        public InboxViewHolder(View itemView) {
            super(itemView);

            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            tvMessage = (TextView) itemView.findViewById(R.id.tv_messsage);
            tvTime = (TextView) itemView.findViewById(R.id.tv_time);
        }
    }

}
