package models;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "tasks")
public class Task extends Model {

    @Id
    private Long id;

    @Constraints.Required
    @Formats.NonEmpty
    private String description;

    public static Finder<Long,Task> find = new Finder<>(Long.class, Task.class);

    public Long getId () {
        return id;
    }

    public String getDescription () {
        return description;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public static List<Task> all() {
        return find.all();
    }

    public static void delete(Long id) {
    }

//    public enum Status {
//        NEW("New"), OPEN("Open"), CLOSED("Closed");
//
//        private String title;
//
//        private Status(String title) {
//            this.title = title;
//        }
//
//        public String getTitle() {
//            return this.title;
//        }
//    }
}
