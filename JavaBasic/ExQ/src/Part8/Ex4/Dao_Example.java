package Part8.Ex4;

public class Dao_Example {
    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MySqlDao());
    }

    public static void dbWork(DataAccessObject dao){
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }
}
