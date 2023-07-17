package test00;

import org.apache.commons.text.translate.UnicodeEscaper;
import org.apache.commons.text.translate.UnicodeUnescaper;

import javax.crypto.Mac;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class test5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest md = null;
        String strDes = null;
        String encName = "SHA-256";
        byte[] bt = "asd".getBytes();

        md = MessageDigest.getInstance(encName);
        md.update(bt);
        String str = bytesToHex(md.digest());
        System.out.println(str);


    }
    public static String bytesToHex(byte[] bytes) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < bytes.length; i++) {
            String hex = Integer.toHexString(bytes[i] & 0xFF);
            if (hex.length() < 2) {
                sb.append(0);
            }
            sb.append(hex);
        }
        return sb.toString();
    }
}
