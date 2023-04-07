package TodoList.servise;

import TodoList.entity.TodoList;
import TodoList.repository.TodoListRepository;

public class TodoListServiseImpl implements TodoListServise{

    private TodoListRepository todoListRepository;

    public TodoListServiseImpl (TodoListRepository todoListRepository){
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showTodo() {
        
        TodoList[] model = todoListRepository.getAll();
        
        for(int i=0;i<model.length;i++){
            if(model[i] != null){
                var no = i+1;
                System.out.println(no+". "+model[i].getTodo());
            }
        }

    }

    @Override
    public void showAdd(String todo) {

        TodoList todoList = new TodoList(todo);
        todoListRepository.addTodo(todoList);
    
    }

    @Override
    public void showRemove(Integer todo) {
        
        boolean sukses = todoListRepository.removeTodo(todo);
        if(sukses){
            System.out.println("berhasil menghapus data");
            showTodo();
        }
        else{
            System.out.println("Gagal menghapus data");
            showTodo();
        }
        
    }
    
}
