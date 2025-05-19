<script setup lang="ts">
import {useRouter} from 'vue-router';
import {useCurrentTask} from "../../composible/useCurrentTask.ts";

const route=useRouter();
const taskId=Number(route.currentRoute.value.params.id);
const {task}=useCurrentTask(taskId)
</script>

<template>
  task--
<!--  {{ $route.params.id }}-->
  --
  {{ task?.id }}
  {{ task?.name }}

</template>

<style scoped>

</style>