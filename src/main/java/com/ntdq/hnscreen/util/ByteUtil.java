package com.ntdq.hnscreen.util;

import java.io.ByteArrayOutputStream;
import java.util.Calendar;
import java.util.Date;

/**
 * 字节工具类
 */
public class ByteUtil {

    /**
     * 字节数组的复制
     *
     * @param sourceBytes
     * @param targetBytes
     * @param beginIndex
     * @return
     */
    public static byte[] copyBytes(byte[] sourceBytes, byte[] targetBytes, int beginIndex) {
        if (targetBytes == null) {
            return sourceBytes;
        }
        int targetSize = targetBytes.length;
        if (sourceBytes == null) {
            beginIndex = 0;
            sourceBytes = new byte[targetSize];
        }
        int sourceSize = sourceBytes.length;
        if (sourceSize - beginIndex < targetSize) {
            return sourceBytes;
        } else {
            for (int i = 0; i < targetSize; i++) {
                sourceBytes[beginIndex + i] = targetBytes[i];
            }
        }
        return sourceBytes;
    }


    /**
     * @param @param  i
     * @param @return
     * @return byte[]
     * @throws
     * @Title: intToByteArray
     * @Description: int 转换成 byte数组
     */
    public static byte[] intToByteArray(int i) {
        byte[] result = new byte[4];
        result[0] = (byte) ((i >> 24) & 0xFF);
        result[1] = (byte) ((i >> 16) & 0xFF);
        result[2] = (byte) ((i >> 8) & 0xFF);
        result[3] = (byte) (i & 0xFF);
        return result;
    }

    /**
     * 整数转化为字节 大端模式
     *
     * @param n
     * @return
     */
    public static byte[] intToBytesBig(int n) {
        byte[] src = new byte[2];
        src[0] = (byte) ((n >> 8) & 0xFF);
        src[1] = (byte) (n & 0xFF);
        return src;
    }

    /**
     * 小端序 int转字节数组
     *
     * @param i
     * @return
     */
    public static byte[] littleEndian(int i) {
        int byte1 = i & 0XFF;
        int byte2 = (i & 0XFF << 8) >> 8;
        return new byte[]{(byte) byte1, (byte) byte2};
    }

    /**
     * @param @param  val
     * @param @return
     * @return byte[]
     * @throws
     * @Title: shortToByteArray
     * @Description: short 转换成 byte[]
     */
    public static byte[] shortToByteArray(short val) {
        byte[] b = new byte[2];
        b[0] = (byte) ((val >> 8) & 0xff);
        b[1] = (byte) (val & 0xff);
        return b;
    }

    /**
     * @param @param  bytes
     * @param @return
     * @return int
     * @throws
     * @Title: byteArrayToInt
     * @Description: byte[] 转换成 int
     */
    public static int byteArrayToInt(byte[] bytes) {
        int value = 0;
        for (int i = 0; i < 4; i++) {
            int shift = (3 - i) * 8;
            value += (bytes[i] & 0xFF) << shift;
        }
        return value;
    }

    /**
     * @param @param  bytes
     * @param @return
     * @return short
     * @throws
     * @Title: byteArrayToShort
     * @Description: byte[] 转换成short
     */
    public static short byteArrayToShort(byte[] bytes) {
        short value = 0;
        for (int i = 0; i < 2; i++) {
            int shift = (1 - i) * 8;
            value += (bytes[i] & 0xFF) << shift;
        }
        return value;
    }


//    public static byte[] hexStringToBytes(String hexString) {
//        if (hexString == null || hexString.equals("")) {
//            return null;
//        }
//        hexString = hexString.toUpperCase(); // 十六进制转大写字母
//        int length = hexString.length() / 2; // 获取十六进制的长度，2个字符为一个十六进制
//        char[] hexChars = hexString.toCharArray();
//        byte[] d = new byte[length];
//        for (int i = 0; i < length; i++) {
//            int pos = i * 2;
//            d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
//        }
//        return d;
//    }
//    private static byte charToByte(char c) {
//        return (byte) "0123456789ABCDEF".indexOf(c);
//    }

    /**
     * @param @param  date
     * @param @return
     * @return byte[]
     * @throws
     * @Title: date2HByte
     * @Description: 日期转换成 CP56Time2a
     */
    public static byte[] date2Hbyte(Date date) {
        ByteArrayOutputStream bOutput = new ByteArrayOutputStream();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        // 毫秒需要转换成两个字节其中 低位在前高位在后 
        // 先转换成short
        int millisecond = calendar.get(Calendar.SECOND) * 1000 + calendar.get(Calendar.MILLISECOND);

        // 默认的高位在前
        byte[] millisecondByte = intToByteArray(millisecond);
        bOutput.write((byte) millisecondByte[3]);
        bOutput.write((byte) millisecondByte[2]);

        // 分钟 只占6个比特位 需要把前两位置为零 
        bOutput.write((byte) calendar.get(Calendar.MINUTE));
        // 小时需要把前三位置零
        bOutput.write((byte) calendar.get(Calendar.HOUR_OF_DAY));
        // 星期日的时候 week 是0 
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        if (week == Calendar.SUNDAY) {
            week = 7;
        } else {
            week--;
        }
        // 前三个字节是 星期 因此需要将星期向左移5位  后五个字节是日期  需要将两个数字相加 相加之前需要先将前三位置零
        bOutput.write((byte) (week << 5) + (calendar.get(Calendar.DAY_OF_MONTH)));
        // 前四字节置零
        bOutput.write((byte) ((byte) calendar.get(Calendar.MONTH) + 1));
        bOutput.write((byte) (calendar.get(Calendar.YEAR) - 2000));
        return bOutput.toByteArray();
    }


    /**
     * @param @param  date
     * @param @return
     * @return byte[]
     * @throws
     * @Title: date2HByte
     * @Description:CP56Time2a转换成 时间
     */
    public static Date byte2Hdate(byte[] dataByte) {
        int year = (dataByte[6] & 0x7F) + 2000;
        int month = dataByte[5] & 0x0F;
        int day = dataByte[4] & 0x1F;
        int hour = dataByte[3] & 0x1F;
        int minute = dataByte[2] & 0x3F;
        int second = dataByte[1] > 0 ? dataByte[1] : (int) (dataByte[1] & 0xff);
        int millisecond = dataByte[0] > 0 ? dataByte[0] : (int) (dataByte[0] & 0xff);
        millisecond = (second << 8) + millisecond;
        second = millisecond / 1000;
        millisecond = millisecond % 1000;
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, millisecond);
        return calendar.getTime();
    }

    public static String byteArrayToHexString(byte[] array) {
        return byteArray2HexString(array, Integer.MAX_VALUE, false);
    }

    public static String bytesToHexString(byte[] bArray) {
        StringBuffer sb = new StringBuffer(bArray.length);
        String sTemp;
        for (int i = 0; i < bArray.length; i++) {
            sTemp = Integer.toHexString(0xFF & bArray[i]);
            if (sTemp.length() < 2) {
                sb.append(0);
            }
            sb.append(sTemp.toUpperCase());
        }
        return sb.toString();
    }


    public static String byteArray2HexString(byte[] arrBytes, int count, boolean blank) {
        String ret = "";
        if (arrBytes == null || arrBytes.length < 1) {
            return ret;
        }
        if (count > arrBytes.length) {
            count = arrBytes.length;
        }
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            ret = Integer.toHexString(arrBytes[i] & 0xFF).toUpperCase();
            if (ret.length() == 1) {
                builder.append("0").append(ret);
            } else {
                builder.append(ret);
            }
            if (blank) {
                builder.append(" ");
            }
        }

        return builder.toString();

    }

    /**
     * 返回指定位置的数组
     *
     * @param bytes
     * @param start  开始位置
     * @param length 截取长度
     * @return
     */
    public static byte[] getByte(byte[] bytes, int start, int length) {
        byte[] ruleByte = new byte[length];
        int index = 0;
        while (index < length) {
            ruleByte[index++] = bytes[start++];
        }
        return ruleByte;
    }


    /**
     * 十六进制字符串转换成byte数组
     *
     * @param hexStr
     * @return
     */
    public static byte[] hexStringToBytes(String hexStr) {
        hexStr = hexStr.replaceAll(" ", "");
        hexStr = hexStr.toUpperCase();
        int len = (hexStr.length() / 2);
        byte[] result = new byte[len];
        char[] achar = hexStr.toCharArray();
        for (int i = 0; i < len; i++) {
            int pos = i * 2;
            result[i] = (byte) (toByte(achar[pos]) << 4 | toByte(achar[pos + 1]));
        }
        return result;
    }

    private static int toByte(char c) {
        byte b = (byte) "0123456789ABCDEF".indexOf(c);
        return b;
    }


    public static void main(String[] agrwu) {
        byte[] bytes = new byte[4];
        bytes[0] = 0;
        bytes[1] = 0;
        bytes[2] = -56;
        bytes[3] = 66;
        String s = ByteUtil.bytesToHexString(bytes);
        System.out.println(s);
        System.out.println(byteArrayToHexString(hexStringToBytes("68 14 8c 00 02 00 1e 01 03 00 01 00 0a 00 00 2d ad 28 0b 1c 09 14")));
       // System.out.println(Float.valueOf(toFloat(s)));




    }
}
