package org.gonnys.controller;

import org.gonnys.domain.Todo;
import org.gonnys.mapper.TodoMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
public class TodoTests extends AbstractTests {

	@Setter(onMethod_ = @Autowired)
	private TodoMapper todoMapper;

	@Test
	public void testSelect() {
		log.info(todoMapper.selectTodo());
	}

	@Test
	public void testInsert() {
		todoMapper.insertTodo("왜 혼자하면 하나도 기억이 나지 않을까....");
	}

	@Test
	public void testDelete() {
		todoMapper.deleteTodo(1);
	}
	
	@Test
	public void testUpdate() {
		Todo todo = todoMapper.selectTodo().get(3);
		todo.setTitle("고니스가 수정하였음");
		todoMapper.updateTodo(todo);
	}
}
