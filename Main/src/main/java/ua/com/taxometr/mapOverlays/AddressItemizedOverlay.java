package ua.com.taxometr.mapOverlays;

import android.graphics.drawable.Drawable;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ibershadskiy <a href="mailto:iBersh20@gmail.com">Ilya Bershadskiy</a>
 * @since 31.03.12
 */
public class AddressItemizedOverlay extends ItemizedOverlay<OverlayItem> {
    private final List<OverlayItem> overlayItems = new ArrayList<OverlayItem>();

    /**
     * Constructor for {@link AddressItemizedOverlay}
     * @param defaultMarker default marker image for overlay items
     */
    public AddressItemizedOverlay(Drawable defaultMarker) {
        super(boundCenterBottom(defaultMarker));
    }

    /**
     * Uses for adding {@link com.google.android.maps.OverlayItem} to {@link com.google.android.maps.ItemizedOverlay}
     * @param overlayItem new overlay item
     */
    public void addOverlay(OverlayItem overlayItem) {
        overlayItems.clear();
        overlayItems.add(overlayItem);
        populate();
    }

    @Override
    protected OverlayItem createItem(int i) {
        return overlayItems.get(i);
    }

    @Override
    public int size() {
        return overlayItems.size();
    }
}