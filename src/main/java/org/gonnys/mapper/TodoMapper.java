package org.gonnys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.gonnys.domain.Todo;

public interface TodoMapper {

	
//	 @Select("select * from tbl_todo")
	 public List<Todo> selectTodo();
	 
	 
//	 @Insert("insert into tbl_todo (title) values #{title}")
	 public void insertTodo(String title);
	 
	 
//	 @Delete("delete from tbl_todo where tno = #{tno}")
	 public void deleteTodo(Integer tno);
	 
//	 @Update("update tbl_todo set title = #{title} where tno = #{tno}")
	 public void updateTodo(Todo todo);

	 
	 
}
