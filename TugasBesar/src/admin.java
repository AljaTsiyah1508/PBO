/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class admin {
    
    private int adminId;
    private String userId;
    private String nama;
    private String email;

    
    public admin(int adminId, String userId, String nama, String email) {
       this.adminId = adminId;
       this.userId = userId;
       this.email = email;

    }

    public int getAdminId() {
        return adminId;
    }

    public String getUserId() {
        return userId;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
