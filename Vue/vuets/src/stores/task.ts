import {defineStore} from 'pinia'
import {ref} from "vue";

export const useTaskStore = defineStore('task', () => {
    const tasks = ref<{ name: String, id: number }[]>([]);

    const addTask = (taskName: string) => {
        if (!taskName) {
            return;
        }
        tasks.value.push({
            id: tasks.value.length,
            name: taskName
        })
    }

    const deleteTask = (index: number) => {
        tasks.value.splice(index, 1);
    };

    return {
        addTask,
        deleteTask,
        tasks
    }
})