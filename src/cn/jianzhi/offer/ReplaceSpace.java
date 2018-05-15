package cn.jianzhi.offer;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * <p>
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * <p>
 * 解决思路
 * 从后往前走，遇到空格就替换。
 */
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        int length = str.length();
        if (str == null || length == 0) return "";
        int numberOfBlank = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') numberOfBlank++;
        }
        if (numberOfBlank == 0) return str.toString();
        int newLength = length + 2 * numberOfBlank;
        str.setLength(newLength);
        int indexOfOriginal = length - 1;
        int indexOfNew = newLength - 1;
        while (indexOfOriginal >= 0 && indexOfNew >= indexOfOriginal) {
            if (str.charAt(indexOfOriginal) == ' ') {
                str.setCharAt(indexOfNew--, '0');
                str.setCharAt(indexOfNew--, '2');
                str.setCharAt(indexOfNew--, '%');
            } else {
                str.setCharAt(indexOfNew--, str.charAt(indexOfOriginal));
            }
            indexOfOriginal--;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        ReplaceSpace rs = new ReplaceSpace();
        StringBuffer str = new StringBuffer("We Are Happy.");
        String ret = rs.replaceSpace(str);
        System.out.println(ret);
    }
}
