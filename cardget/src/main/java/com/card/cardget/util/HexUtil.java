package com.card.cardget.util;

public class HexUtil {
        public static final String bytesToHexString(byte[] bArray) {
            StringBuffer sb = new StringBuffer(bArray.length);
            String sTemp;
            for (int i = 0; i < bArray.length; i++) {
                        sTemp = Integer.toHexString(0xFF & bArray[i]);
                if (sTemp.length() < 2)
                    sb.append(0);
                sb.append(sTemp.toUpperCase());
            }
            return sb.toString();
        }
        //去头部的0
        public static final String HextoString(String hex){
            if (hex.charAt(0)=='0'){
                hex=hex.substring(1);
            }
            return hex;
        }
}
