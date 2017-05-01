package cordova-plugin-android-ocr;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class AndroidOCR extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("readText")) {
            this.readText(callbackContext);
            return true;
        }
        return false;
    }

    private void readText(CallbackContext callbackContext) {
        callbackContext.success("Called Successfully");
    }
}
