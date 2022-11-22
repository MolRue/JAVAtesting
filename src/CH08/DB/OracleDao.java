package CH08.DB;

public class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("Oracle DB 에서 검색");
	}
	public void insert() {
		System.out.println("Oracle DB 에 삽입");
	}
	public void update() {
		System.out.println("Oracle DB 를 수정");
	}
	public void delete() {
		System.out.println("Oracle DB 에서 삭제");
	}
	
}
