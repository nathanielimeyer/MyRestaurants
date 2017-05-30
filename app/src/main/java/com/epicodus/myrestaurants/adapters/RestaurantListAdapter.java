import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.epicodus.myrestaurants.models.Restaurant;
import com.epicodus.myrestaurants.R;

import java.util.ArrayList;

import butterknife.Bind;

public class RestaurantListAdapter extends RecyclerView.Adapter<RestaurantListAdapter.RestaurantViewHolder> {
    private ArrayList<Restaurant> mRestaurants = new ArrayList<>();
    private Context mContext;

    public RestaurantListAdapter(Context context, ArrayList<Restaurant> restaurants) {
        mContext = context;
        mRestaurants = restaurants;
    }

    public class RestaurantViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.restaurantImageView) ImageView mRestaurantImageView;
    }
}