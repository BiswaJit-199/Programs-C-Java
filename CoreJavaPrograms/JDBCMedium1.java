class JDBCMedium1 {
    // Example using H2 in-memory database (can run if H2 jar on classpath)
    public static void main(String[] args) throws Exception{
        Class.forName("org.h2.Driver");
        try(java.sql.Connection c = java.sql.DriverManager.getConnection("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1")){
            try(java.sql.Statement s = c.createStatement()){ s.execute("CREATE TABLE t(id INT PRIMARY KEY, name VARCHAR(20))"); s.execute("INSERT INTO t VALUES(1,'Alice')"); try(java.sql.ResultSet rs = s.executeQuery("SELECT * FROM t")){ while(rs.next()) System.out.println(rs.getInt(1)+" "+rs.getString(2)); } }
        } catch (NoClassDefFoundError e) { System.out.println("Add H2 jar to classpath to run this example"); }
    }
}
