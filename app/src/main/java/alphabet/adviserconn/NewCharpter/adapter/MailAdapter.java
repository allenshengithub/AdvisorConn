package alphabet.adviserconn.NewCharpter.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import alphabet.adviserconn.NewCharpter.bean.Mail;
import alphabet.adviserconn.R;
import butterknife.BindView;

/**
 * Created by Administrator on 2016/10/8.
 */

public class MailAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<Mail> list;

    public MailAdapter(Context context, List<Mail> list) {
        this.context = context;
        this.list = list;
    }

    public MailAdapter(Context context) {
        this.context = context;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewHolder holder = new ViewHolder(LayoutInflater.from(
                context).inflate(R.layout.list_item_mail, parent,
                false));
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ViewHolder) {
            ((ViewHolder) holder).timeTv.setText(list.get(position).getTime());
            ((ViewHolder) holder).senderTv.setText(list.get(position).getSenderName());
            ((ViewHolder) holder).contentTv.setText(list.get(position).getContent());
            ((ViewHolder) holder).titleTv.setText(list.get(position).getTitle());
        }
    }

    @Override
    public int getItemCount() {
        if (list == null || list.size() == 0) {
            return 0;
        }
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {

        return 0;
    }

    //  添加数据
    public void addData(int position, Mail mail) {
//      在list中添加数据，并通知条目加入一条
        list.add(position, mail);
        notifyItemInserted(position);
    }

    //  删除数据
    public void removeData(int position) {
        list.remove(position);
        notifyItemRemoved(position);
    }

    /**
     * ViewHolder的类，用于缓存控件
     */
    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView avatarIv;
        TextView timeTv;
        TextView senderTv;
        TextView titleTv;
        TextView contentTv;

        public ViewHolder(View itemView) {
            super(itemView);
            avatarIv = (ImageView) itemView.findViewById(R.id.avatar);
            timeTv = (TextView) itemView.findViewById(R.id.time);
            senderTv = (TextView) itemView.findViewById(R.id.sender);
            titleTv = (TextView) itemView.findViewById(R.id.title);
            contentTv = (TextView) itemView.findViewById(R.id.content);
        }
    }


}
