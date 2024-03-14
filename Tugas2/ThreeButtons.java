package Tugas2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThreeButtons implements ActionListener {
    private JButton btnText = new JButton("Tombol Teks");
    private JButton btnIcon = new JButton("Tombol Icon & Teks");
    private JButton btnInteraktif = new JButton("Tombol Interaktif");

    public ThreeButtons() {
        SwingUtilities.invokeLater(() -> {
            // Membuat objek JFrame dengan judul "Tiga Tombol"
            JFrame frame = new JFrame("Tiga Tombol");
            // Mengatur operasi default ketika tombol close di klik
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // Mengatur ukuran frame menjadi 400x200 piksel
            frame.setSize(400, 200);
            // Mengatur posisi frame agar muncul di tengah layar
            frame.setLocationRelativeTo(null);

            // Membuat objek ImageIcon dengan file gambar "Lambang-UM.png"
            ImageIcon icon = new ImageIcon("Lambang-UM.png");
            // Mengubah ukuran gambar menjadi 30x30 piksel
            icon = new ImageIcon(icon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
            // Mengatur ikon pada tombol btnIcon dan btnInteraktif
            btnIcon.setIcon(icon);
            btnInteraktif.setIcon(icon);

            // Mendapatkan ukuran tombol btnIcon
            Dimension buttonSize = btnIcon.getPreferredSize();
            // Mengatur ukuran tombol btnText, btnIcon, dan btnInteraktif menjadi sama
            btnText.setPreferredSize(buttonSize);
            btnIcon.setPreferredSize(buttonSize);
            btnInteraktif.setPreferredSize(buttonSize);

            // Membuat panel untuk menampung tombol-tombol
            JPanel buttonPanel = new JPanel(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.anchor = GridBagConstraints.NORTHWEST;
            gbc.insets = new Insets(0, 20, 10, 0);
            // Menambahkan tombol btnText ke panel dengan konfigurasi gbc
            buttonPanel.add(btnText, gbc);

            gbc.gridx = 1;
            gbc.gridy = 1;
            gbc.anchor = GridBagConstraints.CENTER;
            gbc.insets = new Insets(0, 0, 10, 0);
            // Menambahkan tombol btnIcon ke panel dengan konfigurasi gbc
            buttonPanel.add(btnIcon, gbc);

            gbc.gridx = 2;
            gbc.gridy = 2;
            gbc.anchor = GridBagConstraints.SOUTHEAST;
            // Menambahkan tombol btnInteraktif ke panel dengan konfigurasi gbc
            buttonPanel.add(btnInteraktif, gbc);

            // Menambahkan panel ke konten utama frame
            frame.getContentPane().add(buttonPanel, BorderLayout.CENTER);
            // Mengatur ukuran frame sesuai dengan komponen yang ada di dalamnya
            frame.pack();
            // Menampilkan frame ke layar
            frame.setVisible(true);
        });
    }

    public void actionPerformed(ActionEvent e) {
        // Mengecek apakah tombol yang ditekan adalah btnText
        if (e.getSource() == btnText) {
            // Menampilkan pesan dialog dengan teks "Anda telah menekan: " + teks pada tombol
            JOptionPane.showMessageDialog(null, "Anda telah menekan: " + e.getActionCommand());
        }
    }

    public static void main(String[] args) {
        // Membuat objek ThreeButtons
        ThreeButtons gui = new ThreeButtons();
        // Menambahkan ActionListener ke tombol-tombol
        gui.btnText.addActionListener(gui);
        gui.btnIcon.addActionListener(gui);
        gui.btnInteraktif.addActionListener(gui);
    }
}
