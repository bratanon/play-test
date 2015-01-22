package controllers;

import models.Task;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import static play.data.Form.form;

/**
 * Created by anon on 1/21/15.
 */
public class TaskController extends Controller {

    public static Result index() {
        return ok(index.render(form(Task.class), Task.all()));
    }

    public static Result addTask() {
        Form<Task> taskForm = form(Task.class).bindFromRequest();

        if(taskForm.hasErrors()) {
            return badRequest(index.render(taskForm, Task.all()));
        }
        Task task = taskForm.get();
        task.save();

        return redirect(routes.TaskController.index());
    }

    public static Result removeTask(Long id) {
        Task.delete(id);

        return redirect(routes.TaskController.index());
    }
}
