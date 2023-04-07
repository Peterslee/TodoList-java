package TodoList;

import TodoList.entity.TodoList;
import TodoList.repository.TodoListRepository;
import TodoList.repository.TodoListRepositoryImpl;
import TodoList.servise.TodoListServise;
import TodoList.servise.TodoListServiseImpl;

public class TodoListRun {
    public static void main(String[] args) {
        tesShowRemove();
    }

    public static void tesShowTodo(){
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        TodoListServise todoListServise = new TodoListServiseImpl(todoListRepository);

        todoListRepository.data[0] = new TodoList("data ke 1");
        todoListRepository.data[1] = new TodoList("data ke 2");
        todoListServise.showTodo();

    }

    public static void tesShowAdd(){
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        TodoListServise todoListServise = new TodoListServiseImpl(todoListRepository);
        todoListServise.showAdd("Data ke 1");
        todoListServise.showAdd("Data ke 2");
        todoListServise.showTodo();
    }

    public static void tesShowRemove(){
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        TodoListServise todoListServise = new TodoListServiseImpl(todoListRepository);
        todoListServise.showAdd("Data ke 1");
        todoListServise.showAdd("Data ke 2");
        todoListServise.showAdd("Data ke 3");
        todoListServise.showTodo();
        todoListServise.showRemove(1);
    }
}
