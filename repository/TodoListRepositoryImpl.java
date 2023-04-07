package TodoList.repository;

import TodoList.entity.TodoList;

public class TodoListRepositoryImpl implements TodoListRepository {

    public TodoList[] data = new TodoList[10];

    @Override
    public TodoList[] getAll() {

        return data;
    }

    @Override
    public void addTodo(TodoList todo) {

        for(int i=0;i<data.length;i++){
            if(data[i] == null){
                data[i] = todo;
                break;
            }
        }
        
    }

    @Override
    public boolean removeTodo(Integer todo) {
        
        if((todo-1) >= data.length){
            return false;
        }
        else if (data[todo-1] ==  null){
            return false;
        }
        else{
            for(int i=(todo-1);i<data.length;i++){
                if(i ==(data.length-1)){
                    data[i] = null;
                }
                else{
                    data[i] = data[i+1];
                }
            }
        }
        return true;
        
    }
    
}
