package TodoList.repository;

import TodoList.entity.TodoList;

public interface TodoListRepository {
    
    TodoList[] getAll();

    void addTodo(TodoList todo);

    boolean removeTodo(Integer todo);

}
