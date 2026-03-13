import java.sql.*;


public class ma{
    private static final String url="jdbc:mysql://localhost:3306/DEBA";
    private static final String username="root";
    private static final String password="fuckjob22";

    public static void main(String[] args)  {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");}
        catch(Exception e){
            System.out.println(e.getMessage());
        }


        try{
            Connection co= DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO EMPLOYEE(emp_id, full_name, age, position_name, department) VALUES(?, ?, ?, ?, ?)";
            PreparedStatement pt = co.prepareStatement(query);
            pt.setInt(1, 3);
            pt.setString(2, " Anukta Roy");
            pt.setInt(3, 25);
            pt.setString(4, "recruiter");
            pt.setString(5, "manager");
            int v =pt.executeUpdate();
            co.close();
            



            //Statement st= co.createStatement();
            //String query = "select * from EMPLOYEE";
            /*ResultSet  rs = st.executeQuery(query);
            while(rs.next()){
                int id= rs.getInt("emp_id");
                String emp_name = rs.getString("full_name");
                int  emp_age = rs.getInt("age");
                String position =rs.getString("position_name");
                String Departmentname = rs.getString("department");
                System.out.println("em_id"+ id );
                System.out.println("emp_name"+ emp_name );
                System.out.println("em_age"+ emp_age );
                System.out.println("emp_position"+ position );
                System.out.println("EMP_Department"+ Departmentname );
                String query =String.format("INSERT INTO EMPLOYEE( emp_id, full_name , age , position_name , department) Values(%o, '%s',%o,'%s', '%s')" , 2,
                    "Dabir", 34, "manager","Managment");*/
                //String query = String.format("UPDATE EMPLOYEE SET age = %d WHERE emp_id = %d", 34, 2);
              //  String query =" Delete from EMPLOYEE WHERE emp_id =2";
               // int  v =st.executeUpdate(query);


               if(v>0){
                    System.out.println("done");
                
                }
                else{
                    System.out.println("nothing");
                }



            }
            

        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        }
        }
  

