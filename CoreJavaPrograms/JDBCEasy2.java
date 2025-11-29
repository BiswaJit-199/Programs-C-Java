class JDBCEasy2 {
    public static void main(String[] args) throws Exception{
        System.out.println("Simple prepared-statement pattern (skeleton, not runnable without DB)");
        // try (Connection c = DriverManager.getConnection(url,user,pass)) { PreparedStatement p = c.prepareStatement("SELECT * FROM tbl WHERE id=?"); p.setInt(1,1); ResultSet rs = p.executeQuery(); }
    }
}
