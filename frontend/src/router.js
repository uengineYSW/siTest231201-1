
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import 소비자관리의류상품Manager from "./components/listers/소비자관리의류상품Cards"
import 소비자관리의류상품Detail from "./components/listers/소비자관리의류상품Detail"

import 판매자관리상품관리Manager from "./components/listers/판매자관리상품관리Cards"
import 판매자관리상품관리Detail from "./components/listers/판매자관리상품관리Detail"

import 관리자지원서비스운영Manager from "./components/listers/관리자지원서비스운영Cards"
import 관리자지원서비스운영Detail from "./components/listers/관리자지원서비스운영Detail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/소비자관리/의류상품',
                name: '소비자관리의류상품Manager',
                component: 소비자관리의류상품Manager
            },
            {
                path: '/소비자관리/의류상품/:id',
                name: '소비자관리의류상품Detail',
                component: 소비자관리의류상품Detail
            },

            {
                path: '/판매자관리/상품관리',
                name: '판매자관리상품관리Manager',
                component: 판매자관리상품관리Manager
            },
            {
                path: '/판매자관리/상품관리/:id',
                name: '판매자관리상품관리Detail',
                component: 판매자관리상품관리Detail
            },

            {
                path: '/관리자지원/서비스운영',
                name: '관리자지원서비스운영Manager',
                component: 관리자지원서비스운영Manager
            },
            {
                path: '/관리자지원/서비스운영/:id',
                name: '관리자지원서비스운영Detail',
                component: 관리자지원서비스운영Detail
            },



    ]
})
