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
		todoMapper.insertTodo("�� ȥ���ϸ� �ϳ��� ����� ���� ������....");
	}

	@Test
	public void testDelete() {
		todoMapper.deleteTodo(1);
	}
	
	@Test
	public void testUpdate() {
		Todo todo = todoMapper.selectTodo().get(3);
		todo.setTitle("��Ͻ��� �����Ͽ���");
		todoMapper.updateTodo(todo);
	}
}
