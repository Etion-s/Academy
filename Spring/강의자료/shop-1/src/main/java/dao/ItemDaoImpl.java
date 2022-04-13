package dao;

import java.util.List;

import javax.sql.DataSource;

import logic.Item;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class ItemDaoImpl implements ItemDao {

	private SimpleJdbcTemplate template;

	// xml에서 설정한 Datasource를 파라미터로 가져온다
	// Spring의 JDBC접근 방법중 하나인 template를 활용해서 DB에 접근한다
	public void setDataSource(DataSource dataSource) {
		this.template = new SimpleJdbcTemplate(dataSource);
	}

	private static final String SELECT_ALL = "SELECT item_id, item_name, price, description, picture_url FROM item order by item_id";

	public List<Item> findAll() {
		RowMapper<Item> mapper = new BeanPropertyRowMapper<Item>(Item.class);
		return this.template.query(ItemDaoImpl.SELECT_ALL, mapper);
	}
	// 생성된 template의 query메소드를 활용해서 상수로 등록된 쿼리문을 실행하고 mapper에 저장한다 
	// RowMapper : 원하는 형태의 결과값 반환
	// BeanPropertyRowMapper : ResultSet -> Bean으로 변환
}















