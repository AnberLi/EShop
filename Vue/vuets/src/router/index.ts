import {createRouter,createWebHistory} from 'vue-router'

//配置路由
const routes = [
    {
        path:'/',
        name:'tasks',
        component:()=>import('../pages/Tasks/index.vue')
    },
    {
        path:'/task/:id',
        name:'task',
        component:()=>import('../pages/Task/index.vue')
    },
]

export const router = createRouter({
    history:createWebHistory(),
    routes
})

