package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.chrono.MinguoChronology;
import java.time.chrono.MinguoDate;

public class Login extends JFrame implements ActionListener {


    JTextField text;//Giống với <input>
    JButton Next, Back;
    Login(){
        //App Background Color
        getContentPane().setBackground(Color.WHITE);
        //Vô hiệu hóa layout manager
        //phải chỉ định vị trí và kích thước thủ công
        //dùng setBounds(int x, int y, int width, int height).
        setLayout(null);
        //tìm kiếm một file ảnh login.png nằm trong thư mục icons trong classpath
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        //getScaledInstance(x,y,Image.SCALE_DEFAULT)tạo một bản sao của ảnh với kích thước mới
        //Image.SCALE_DEFAULT(chọn thuật toán mặc định để thay đổi kích thước ảnh)
        // SCALE_SMOOTH (cho hình ảnh mượt hơn), SCALE_FAST (cho tốc độ nhanh hơn).

        //Lấy ảnh từ ImageIcon và thay đổi kích thước:
        //i1.getImage() lấy đối tượng Image từ đối tượng ImageIcon (i1), đây là ảnh gốc.
        //getScaledInstance() thay đổi kích thước của ảnh gốc -> 550x500 pixel, với thuật toán mặc định (SCALE_DEFAULT).
        Image i = i1.getImage().getScaledInstance(550,500,Image.SCALE_DEFAULT);

        //Tạo một ImageIcon mới từ ảnh đã thay đổi kích thước
        //ImageIcon(i) tạo một ImageIcon từ ảnh đã được thay đổi kích thước ở bước trước,
        // ảnh này sẽ được sử dụng để hiển thị trong JLabel.
        ImageIcon i2 = new ImageIcon(i);

        //Tạo JLabel chứa ImageIcon
        //new JLabel(i2) tạo một JLabel chứa ảnh i2. JLabel này sẽ dùng để hiển thị ảnh trên giao diện.
        JLabel image = new JLabel(i2);
        //Đặt vị trí và kích thước của JLabel
        image.setBounds(450,0,550,500);
        //Thêm JLabel chứa ảnh vào container:
        //add(image) thêm JLabel này vào container cha.
        //Để đoạn mã này hoạt động, container cần sử dụng layout là null (tức là không dùng layout manager).
        add(image);
        //heading
        JLabel heading = new JLabel("QUIZ TEST");
        heading.setBounds(140,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(22,99,54));
        add(heading);

        //name
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(160,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(new Color(22,99,54));
        add(name);

        //input
        text = new JTextField();
        text.setBounds(80,200,300,25);
        text.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(text);

        //Next button
        Next = new JButton("Next");
        Next.setBounds(250,270,120,25);
        Next.setBackground(new Color(22,99,54));
        Next.setForeground(Color.WHITE);
        // Thêm Action cho button
        Next.addActionListener(this);
        add(Next);

        //Back button
        Back = new JButton("Back");
        Back.setBounds(100,270,120,25);
        Back.setBackground(new Color(22,99,54));
        Back.setForeground(Color.WHITE);
        Back.addActionListener(this);
        add(Back);

        setSize(1000,500);
        //x: Vị trí theo trục ngang (tính từ mép trái của màn hình hoặc container).
        //y: Vị trí theo trục dọc (tính từ mép trên của màn hình hoặc container).
        setLocation(200,150);
        // Hiển thị lên màn hình
        setVisible(true);

    }

    //Action cho Button
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Next){
            String name = text.getText();
            setVisible(false);
            new Rules(name);
        }else if(e.getSource() == Back) {

            System.exit(50);

        }

    }

    public static void main(String[] args) {
        new Login();
    }
}
