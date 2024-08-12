import Vue from 'vue'
import App from './App.vue'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import axios from "axios";
import router from "./router/index";

//配置默认接口前缀
axios.defaults.baseURL = "http://localhost:8081";
//给axios重命名，非必要
Vue.prototype.$axios = axios;

Vue.config.productionTip = false

Vue.use(ElementUI);

new Vue({
  render: h => h(App),
  router: router
}).$mount('#app')
