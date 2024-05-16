import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import daibanruyuan from '@/views/modules/daibanruyuan/list'
    import wenzhenquyao from '@/views/modules/wenzhenquyao/list'
    import peizhenyuan from '@/views/modules/peizhenyuan/list'
    import guahaoyuyue from '@/views/modules/guahaoyuyue/list'
    import daiqubaogao from '@/views/modules/daiqubaogao/list'
    import wenzhenpaidui from '@/views/modules/wenzhenpaidui/list'
    import shuyepeihu from '@/views/modules/shuyepeihu/list'
    import keshixinxi from '@/views/modules/keshixinxi/list'
    import yuyuepeizhenyuan from '@/views/modules/yuyuepeizhenyuan/list'
    import daibanchuyuan from '@/views/modules/daibanchuyuan/list'
    import yonghu from '@/views/modules/yonghu/list'
    import yisheng from '@/views/modules/yisheng/list'
    import yishengzhenzhi from '@/views/modules/yishengzhenzhi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/daibanruyuan',
        name: '代办入院',
        component: daibanruyuan
      }
      ,{
	path: '/wenzhenquyao',
        name: '问诊取药',
        component: wenzhenquyao
      }
      ,{
	path: '/peizhenyuan',
        name: '陪诊员',
        component: peizhenyuan
      }
      ,{
	path: '/guahaoyuyue',
        name: '挂号预约',
        component: guahaoyuyue
      }
      ,{
	path: '/daiqubaogao',
        name: '代取报告',
        component: daiqubaogao
      }
      ,{
	path: '/wenzhenpaidui',
        name: '问诊排队',
        component: wenzhenpaidui
      }
      ,{
	path: '/shuyepeihu',
        name: '输液陪护',
        component: shuyepeihu
      }
      ,{
	path: '/keshixinxi',
        name: '科室信息',
        component: keshixinxi
      }
      ,{
	path: '/yuyuepeizhenyuan',
        name: '预约陪诊员',
        component: yuyuepeizhenyuan
      }
      ,{
	path: '/daibanchuyuan',
        name: '代办出院',
        component: daibanchuyuan
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/yisheng',
        name: '医生',
        component: yisheng
      }
      ,{
	path: '/yishengzhenzhi',
        name: '医生诊治',
        component: yishengzhenzhi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '系统首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
