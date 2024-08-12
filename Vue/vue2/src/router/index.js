import VueRouter from 'vue-router';
import Vue from "vue";
import Vue1 from "@/components/router/Vue1.vue";
import Vue2 from "@/components/router/Vue2.vue";
import My from "@/components/router/My.vue";
import vue11 from "@/components/router/vue1/Vue11.vue";

Vue.use(VueRouter)

const router = new VueRouter({
    routes: [
        {
            path: "/",
            name: "my",
            component: My,
            redirect: "/vue1"
        },
        {
            path: "/vue1",
            name: "vue1",
            component: Vue1,
            children: [
                {
                    path: "/vue1/vue11",
                    name: "vue11",
                    component: vue11
                }
            ]
        },
        {
            path: "/vue2",
            name: "vue2",
            component: Vue2
        }
    ]
})

export default router