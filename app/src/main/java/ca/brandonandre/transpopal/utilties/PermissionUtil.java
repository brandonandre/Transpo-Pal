package ca.brandonandre.transpopal.utilties;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.content.ContextCompat;

/**
 * Created by brandonandre on 2018-03-25.
 */

public class PermissionUtil {

    /**
     * See if the user has given permission to use location or not. And handle the request
     * if it has been turned off.
     */
    public static boolean requestLocationAccess(Context context) {

        // The permissions we want to check
        String fineLocation = Manifest.permission.ACCESS_FINE_LOCATION;
        String coarseLocation = Manifest.permission.ACCESS_COARSE_LOCATION;

        // First we check if the user currently has permission
        if (ContextCompat.checkSelfPermission(context, fineLocation)
                != PackageManager.PERMISSION_GRANTED) {

        } else {
            // User currently has permission!
            return true;
        }
    }

}
