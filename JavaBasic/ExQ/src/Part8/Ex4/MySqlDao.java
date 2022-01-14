package Part8.Ex4;

public class MySqlDao implements DataAccessObject{
    @Override
    public void select() {
        System.out.println("[SQL] Select");
    }

    @Override
    public void insert() {
        System.out.println("[SQL] Insert");
    }

    @Override
    public void update() {
        System.out.println("[SQL] Update");
    }

    @Override
    public void delete() {
        System.out.println("[SQL] Delete");
    }
}
