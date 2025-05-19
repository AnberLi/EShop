import {useTaskStore} from "../stores/task.ts";

export const useCurrentTask = (id: number) => {
    const taskStore = useTaskStore();
    const task = taskStore.tasks.find(task => task.id === id);

    return {task};
}