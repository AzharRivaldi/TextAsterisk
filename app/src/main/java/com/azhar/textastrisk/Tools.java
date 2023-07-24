package com.azhar.textastrisk;

import androidx.annotation.NonNull;

/**
 * Created by Azhar Rivaldi on 22-06-2023
 * Youtube Channel : https://bit.ly/2PJMowZ
 * Github : https://github.com/AzharRivaldi
 * Twitter : https://twitter.com/azharrvldi_
 * Instagram : https://www.instagram.com/azhardvls_
 * LinkedIn : https://www.linkedin.com/in/azhar-rivaldi
 */

public class Tools {

    @NonNull
    public static String setAstriskText(String strData) {
        String strValue;
        int iLength = strData.length();
        if (strData.isEmpty() || strData.equals("null")) {
            strValue = "-";
        } else if (iLength == 1) {
            strValue = "****";
        } else if (iLength == 2 || iLength == 3) {
            strValue = strData.replace(strData.substring(1, 2), "****");
        } else {
            int iStart = (iLength / 2) - 1;
            int iEnd = iLength - 1;
            strValue = strData.replace(strData.substring(iStart, iEnd), "****");
        }
        return strValue;
    }

}
