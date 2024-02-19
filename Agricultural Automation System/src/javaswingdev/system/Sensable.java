
package javaswingdev.system;

public interface Sensable {
    public static final short[] PH_SCALE_R = { 255, 242, 248, 243, 179, 132, 78, 52, 32, 9, 69, 55, 88, 98, 70 };
    public static final short[] PH_SCALE_G = { 28, 103, 198, 236, 212, 194, 182, 170, 182, 185, 146, 83, 82, 70, 44 };
    public static final short[] PH_SCALE_B = { 38, 33, 17, 27, 51, 66, 72, 71, 106, 180, 202, 165, 162, 157, 130 };

    public static final short[] NPK_SCALE_R = { 174, 197, 223, 241, 254, 255, 254, 236, 214, 183, 156, 84, 20, 2, 2 };
    public static final short[] NPK_SCALE_G = { 1, 20, 45, 76, 141, 171, 200, 247, 239, 229, 216, 188, 171, 151, 126 };
    public static final short[] NPK_SCALE_B = { 42, 42, 42, 60, 90, 106, 125, 173, 148, 131, 114, 106, 96, 85, 70 };

    // public static final short[] PH_SCALE_R = { 255, 242, 248, 243, 179, 132, 78,
    // 52, 32, 9, 69, 55, 88, 98, 70 };
    // public static final short[] PH_SCALE_G = { 28, 103, 198, 236, 212, 194, 182,
    // 170, 182, 185, 146, 83, 82, 70, 44 };
    // public static final short[] PH_SCALE_B = { 38, 33, 17, 27, 51, 66, 72, 71,
    // 106, 180, 202, 165, 162, 157, 130 };

    public static final byte WATER_FLOW = 0;
    public static final byte PH = 1;
    public static final byte NPK = 2;
    public static final byte FOUR_IN_ONE = 3;
    public static final byte IRRIGATION = 5;
    public static final byte FERTILIZER = 6;
    public static final byte PEST = 7;
    public static final byte N = 1;
    public static final byte P = 2;
    public static final byte K = 3;
    public static final byte EC = 1;
    public static final byte MOISTURE = 2;
    public static final byte SALINITY = 3;
    public static final byte TEMPERATURE = 4;
    public static final byte EMAIL = 8;
    public static final byte HELP = 9;
    public static final byte CROP = 4;
   


}
