package com.amon.javaCrud.service;

import java.lang.reflect.Field;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

import com.amon.javaCrud.model.Task;
import com.amon.javaCrud.repository.TaskRepository;

class TaskServiceTest {

    @Mock
    private TaskRepository taskRepository;

    @InjectMocks
    private TaskService taskService;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldReturnAllTasks() throws Exception {
        // Arrange
        Task task1 = new Task("First Task", "Test description", false);
        setIdManually(task1, 1L);

        Task task2 = new Task("Second Task", "Another description", true);
        setIdManually(task2, 2L);

        when(taskRepository.findAll()).thenReturn(List.of(task1, task2));

        // Act
        List<Task> tasks = taskService.getAllTasks();

        // Assert
        assertEquals(2, tasks.size());
        assertEquals("First Task", tasks.get(0).getTitle());
    }

    // Helper to set private field 'id'
    private void setIdManually(Task task, Long id) throws Exception {
        Field idField = Task.class.getDeclaredField("id");
        idField.setAccessible(true);
        idField.set(task, id);
    }
}
