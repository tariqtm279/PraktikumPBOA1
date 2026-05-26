/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

/**
 *
 * @author arsym
 */

/*
 * Nama pembuat = Arsy Thariq Munawar
 * NIM = 24060124120009
 * Deskripsi Program = Layanan Data Access Object terhadap tabel mahasiswa pada database
*/
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlMahasiswaService {
    private Connection koneksi;

    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }
    public Mahasiswa makeMhsObject(int id, String nama){
        return new Mahasiswa(id, nama);
    }
    public void add(Mahasiswa mhs) {
        String sql = "INSERT INTO mahasiswa(nama) VALUES (?)";

        try {
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setString(1, mhs.getNama());
            ps.executeUpdate();
            ps.close();

            System.out.println("Berhasil insert");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Mahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nama=? WHERE id=?";

        try {
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
            ps.close();

            System.out.println("Berhasil update");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM mahasiswa WHERE id=?";

        try {
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();

            System.out.println("Berhasil delete");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        String sql = "SELECT * FROM mahasiswa WHERE id=?";

        try {
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                mhs = new Mahasiswa(
                    rs.getInt("id"),
                    rs.getString("nama")
                );
            }

            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mhs;
    }

    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa";

        try {
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa(
                    rs.getInt("id"),
                    rs.getString("nama")
                );

                list.add(mhs);
            }

            rs.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
    
    public void indexReset(){
        String sql = "TRUNCATE TABLE mahasiswa"; // Langsung hapus semua data & reset ID ke 1
        try {
            Statement st = koneksi.createStatement();
            st.executeUpdate(sql);
            st.close();
            System.out.println("Berhasil mengosongkan tabel dan mereset indeks");
        } catch (SQLException e) {
            e.printStackTrace();
        }       
    }
    
    public boolean isEmpty(){
        String sql = "SELECT COUNT(*) AS total FROM mahasiswa";
        try {
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                int total = rs.getInt("total");
                rs.close();
                st.close();
                return total == 0;
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true; // Default mengembalikan true jika terjadi error
    }
    
    public void closeConnection(){
        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
                System.out.println("Koneksi database berhasil ditutup.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
