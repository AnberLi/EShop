<template>
  <div id="app">
    <Login></Login>
  </div>
</template>

<script>
import My from "@/components/router/My.vue"
import Demo1 from "@/components/Demo1.vue";
import Login from "@/components/Login.vue";

export default {
  name: 'App',
  components: {
    My,
    Demo1,
    Login
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
