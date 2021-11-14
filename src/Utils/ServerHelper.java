/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;
import DAL.Entity.Staff;
import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author Hoang Tue
 */
public class ServerHelper {

    public static final Image APP_ICON;
    public static final ImageIcon APP_ICON_1;

    static {

        String file = "/img/logos.png";
        APP_ICON = new ImageIcon(ServerHelper.class.getResource(file)).getImage();
        APP_ICON_1 = new ImageIcon(SecurityManager.class.getResource(file));
    }
// Tạo mới thư mục để lưu

    public static boolean saveLogo(File file) {
        File CheckFile = new File("Logos");
        if (!CheckFile.exists()) {
            CheckFile.mkdirs();
        }
        File newFile = new File(CheckFile, file.getName());
        try {
            Path source = Paths.get(file.getAbsolutePath());
            Path destination = Paths.get(newFile.getAbsolutePath());
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (Exception e) {
            System.out.println("Code lỗi");
            e.printStackTrace();
            return false;

        }

    }
//đọc 

    public static ImageIcon readLogo(String fileName) {
        File page = new File("Logos", fileName);
        return new ImageIcon(new ImageIcon(page.getAbsolutePath()).getImage()
                .getScaledInstance(190, 190, Image.SCALE_DEFAULT)
        );
    }
    public static Staff URSER = null;

    public static void Out() {
        ServerHelper.URSER = null;
    }

    public boolean CheckLogin() {
        return ServerHelper.URSER != null;
    }

    public boolean CheckName(JTextField txt) {
        txt.setBackground(Color.white);
        String id = txt.getText();
        String rgs = "^[A-Za-zÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ ]{3,25}$";
        if (id.matches(rgs)) {
            return true;
        } else {
            txt.setBackground(Color.pink);
            txt.requestFocus();
            BoxDiaglog.alert(txt.getRootPane(), txt.getName() + "Tên phải tiếng việt có dấu hoặc viết thường từ: /n[3-25] ký tự");
            return false;
        }

    }

    public boolean CheckSDT(JTextField txt) {
        txt.setBackground(Color.white);
        String id = txt.getText();
        String rgx = "(086|096|097|098|032|033|034|035|036|037|038|039|089|090|093|070|079|077|078|076|088|091|094|083|084|085|081|082|092|056|058|099|059)[0-9]{7}";
        if (id.matches(rgx)) {
            return true;
        } else {
            txt.setBackground(Color.pink);
            txt.requestFocus();
            BoxDiaglog.alert(txt.getRootPane(), txt.getName() + "SDT phải gồm 10 số \n Phải đúng đầu số các nhà mạng");
            return false;
        }

    }

    public boolean CheckEmail(JTextField txt) {
        txt.setBackground(Color.white);
        String id = txt.getText();
        String rgx = "^[a-zA-Z][a-zA-Z0-9_\\.]{2,32}@[a-zA-Z0-9]{2,10}(\\.[a-zA-Z0-9]{2,4}){1,2}$";
        if (id.matches(rgx)) {
            return true;

        } else {
            txt.setBackground(Color.pink);
            txt.requestFocus();
            BoxDiaglog.alert(txt.getRootPane(), txt.getName() + "Không đúng định dạng");
            return false;
        }

    }
}
