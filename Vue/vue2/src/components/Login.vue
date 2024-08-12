<template>
  <div class="fullscreen-bg">
    <div class="login-container">
      <div class="left-panel">
        <img src="@/images/img.png" alt="Login Image" class="login-image" />
      </div>
      <div class="right-panel">
        <el-form ref="form" :model="form" label-width="80px">
          <el-form-item label="用户名">
            <el-input v-model="form.username"></el-input>
          </el-form-item>
          <el-form-item label="密码">
            <el-input type="password" v-model="form.password"></el-input>
          </el-form-item>
          <el-form-item>
            <el-button type="primary" @click="onSubmit">登录</el-button>
          </el-form-item>
        </el-form>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      form: {
        username: '',
        password: ''
      }
    };
  },
  methods: {
    onSubmit() {
      // 处理登录逻辑
      console.log('提交的表单数据：', this.form);
    }
  }
};
</script>

<style scoped>
.fullscreen-bg {
  display: flex;
  justify-content: center;
  align-items: center;
  position: fixed;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  background-image: url('@/images/LoginBackground.png'); /* 全屏背景图片 */
  background-size: cover; /* 图片填充覆盖整个屏幕 */
  background-position: center center;
}

.login-container {
  background-color: antiquewhite;
  display: flex;
  width: 600px;
  height: 600px;
}

.left-panel, .right-panel {
  flex: 1;
  display: flex;
  align-items: center;
}

.left-panel {
  justify-content: center;
}


.login-image {
  width: 300px; /* 图片宽度，根据实际图片尺寸调整 */
  height: 600px;
}
</style>
