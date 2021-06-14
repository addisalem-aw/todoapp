package com.addis.todoapp.domain;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.boot.test.autoconfigure.data.cassandra.DataCassandraTest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    private  Priority priority;
    private Date due_date;
    task(){}

    public task(String name, String description, Priority priority, Date due_date) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.due_date = due_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }
}
