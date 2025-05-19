<script setup lang="ts">
import {ref} from "vue";
import {useTaskStore} from "../../stores/task.ts";

const inputRef = ref<HTMLInputElement | null>(null);

const taskStore = useTaskStore();

const addTask = () => {
  const name = inputRef.value !.value;
  taskStore.addTask(name);
  inputRef.value !.value = '';
}

</script>

<template>
  tasks
  <div>
    <input type="text" ref="inputRef"/>
    <button @click="addTask()">添加</button>
  </div>

  <div v-for="(task,i) in taskStore.tasks">
    <div>
      <router-link :to="{name:'task' ,params:{id:task.id}}">
        {{ task.id }}
        {{ task.name }}
      </router-link>

      <button @click="taskStore.deleteTask(i)">删除</button>
    </div>
  </div>
</template>

<style scoped>

</style>